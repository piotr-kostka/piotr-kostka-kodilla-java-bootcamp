package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public void findCompany(final String nameFragment) throws FacadeException {
        boolean wasError = false;
        LOGGER.info("Searching company by fragment: " + nameFragment);
        List<Company> companies = companyDao.findCompanyByNameFragment("%" + nameFragment + "%");
        if (companies.size() > 0) {
            LOGGER.info("Companies found: ");
            for (Company company : companies) {
                System.out.println(company.getName());
            }
        } else {
            LOGGER.error(FacadeException.ERR_NO_COMPANY);
            wasError = true;
            throw new FacadeException(FacadeException.ERR_NO_COMPANY);
        }
    }

    public void findEmployee(final String lastnameFragment) throws FacadeException {
        boolean wasError = false;
        LOGGER.info("Searching employee by lastname fragment: " + lastnameFragment);
        List<Employee> employees = employeeDao.findEmployeeByLastnameFragment("&" + lastnameFragment + "&");
        if (employees.size() > 0) {
            LOGGER.info("Employees found: ");
            for (Employee employee : employees) {
                System.out.println(employee.getLastname() + " " + employee.getFirstname());
            }
        } else {
            LOGGER.error(FacadeException.ERR_NO_EMPLOYEE);
            wasError = true;
            throw new FacadeException(FacadeException.ERR_NO_EMPLOYEE);
        }
    }
}

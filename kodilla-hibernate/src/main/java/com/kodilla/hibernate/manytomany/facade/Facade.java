package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Facade {
    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompany(final String nameFragment) throws FacadeException {
        boolean wasError = false;
        List<Company> companies = companyDao.findCompanyByNameFragment("%" + nameFragment + "%");
        if (companies.size() > 0) {
            return companies;
        } else {
            LOGGER.error(FacadeException.ERR_NO_COMPANY);
            wasError = true;
            throw new FacadeException(FacadeException.ERR_NO_COMPANY);
        }
    }

    public List<Employee> findEmployee(final String lastnameFragment) throws FacadeException {
        boolean wasError = false;
        List<Employee> employees = employeeDao.findEmployeeByLastnameFragment("%" + lastnameFragment + "%");
        if (employees.size() > 0) {
            return employees;
        } else {
            LOGGER.error(FacadeException.ERR_NO_EMPLOYEE);
            wasError = true;
            throw new FacadeException(FacadeException.ERR_NO_EMPLOYEE);
        }
    }
}

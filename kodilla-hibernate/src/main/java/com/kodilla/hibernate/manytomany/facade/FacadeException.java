package com.kodilla.hibernate.manytomany.facade;

public class FacadeException extends Exception{
    public static String ERR_NO_COMPANY = "Company does not exist!";
    public static String ERR_NO_EMPLOYEE = "Employee does not exist!";

    public FacadeException(String message) {
        super(message);
    }
}

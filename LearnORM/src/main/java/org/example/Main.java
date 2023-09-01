package org.example;

public class Main {
    public static void main(String[] args) {

        EmployeeDao employeeDao = new EmployeeDao();

        employeeDao.delete(3L);

        System.out.println(employeeDao.list());

        employeeDao.closeSession();
    }
}
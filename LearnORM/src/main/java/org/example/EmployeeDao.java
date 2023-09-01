package org.example;

import org.hibernate.Session;

import java.util.List;

public class EmployeeDao implements EmployeeRepo {

    AppDatabase appDatabase = new AppDatabase();
    Session session = appDatabase.getSession();

    @Override
    public void save(Employee employee) {
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
    }

    @Override
    public void update(Employee employee) {
        session.beginTransaction();
        session.update(employee);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Long id) {
        session.beginTransaction();
        Employee employee = session.get(Employee.class, id);
        session.delete(employee);
        session.getTransaction().commit();
    }

    @Override
    public Employee get(Long id) {
        session.beginTransaction();
        Employee employee = session.get(Employee.class, id);
        session.getTransaction().commit();
        return employee;
    }

    @Override
    public List<Employee> list() {
        session.beginTransaction();
        List<Employee> employees = session.createQuery("from Employee").list();
        session.getTransaction().commit();
        return employees;
    }

    public void closeSession() {
        session.close();
    }
}

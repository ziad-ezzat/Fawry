package org.example;

import java.util.List;

public interface EmployeeRepo{
    public void save(Employee employee);

    public void update(Employee employee);

    public void delete(Long id);

    public Employee get(Long id);

    public List<Employee> list();
}

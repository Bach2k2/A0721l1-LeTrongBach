package service;

import model.Employee;

import java.util.List;

public interface IEmployeeManagement {
    List<Employee> getEmployeeList();
    Employee getEmployeeById(int id);
    boolean createEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(Employee employee);
    List<Employee> searchByName(Employee employee);

}

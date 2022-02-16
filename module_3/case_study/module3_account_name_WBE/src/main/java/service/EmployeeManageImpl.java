package service;

import model.Employee;
import repository.DBRepository;
import repository.employee.EmRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManageImpl implements IEmployeeManagement {
    EmRepository emRepository=new EmRepository();
    @Override
    public List<Employee> getEmployeeList() {
        List<Employee> employees=emRepository.selectAllEmployee();
        return employees;
    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee employee=emRepository.selectEmployeeById(id);
        return employee;
    }

    @Override
    public boolean createEmployee(Employee employee) {
        if(employee!=null)
        {
            emRepository.insertEmployee(employee);
            return true;
        }
       return false;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        if(employee!=null)
        {
            updateEmployee(employee);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteEmployee(Employee employee) {
        if(employee!=null)
        {
            deleteEmployee(employee);
            return true;
        }
        return false;
    }

    @Override
    public List<Employee> searchByName(Employee employee) {
        List<Employee> employees=new ArrayList<>();

        return employees;
    }
}

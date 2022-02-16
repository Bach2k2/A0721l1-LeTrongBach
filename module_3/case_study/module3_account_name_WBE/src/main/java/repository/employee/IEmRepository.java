package repository.employee;

import model.Employee;
import repository.DBRepository;

import java.util.List;

public interface IEmRepository {
    List<Employee> selectAllEmployee();
    Employee selectEmployeeById(int id);
    void insertEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(Employee employee);
    List<Employee> searchByName(String name);
}

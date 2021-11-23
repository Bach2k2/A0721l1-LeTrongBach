package FURAMA_RESORT_PROJECT.services;

public interface EmployeeService extends Service {

    void updateObj(String name, int choice);
    boolean searchObj(String name);

    void deleteObj(String name);

    int indexObj(String name);

}

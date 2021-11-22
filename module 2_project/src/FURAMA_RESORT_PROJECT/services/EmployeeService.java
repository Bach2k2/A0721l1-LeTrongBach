package FURAMA_RESORT_PROJECT.services;

public interface EmployeeService extends Service {

    public void updateObj(String name, int choice);
    public boolean searchObj(String name);

    public void deleteObj(String name);

    public int indexObj(String name);

}

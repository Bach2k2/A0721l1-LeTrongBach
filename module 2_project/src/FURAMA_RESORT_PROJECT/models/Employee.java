package FURAMA_RESORT_PROJECT.models;

public class Employee extends Person{
    int MNV;
    String level;
    String position;
    double salary;
    private static int takeValue=100;
    private void increaseId()
    {
        this.MNV=takeValue++;
    }
    public Employee(String name, String dateOfBirth, boolean gender, String CMND, String email, String phoneNum, String level, String position, double salary) {
        super(name, dateOfBirth, gender, CMND, email, phoneNum);
        increaseId();
        this.level = level;
        this.position = position;
        this.salary = salary;
    }
    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "MNV=" + MNV +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

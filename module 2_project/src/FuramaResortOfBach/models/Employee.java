package FuramaResortOfBach.models;

public class Employee extends Person {
    private int employeeId;
    private String level;
    private String position;
    private double salary;
    private static int takeValue=100;
    private void increaseId()
    {
        this.employeeId=takeValue++;
    }

    public Employee() {
    }

    public Employee(String name, String dateOfBirth, boolean gender, int personId, String email, String phoneNum, String level, String position, double salary) {
        super(name, dateOfBirth, gender, personId, email, phoneNum);
        increaseId();
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName()
    {
        return this.name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

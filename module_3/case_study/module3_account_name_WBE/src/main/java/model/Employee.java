package model;

public class Employee {
    private int emId;
    private String name;
    private String birthday;
    private String idCard;
    private double salary;
    private String phone;
    private String email;
    private String address;
    private int posId;
    private int eDId;
    private int divisionId;
    private String userName;

    public Employee(int emId, String name, String birthday, String idCard, double salary, String phone, String email, String address, int posId, int eDId, int divisionId, String userName) {
        this.emId = emId;
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.posId = posId;
        this.eDId = eDId;
        this.divisionId = divisionId;
        this.userName = userName;
    }

    public Employee(int emId, String name, String birthday, String idCard, double salary, String phone, String email, String address, int posId, int eDId, int divisionId) {
        this.emId = emId;
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.posId = posId;
        this.eDId = eDId;
        this.divisionId = divisionId;
        this.userName="";
    }

    public int getEmId() {
        return emId;
    }

    public void setEmId(int emId) {
        this.emId = emId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPosId() {
        return posId;
    }

    public void setPosId(int posId) {
        this.posId = posId;
    }

    public int getEDId() {
        return eDId;
    }

    public void setEDId(int eDId) {
        this.eDId = eDId;
    }

    public int getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(int divisionId) {
        this.divisionId = divisionId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

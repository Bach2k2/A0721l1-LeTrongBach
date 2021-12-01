package FURAMA_RESORT_PROJECT.models;

public class Person {
    protected String name;
    protected String dateOfBirth;
    protected boolean gender;
    protected String cmnd;
    protected String email;
    protected String phoneNum;

    public Person(String name, String dateOfBirth, boolean gender, String CMND, String email, String phoneNum) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        cmnd = CMND;
        this.email = email;
        this.phoneNum = phoneNum;
    }

}

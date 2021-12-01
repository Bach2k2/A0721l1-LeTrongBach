package FuramaResortOfBach.models;

public abstract class Person {
    protected String name;
    protected String dateOfBirth;
    protected boolean gender;
    protected int personId;
    protected String email;
    protected String phoneNum;

    public Person() {
    }

    public Person(String name, String dateOfBirth, boolean gender, int personId, String email, String phoneNum) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.personId = personId;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}

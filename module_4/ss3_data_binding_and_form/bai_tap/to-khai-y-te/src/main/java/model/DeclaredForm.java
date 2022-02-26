package model;

public class DeclaredForm {
    private String name;
    private int yearBirth;
    private String gender;

    private String nationality;
    private String identityCard;
    private String transportName;
    private String transportId;
    private int seatNum;
    private String departureDate;
    private String returnDate;
    private String _14DaysAgo;
    private String city;
    private String district;
    private String ward;
    private String currentAddress;
    private String phoneNumber;
    private String email;
    private Boolean[] symptom;
    private Boolean[] history;

    public String get_14DaysAgo() {
        return _14DaysAgo;
    }

    public void set_14DaysAgo(String _14DaysAgo) {
        this._14DaysAgo = _14DaysAgo;
    }

    public DeclaredForm(String name, int yearBirth, String gender, String nationality, String identityCard, String transportName, String transportId, int seatNum, String departureDate, String returnDate, String _14DaysAgo, String city, String district, String ward, String currentAddress, String phoneNumber, String email, Boolean[] symptom, Boolean[] history) {
        this.name = name;
        this.yearBirth = yearBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.identityCard = identityCard;
        this.transportName = transportName;
        this.transportId = transportId;
        this.seatNum = seatNum;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this._14DaysAgo = _14DaysAgo;
        this.city = city;
        this.district = district;
        this.ward = ward;
        this.currentAddress = currentAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.symptom = symptom;
        this.history = history;
    }

    public DeclaredForm() {
    }

    public DeclaredForm(String name, int yearBirth, String gender, String nationality, String identityCard, String transportName, String transportId, int seatNum, String departureDate, String returnDate, String city, String district, String ward, String currentAddress, String phoneNumber, String email, Boolean[] symptom, Boolean[] history) {
        this.name = name;
        this.yearBirth = yearBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.identityCard = identityCard;
        this.transportName = transportName;
        this.transportId = transportId;
        this.seatNum = seatNum;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.city = city;
        this.district = district;
        this.ward = ward;
        this.currentAddress = currentAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.symptom = symptom;
        this.history = history;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public String getTransportId() {
        return transportId;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean[] getSymptom() {
        return symptom;
    }

    public void setSymptom(Boolean[] symptom) {
        this.symptom = symptom;
    }

    public Boolean[] getHistory() {
        return history;
    }

    public void setHistory(Boolean[] history) {
        this.history = history;
    }
}

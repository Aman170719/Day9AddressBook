package com.AddressBook;

public class Address {

    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String email;
    private String zip;
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity(String c) {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail(String s) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZip(String z) {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getPhoneNumber(String PN) {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "AddressBook [ First Name = " + firstName + "\n" + "Last Name = " + lastName + "\n"+ "City Name or Location = " +city+
                "\n" +  "State Name = " +state+ "\n" + "Zip Code = "+ zip + "\n" +"Email = " +email+"\n" + "Phone Number = " +phoneNumber+ "]";
    }
}
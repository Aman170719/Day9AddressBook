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

    public void getCity(String city) {
       this.city = city;
    }

    public String setCity(String city) {
        this.city = city;
        return city;
    }

    public void getState(String state) {
        this.state = state;
    }

    public String setState(String state) {
        this.state = state;
        return state;
    }

    public String getEmail(String email) {
        return email;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }

    public String getZip(String zip) {
        return zip;
    }

    public String setZip(String zip) {
        this.zip = zip;
        return zip;
    }

    public String getPhoneNumber(String phoneNumber) {
        return phoneNumber;
    }

    public String setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }
    public String toString() {
        return "[First Name = " + firstName + "\n" + "Last Name = " + lastName + "\n" + "City Name or Location = " + city +
                "\n" + "State Name = " + state + "\n" + "Zip Code = " + zip + "\n" + "Email = " + email + "\n" + "Phone Number = " + phoneNumber + "]";
    }
}
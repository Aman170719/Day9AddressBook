package com.AddressBook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {

        System.out.println("Welcome to the address Book");
        Address address1 = new Address();
        ArrayList<Address> list = new ArrayList<Address>();
        //
        Scanner scan = new Scanner(System.in);
        // Taking Inputs from the User
        System.out.println("Enter Your First Name");
        String FA = scan.nextLine();
        address1.setFirstName(FA);
        String firstName = address1.getFirstName();
        //
        System.out.println("Enter Your Last Name");
        address1.setLastName(scan.nextLine());
        //
        System.out.println("Enter Your City or Location");
        address1.getCity(scan.nextLine());
        //
        System.out.println("Enter Your State");
        address1.setState(scan.nextLine());
        //
        System.out.println("Enter Your Zip Code");
        address1.getZip(scan.nextLine());
        //
        System.out.println("Enter Your Email Address");
        address1.getEmail(scan.nextLine());
        //
        System.out.println("Enter Your Phone Number");
        address1.getPhoneNumber(scan.nextLine());
        //
        list.add(address1);

        System.out.println("Details are " + list);
    }
}

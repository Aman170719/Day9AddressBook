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
        while (true) {
            System.out.println("Choose option which you want to Perform");
            System.out.println("Press 1 for Creating New Address \nPress 2 to View All the Address"
            + "\nPress 3 to Edit the Existing address");
            int option = Integer.parseInt(scan.nextLine());
            switch (option) {
                case 1:
                    // Taking Inputs from the User
                    System.out.println("Enter Your First Name");
                    String FA = scan.nextLine();
                    address1.setFirstName(FA);
                    String firstName = address1.getFirstName();
                    //
                    System.out.println("Enter Your Last Name");
                    address1.setLastName(scan.nextLine());
                    String LastName = address1.getLastName();
                    //
                    System.out.println("Enter Your City or Location");
                    address1.getCity(scan.nextLine());
                    //
                    System.out.println("Enter Your State");
                    address1.getState(scan.nextLine());
                    //
                    System.out.println("Enter Your Zip Code");
                    address1.setZip(scan.nextLine());
                    //
                    System.out.println("Enter Your Email Address");
                    address1.setEmail(scan.nextLine());
                    //
                    System.out.println("Enter Your Phone Number");
                    address1.setPhoneNumber(scan.nextLine());
                    //
                    list.add(address1);

                    case2:
                    System.out.println("First Name \n Last Name \n City \n State \n Zip Code \n Email Address \n Phone Number");
                    for (Address address : list) {
                        System.out.println(address1);
                    }
                    System.out.println("\n\n");
                    break;
                case 3:
                    System.out.println("Editing Records");
                    System.out.println("Enter the First Name which you want to Edit");
                    for(int i=0;i<list.size();i++){
                        address1=list.get(i);
                        if(scan.nextLine().equals(address1.getFirstName())){
                            System.out.println("Press 1 to Change first Name");
                            System.out.println("Press 2 to Change Name");
                            System.out.println("Press 3 to Change City ");
                            System.out.println("Press 4 to Change State ");
                            System.out.println("Press 5 to Change Zip ");
                            System.out.println("Press 6 to Change Email ");
                            System.out.println("Press 7 to Change Phone Number");
                            int option2 = scan.nextInt();
                            scan.nextLine();
                            switch (option2) {
                                case 1:
                                    System.out.println("Enter Your First Name");
                                    String FirstName = scan.nextLine();
                                    address1.setFirstName(FirstName);
                                case 2:
                                    System.out.println("Enter Your Last Name");
                                    address1.setLastName(scan.nextLine());
                                case 3:
                                    System.out.println("Enter Your City or Location");
                                    address1.getCity(scan.nextLine());
                                case 4:
                                    System.out.println("Enter Your State");
                                    address1.getState(scan.nextLine());
                                case 5:
                                    System.out.println("Enter Your Zip Code");
                                    address1.setZip(scan.nextLine());
                                case 6:
                                    System.out.println("Enter Your Email Address");
                                    address1.setEmail(scan.nextLine());
                                case 7:
                                    System.out.println("Enter Your Phone Number");
                                    address1.setPhoneNumber(scan.nextLine());
                                    //
                                    list.add(address1);
                            }
                        }
                        else{
                            System.out.println("Details Not Found");
                            }
                    }
                    default:
                    System.out.println("Enter correct option");
            }
            System.out.println("Details are " + list);
        }
    }
}
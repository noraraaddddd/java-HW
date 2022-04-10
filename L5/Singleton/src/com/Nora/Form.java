package com.Nora;

import java.util.Scanner;

public class Form {
    private static Form form  = new Form();
    public static  Form getInstance(){
        return form;
    }
    private Form(){}
    public void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Date of Birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();


        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(dateOfBirth);
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(username);
        System.out.println(password);
        }


    }





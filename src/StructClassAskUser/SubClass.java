package StructClassAskUser;


import java.util.Scanner;

public class SubClass {

    User user;

    public void askUSer() {
        user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        user.name = scanner.next();
        System.out.println("Enter address");
        user.address = scanner.next();
        System.out.println("Enter phone number");
        user.phoneNumber = scanner.nextInt();
        System.out.println("Enter salary");
        user.salary = scanner.nextInt();
    }


    public void printUser() {
        System.out.println("The name of user is " + user.name);
        System.out.println("The address of user is " + user.address);
        System.out.println("The phoneNumber of user is " + user.phoneNumber);
        System.out.println("The salary of user is " + user.salary);
    }


}

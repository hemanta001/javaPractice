package StructClassAskUser;


import java.util.Scanner;

public class SubClass {

    User user;
    public void askUSer(){
        user=new User();
        Scanner scanner=new Scanner(System.in);
        user.name=scanner.next();
        System.out.println("The name of staff is "+user.name);
        user.address=scanner.next();
        System.out.println("The address of staff is "+user.address);
        user.phoneNumber = scanner.nextInt();
        System.out.println("The Phone Number of staff is "+user.phoneNumber);
         user.salary = scanner.nextInt();
        System.out.println("The salary of staff is "+user.salary);
    }


    public User getUser() {
        return user;
    }
}

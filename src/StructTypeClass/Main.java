package StructTypeClass;

public class Main {
    public static void main(String[] args) {
        UserService userService=new UserService();
        userService.setUser();
        User user=userService.getUser();
        System.out.println("The firstName of user is "+user.firstName);
        System.out.println("The lastName of user is "+user.lastName);
        System.out.println("The gender of user is "+user.gender);
        System.out.println("The salary of user is "+user.salary);
        System.out.println("The age of user is "+user.age);
        System.out.println("The contact number of user is "+user.phoneNumber);
        System.out.println("Is user educated? "+user.isEducated);
    }
}

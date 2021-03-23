package GetterSetter;

import java.util.Scanner;

public class StudentService {
    Student student;

    public void setStudent() {
        student = new Student();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first name");
        String firstName= scanner.next();
        System.out.println("enter the second name");
        String secondName= scanner.next();
        System.out.println("enter the gender");
        String gender= scanner.next();
        System.out.println("enter the roll no");
        int rollNumber= scanner.nextInt();
        System.out.println("enter the age");
        int age= scanner.nextInt();

    }
    public void getStudent(){
        System.out.println("The first name is "+student.getFirstName());
        System.out.println("The last name is "+student.getLastName());
       System.out.println("The last name is "+student.getGender());
        System.out.println("The last name is "+student.getAge());
        System.out.println("The last name is "+student.getRollNumber());
    }

}

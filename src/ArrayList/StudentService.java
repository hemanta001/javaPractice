package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    Student student;
    List<Student> studentList = new ArrayList<>();

    public void setStudent() {
        student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of array to print");
        String[] string = new String[scanner.nextInt()];
        for(String str: string)   {
            scanner = new Scanner(System.in);
            System.out.println("enter the first name");
            String firstName = scanner.next();
            student.setFirstName(firstName);
            System.out.println("enter the second name");
            String secondName = scanner.next();
            student.setLastName(secondName);
            System.out.println("enter the gender");
            String gender = scanner.next();
            student.setGender(gender);
            System.out.println("enter the roll no");
            int rollNumber = scanner.nextInt();
            student.setRollNumber(rollNumber);
            System.out.println("enter the age");
            int age = scanner.nextInt();
            student.setAge(age);
            studentList.add(student);
        }

    }

    public void getStudent() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("The first name is " + studentList.get(i).getFirstName());
            System.out.println("The last name is " + studentList.get(i).getLastName());
            System.out.println("The gender is " + studentList.get(i).getGender());
            System.out.println("The age is " + studentList.get(i).getAge());
            System.out.println("The roll no is " + studentList.get(i).getRollNumber());
        }

    }

}

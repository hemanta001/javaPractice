package GetterSetter;

public class StudentService {
    Student student;

    public void setStudent() {
        student = new Student();
        String firstName = "Hemanta";
        student.setFirstName(firstName);
        String lastName = "Ghimire";
        student.setLastName(lastName);
    }
    public void getStudent(){
        System.out.println("The first name is "+student.getFirstName());
        System.out.println("The last name is "+student.getLastName());
    }

}

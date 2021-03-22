package GetterSetter;

public class Student {
    private String firstName;
    private String lastName;
    String gender;
    int rollNumber;
    int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }

}

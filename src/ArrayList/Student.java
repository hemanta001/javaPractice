package ArrayList;

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
    public  void setGender(String gender){
        this.gender= gender;
    }
    public  void setRollNumber(int rollNumber){
        this.rollNumber=rollNumber;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }
}

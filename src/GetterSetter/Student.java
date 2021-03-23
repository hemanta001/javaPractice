package GetterSetter;

public class Student {
    private String firstName;
    private String lastName;
    String gender;
    int rollNumber;
    int age;

    public void setFirstName() {
        this.firstName = firstName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }
    public  void setGender(){
        this.gender= gender;
    }
    public  void setRollNumber(){
        this.rollNumber=rollNumber;

    }

    public void setAge() {
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

package StructTypeClass;

public class UserService {

    User user;

    public void setUser(){

        user=new User();
        user.firstName="Gaurab";
        user.lastName="Sharma";
        user.gender="male";
        user.age=20;
        user.phoneNumber="+977981234567";
        user.isEducated=true;
        user.salary=23456.50f;
    }

    public User getUser(){
        return user;
    }

}

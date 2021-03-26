package ArraylistRemove;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> userList=new ArrayList<>();
    User user;
    public void addUser(){

        user=new User();
        user.setFullName("Hemanta1");
        user.setAddress("Sinamangal1");
        user.setAge(281);
        user.setOccupation("Engineer1");
        userList.add(user);
        user=new User();
        user.setFullName("Hemanta2");
        user.setAddress("Sinamangal2");
        user.setAge(282);
        user.setOccupation("Engineer2");
        userList.add(user);
        user=new User();
        user.setFullName("Hemanta3");
        user.setAddress("Sinamangal3");
        user.setAge(283);
        user.setOccupation("Engineer3");
        userList.add(user);
        user=new User();
        user.setFullName("Hemanta4");
        user.setAddress("Sinamangal4");
        user.setAge(284);
        user.setOccupation("Engineer4");
        userList.add(user);
        System.out.println("---------------------------------Users before remove------------------------------------");
        for(User user:userList){
            System.out.println("The full name is "+user.getFullName());
            System.out.println("The address is "+user.getAddress());
            System.out.println("The occupation is "+user.getOccupation());
            System.out.println("The age is "+user.getAge());
        }
        System.out.println("-----------------------------------------------------------------");

    }

    public void removeAtIndex(){
     userList.remove(0);
    }
    public void afterRemove(){
        System.out.println("---------------------------Users after remove---------------------------");
        for(User user:userList){
            System.out.println("The full name is "+user.getFullName());
            System.out.println("The address is "+user.getAddress());
            System.out.println("The occupation is "+user.getOccupation());
            System.out.println("The age is "+user.getAge());
        }
        System.out.println("-----------------------------------------------------------------");
    }
    public void addStudentAtFirst(){
        user=new User();
        user.setFullName("Hemanta5");
        user.setAddress("Sinamangal5");
        user.setAge(285);
        user.setOccupation("Engineer5");
        userList.add(1,user);
    }
    public void afterAddingStudentAtFirst(){

        System.out.println("---------------------------Users after adding student at first---------------------------");
        for(User user:userList){
            System.out.println("The full name is "+user.getFullName());
            System.out.println("The address is "+user.getAddress());
            System.out.println("The occupation is "+user.getOccupation());
            System.out.println("The age is "+user.getAge());
        }
        System.out.println("-----------------------------------------------------------------");

    }
}

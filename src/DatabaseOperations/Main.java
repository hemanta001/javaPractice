package DatabaseOperations;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        //Display inserted user
        User insertedUser = userService.insertUser();
        System.out.println("-----inserted user is-------");
        userService.displayUser(insertedUser);

        //Display list of values
        List<User> userList = userService.readUsers();
        System.out.println("-----userList-------");
        for (User user : userList) {
            userService.displayUser(user);
        }
    }
}

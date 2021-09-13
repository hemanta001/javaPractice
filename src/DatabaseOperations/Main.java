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

        User updatedUser = userService.updateUser();
        System.out.println("-----updated user is-------");
        userService.displayUser(updatedUser);

        User userFoundById = userService.readUserById();
        System.out.println("-----found user is-------");
        if (userFoundById != null)
            userService.displayUser(userFoundById);
        else
            System.out.println("user not found by id");

        int i = userService.deleteUserById();
        if (i > 0)
            System.out.println("successfully deleted");
        else
            System.out.println("unable to delete");
    }
}

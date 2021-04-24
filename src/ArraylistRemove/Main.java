package ArraylistRemove;

public class Main {
    public static void main(String[] args) {
        UserService userService=new UserService();
        userService.addUser();
        userService.removeAtIndex();
        userService.afterRemove();
        userService.addStudentAtFirst();
        userService.afterAddingStudentAtFirst();
    }

}

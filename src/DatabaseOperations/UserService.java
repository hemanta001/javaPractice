package DatabaseOperations;

import mysqlConnector.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    public List<User> readUsers() {
        List<User> userList = new ArrayList<>();
        try {
            String query = "select * from user";
            Connection connection = new DatabaseConnection().connectToDB();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            User user = null;
            while (rs.next()) {
                user = new User();
                user.setId(rs.getLong("id"));
                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setEmail(rs.getString("email"));
                user.setUsername(rs.getString("username"));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public User insertUser() {
        User user = askUserFromKeyBoard();
        try {
            Connection connection = new DatabaseConnection().connectToDB();
            String query = " insert into user (firstName, lastName, email, username)"
                    + " values (?, ?, ?, ?)";
            PreparedStatement preparedStmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStmt.setString(1, user.getFirstName());
            preparedStmt.setString(2, user.getLastName());
            preparedStmt.setString(3, user.getEmail());
            preparedStmt.setString(4, user.getUsername());
            preparedStmt.execute();
            ResultSet rs = preparedStmt.getGeneratedKeys();
            if (rs.next()) {
                user.setId(rs.getLong(1));
            }
            connection.close();
            return user;
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
            return null;
        }
    }

    public User askUserFromKeyBoard() {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = scanner.nextLine();
        user.setFirstName(firstName);
        System.out.println("Enter last name");
        String lastName = scanner.nextLine();
        user.setLastName(lastName);
        System.out.println("Enter email");
        String email = scanner.nextLine();
        user.setEmail(email);
        System.out.println("Enter username");
        String username = scanner.nextLine();
        user.setUsername(username);
        return user;
    }

    public void displayUser(User user) {
        System.out.print("ID: " + user.getId());
        System.out.print(", FIRSTNAME: " + user.getFirstName());
        System.out.print(", LASTNAME: " + user.getLastName());
        System.out.println(", EMAIL: " + user.getEmail());
        System.out.println(", USERNAME: " + user.getUsername());
    }
}



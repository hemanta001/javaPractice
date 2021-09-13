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
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
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
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public User insertUser() {
        User user = askUserFromKeyBoard("insert");
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

    public User updateUser() {
        User user = askUserFromKeyBoard("update");
        try {
            String query = "update user set firstName = ?,lastName=?,email=?,username=? where id = ?";
            Connection connection = new DatabaseConnection().connectToDB();
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, user.getFirstName());
            preparedStmt.setString(2, user.getLastName());
            preparedStmt.setString(3, user.getEmail());
            preparedStmt.setString(4, user.getUsername());
            preparedStmt.setLong(5, user.getId());
            preparedStmt.execute();
            connection.close();
            return user;
        } catch (SQLException e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
            return null;
        }
    }

    public User readUserById() {
        System.out.println("Enter id to get user");
        User user = null;
        try {
            String query = "select * from user where id=?";
            Connection connection = new DatabaseConnection().connectToDB();
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setLong(1, askIdFromKeyBoard());
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                user = new User();
                user.setId(rs.getLong("id"));
                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setEmail(rs.getString("email"));
                user.setUsername(rs.getString("username"));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public int deleteUserById() {
        int i=0;
        try {
            String query = "delete from user where id=?";
            Connection connection = new DatabaseConnection().connectToDB();
            System.out.println("Enter id to delete user");
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setLong(1, askIdFromKeyBoard());
            i = preparedStmt.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public Long askIdFromKeyBoard() {
        Scanner scanner = new Scanner(System.in);
        Long id = scanner.nextLong();
        return id;
    }

    public User askUserFromKeyBoard(String action) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        if (action.equals("update")) {
            System.out.println("Enter id to update");
            user.setId(askIdFromKeyBoard());
        }
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



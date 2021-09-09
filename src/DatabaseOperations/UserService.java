package DatabaseOperations;

import mysqlConnector.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserService {

    public void readUsers() {
        try {
            String query="select * from user";
            Connection connection=new DatabaseConnection().connectToDB();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                //Display values
                System.out.print("ID: " + rs.getLong("id"));
                System.out.print(", FIRSTNAME: " + rs.getString("firstName"));
                System.out.print(", LASTNAME: " + rs.getString("lastName"));
                System.out.println(", EMAIL: " + rs.getString("email"));
                System.out.println(", USERNAME: " + rs.getString("username"));

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

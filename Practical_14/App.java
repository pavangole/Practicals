package Practical_14;

import java.sql.*;
import java.util.Scanner;

import static java.lang.System.out;

public class App {

    private PreparedStatement stmt;

    
    public static void main(String[] args) throws Exception {

        App app = new App();
        app.connectDatabase();

        
    }

    
    private void connectDatabase() {
        String url = "jdbc:mysql://localhost:3306/server_management";
        String username = "root";
        Scanner in = new Scanner(System.in);
        out.print("Enter Database Password :- ");
        String password = in.next();
        try  {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement stmt=connection.prepareStatement("insert into signup values(?,?)");  
            stmt.setString(1,"aldfjla");//1 specifies the first parameter in the query  
            stmt.setString(2,"ajaldfj");  
            stmt.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

package Practical_13;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// write your code here
        String url = "jdbc:mysql://localhost:3306/server_management";
        String username = "root";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Database Password :- ");
        String password = in.next();

        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected! ");
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("select * from signup");

            while(rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2) );
            }
        }
        catch(Exception e){ System.out.println(e.getStackTrace());}
    }

}

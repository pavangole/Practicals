package Practical_15;

import java.sql.*;
import java.util.Scanner;

import static java.lang.System.out;

public class App {

    private Statement stmt;

    public static void main(String[] args) throws Exception {

        App app = new App();
        app.connectDatabase();
        app.deleteAllDataFromDb();

        app.insertInDatabase("thisisnew","youknow");
        app.insertInDatabase("thisisnew1", "youknow1");

        app.printData();

        app.updateStudentById("thisisnew", "youknow");

        app.printData();

        app.deletedStudentById("thisisnew");

        app.printData();
    }

    private void connectDatabase() {
        String url = "jdbc:mysql://localhost:3306/server_management";
        String username = "root";
        Scanner in = new Scanner(System.in);
        out.print("Enter Database Password :- ");
        String password = in.next();
        try  {
            Connection connection = DriverManager.getConnection(url, username, password);
            out.println("Database connected! ");
            this.stmt=connection.createStatement();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void deleteAllDataFromDb(){
        try {
            if (this.stmt == null)
                return;
            String a = "Delete from signup";

            this.stmt.executeUpdate(a);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertInDatabase(String email, String password) {

        try {
            if (this.stmt == null)
                return;

            System.out.println("Inserting Student " + email);

            String a = "insert into signup (EmailID, Password) values( '"+ email + "', '"+ password + "')";
            this.stmt.executeUpdate(a);

            System.out.println("Data Inserted Successfully");
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
   
    public void updateStudentById(String email , String password) {

        try {
            if (this.stmt == null)
                return;
            System.out.println("Updating Data :- ... ");

            String a = "update signup set Password = '"+password+"' where EmailID= '"+password+"' ";
            out.println(a);

            this.stmt.executeUpdate(a);

            System.out.println("Data Updated Successfully");
            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deletedStudentById(String  email){
        try {
            if (this.stmt == null)
                return;
            System.out.println("Deleting data .. ");

            String a = "Delete from signup where EmailID='"+ email + "'";

            this.stmt.executeUpdate(a);

            System.out.println("Data Deleted Successfully");
            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void printData() {
        try {
            ResultSet rs = stmt.executeQuery("select * from signup ;");

            System.out.println("Printing data ..");


            while(rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2) );
            }

            System.out.println("Data Displayed Successfully");
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

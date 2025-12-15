/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DELL
 */
class ConnectionProvider {

    static Connection getCon() {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel", "root", "mridula18");
            return con;
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception for debugging purposes
            return null;
        }
    }

    public static void main(String[] args) {
        Connection con = getCon();

        if (con != null) {
            System.out.println("Connection established successfully!");
            // You can perform database operations here using 'con'
            // For example: con.createStatement().execute("SELECT * FROM your_table");
        } else {
            System.out.println("Failed to establish connection.");
        }
    }
    
}

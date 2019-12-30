/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpas.psi.tubes.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ryan
 */
public class DatabaseUtilities {
    
    public static Connection getConnection() throws SQLException{
        return getConnection("jdbc:mysql://localhost/dbbarang", "root", "");
    
    }

    private static Connection getConnection(String url, String user, String pass) throws SQLException {
       Connection con = null;
       
       try {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection(url, user, pass);
       } catch (ClassNotFoundException | SQLException e) {
           System.err.println(e.getMessage());
       }
       return con;
    }
    
}

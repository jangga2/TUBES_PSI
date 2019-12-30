/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpas.psi.tubes.utilities;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan
 */
public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        Connection con = DatabaseUtilities.getConnection();
        
        if (con != null) {
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } else {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        
        }
    }
}

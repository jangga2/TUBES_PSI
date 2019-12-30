/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpas.psi.tubes.model.data;

import id.ac.unpas.psi.tubes.view.BarangFrame;
import id.ac.unpas.psi.tubes.model.pojo.Barang;
import id.ac.unpas.psi.tubes.utilities.DatabaseUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ryan
 */
public class BarangModel {
    
     public List<Barang> loadBarang() throws SQLException {
        List<Barang> brgList;
        Connection con = DatabaseUtilities.getConnection();
        
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM barang");
            brgList = new ArrayList<>();
                while (rs.next()){
                    Barang brg = new Barang();
                    brg.setIdBarang(rs.getString("id_brg"));
                    brg.setNama(rs.getString("nama_brg"));
                    brg.setHarga(rs.getInt("harga_brg"));
                    brg.setTglMasuk(rs.getString("tgl_masuk"));
                    brg.setTglKeluar(rs.getString("tgl_keluar"));
                    brg.setStok(rs.getInt("stok_brg"));
                    brgList.add(brg);
                }
            
        } finally {
            if (con != null) {
                con.close();
            }
        }
    return brgList;
    }
    
    public int save(Barang brg) throws SQLException {
        Connection con = DatabaseUtilities.getConnection();
        
        try {
            PreparedStatement stat = con.prepareStatement("INSERT INTO barang values(?,?,?,?,?,?)");
            stat.setString(1, brg.getIdBarang());
            stat.setString(2, brg.getNama());
            stat.setInt(3, brg.getHarga());
            stat.setString(4, brg.getTglMasuk());
            stat.setString(5, brg.getTglKeluar());
            stat.setInt(6, brg.getStok());
            return stat.executeUpdate();
        } finally {
            
            if (con != null) {
                con.close();
            }
        }
    }
    public int delete(Barang brg) throws SQLException {
         Connection con = DatabaseUtilities.getConnection();
        try {
            PreparedStatement stat = con.prepareStatement("DELETE FROM barang WHERE id_brg=?");
            stat.setString(1, brg.getIdBarang());
            return stat.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public int update(Barang brg) throws SQLException {
       Connection con = DatabaseUtilities.getConnection();
        try {
            PreparedStatement stat = con.prepareStatement("UPDATE barang SET nama_brg=?, harga_brg=?, stok_brg=?  WHERE id_brg=?");
            stat.setString(1, brg.getNama());
            stat.setInt(2, brg.getHarga());
            stat.setInt(3, brg.getStok());
            stat.setString(4, brg.getIdBarang());
            return stat.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
    
//    public int users (Barang brg) throws SQLException {
//       Connection con = DatabaseUtilities.getConnection();
//        try {
//            PreparedStatement stat = con.prepareStatement("SELECT * FROM users where password = ?");
//            stat.setString(1, brg.getPassword());
//            ResultSet rs = stat.executeQuery();
//            return stat.executeUpdate();
//        } finally {
//            if (con != null) {
//                con.close();
//            }
//        }
//    }
}

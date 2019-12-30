/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpas.psi.tubes.controller;

import com.mysql.jdbc.Statement;
import id.ac.unpas.psi.tubes.model.data.BarangModel;
import id.ac.unpas.psi.tubes.model.pojo.Barang;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Ryan
 */
public class BarangController {
    
    public List<Barang> loadBarang() throws SQLException {
        BarangModel model = new BarangModel();
        return model.loadBarang();
    
    }
    
    public int insert(Barang barang) throws SQLException {
        BarangModel model = new BarangModel();
        return model.save(barang);
        
    }
    
    public int delete(Barang barang) throws SQLException {
        BarangModel model = new BarangModel();
        return model.delete(barang);
    }
    
    public int update(Barang barang) throws SQLException{
        BarangModel model = new BarangModel();
        return model.update(barang);
    }
    
//    public int users(Barang barang) throws SQLException{
//        BarangModel model = new BarangModel();
//        return model.users(barang);
//    }

 

}

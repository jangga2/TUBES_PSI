/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpas.psi.tubes.main;

import id.ac.unpas.psi.tubes.view.BarangKeluarFrame;
import id.ac.unpas.psi.tubes.view.HalamanAwalFrame;
import id.ac.unpas.psi.tubes.view.HalamanMenu;
import java.sql.SQLException;

/**
 *
 * @author Ryan
 */
public class MainProgram {
    
    public static void main(String[] args) throws SQLException {
        new HalamanAwalFrame().setVisible(true);
    }
}

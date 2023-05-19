/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author aleev
 */
public class PruebaBiblioteca {

    public static void main(String[] args) {
        Connection con = Conexion.conectarse();
        String sql = "INSERT INTO LIBRO (ID, NOMBRE, EDICION) VALUES (?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, 1);
//            ps.setString(2, "Java Web");
//            ps.setInt(3, 1);
//            ps.executeUpdate();
//            
//            ps.setInt(1, 2);
//            ps.setInt(3, 2);
//            ps.executeUpdate();
            
            sql = "UPDATE LIBRO SET NOMBRE = ? WHERE ID = ?";
            PreparedStatement psUp = con.prepareStatement(sql);
           psUp.setString(1, "JAVA JDBC");
            psUp.setInt(2, 1);
            psUp.executeUpdate();
            
            psUp.setInt(2, 2);
            psUp.executeUpdate();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
    
}

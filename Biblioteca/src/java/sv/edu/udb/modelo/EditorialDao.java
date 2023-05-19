/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sv.edu.udb.entidades.Categoria;
import sv.edu.udb.entidades.Editorial;

/**
 *
 * @author aleev
 */
public class EditorialDao {
    
     public static List<Editorial> listarEditoriales(){
        List<Editorial> lstEditorial = new ArrayList<>();
        Editorial editorial = null;
        try{
            String sql = "SELECT * FROM EDITORIAL";
            Connection con = Conexion.conectarse();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                editorial = new Editorial();
                editorial.setCodEditorial(rs.getInt("COD_EDITORIAL"));
                editorial.setNombre(rs.getString("NOMBRE"));
                editorial.setTelefono(rs.getString("TELEFONO"));
                editorial.setDireccion(rs.getString("DIRECCION"));
                editorial.setEmail(rs.getString("EMAIL"));
                editorial.setUrl(rs.getString("URL"));
                
                lstEditorial.add(editorial);
            }
        }catch(Exception e){
            System.out.println("Error al obtener editoriales " + e);  
        }
        return lstEditorial;
    }
     
     
        /**
     * Metodo Permite buscar categoria por id
     * @param id
     * @return Editorial
     */
    public static Editorial buscarEditorialPorId(int id){
        Editorial editorial = null;
         try{
            String sql = "SELECT * FROM EDITORIAL WHERE COD_EDITORIAL = ?";
            Connection con = Conexion.conectarse();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                editorial = new Editorial();
                editorial.setCodEditorial(rs.getInt("COD_EDITORIAL"));
                editorial.setNombre(rs.getString("NOMBRE"));
                editorial.setTelefono(rs.getString("TELEFONO"));
                editorial.setDireccion(rs.getString("DIRECCION"));
                editorial.setEmail(rs.getString("EMAIL"));
                editorial.setUrl(rs.getString("URL"));
                
            }
        }catch(Exception e){
            System.out.println("Error al obtener editorial " + e);  
        }
        return editorial;
    }
    
     
     
    public static boolean guardarEditorial(Editorial editorial){
        boolean insercion = false;
        try{
            String sql = "INSERT INTO EDITORIAL (NOMBRE, TELEFONO, DIRECCION, EMAIL, URL) VALUES (?,?,?,?,?)";
            Connection con = Conexion.conectarse();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, editorial.getNombre());
            pst.setString(2, editorial.getTelefono());
            pst.setString(3, editorial.getDireccion());
            pst.setString(4, editorial.getEmail());
            pst.setString(5, editorial.getUrl());
            if(pst.executeUpdate() > 0){
                insercion = true;
            }
        }catch(SQLException ex){
            System.out.println("Error al guardar:" + ex);
            insercion = false;
        }
        return insercion;
    }
    
    public static boolean borrarEditorial(int id){
        boolean bandera=false;
        try{
            String sql = "DELETE FROM EDITORIAL WHERE COD_EDITORIAL = ?";
            Connection con = Conexion.conectarse();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            if(pst.executeUpdate() > 0){
                bandera = true;
            }
        }catch(SQLException ex){
            System.out.println("Error al borrar:" + ex);
            bandera = false; 
        }
        return bandera;
    }
    
    public static boolean modificarEditorial(Editorial editorial){
        boolean bandera=false;
        try{
            String sql = "UPDATE EDITORIAL SET NOMBRE=?,"
                    + " TELEFONO=?, DIRECCION=?, EMAIL=?, URL=? "
                    + "WHERE COD_EDITORIAL = ?";
            Connection con = Conexion.conectarse();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, editorial.getNombre());
            pst.setString(2, editorial.getTelefono());
            pst.setString(3, editorial.getDireccion());
            pst.setString(4, editorial.getEmail());
            pst.setString(5, editorial.getUrl());
            pst.setInt(6, editorial.getCodEditorial());
            if(pst.executeUpdate() > 0){
                bandera = true;
            }
        }catch(SQLException ex){
            System.out.println("Error al modificar:" + ex);
            bandera = false; 
        }
        return bandera;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.vistas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sv.edu.udb.entidades.Alumno;
import sv.edu.udb.modelo.Conexion;

/**
 *
 * @author aleev
 */
public class SelectListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Alumno> lstAlumnos = new ArrayList();
        Connection con = Conexion.conectarse();
        String sql = "select * from ALUMNO";
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setCarnet(rs.getInt("Carnet"));
                alumno.setNombres(rs.getString("NOMBRES"));
                alumno.setApellidos(rs.getString("APELLIDOS"));
                lstAlumnos.add(alumno);
            }
        }catch(SQLException e){
            System.out.println("Error ejecutando consulta: " + e);
        }
        
        for(Alumno alumno: lstAlumnos){             
            System.out.println("------------------------------------");
            System.out.println("Carnet: " + alumno.getCarnet());
            System.out.println("Nombres: " + alumno.getNombres());
            System.out.println("Apellidos: " + alumno.getApellidos());
            System.out.println("------------------------------------");
        }
    }
    
}

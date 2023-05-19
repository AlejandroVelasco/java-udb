package sv.edu.udb.controladores;

import javax.swing.table.DefaultTableModel;
import sv.edu.udb.modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sv.edu.udb.entidades.Alumno;
import javax.swing.JOptionPane;

/**
 *
 * @author aleev
 */
public class AlumnoControl {
    
    private static Connection conn = null;
    
    public static DefaultTableModel cargarTabla(String busqueda){
        conn = Conexion.conectarse();
        String[] titulos = {"CARNET", "NOMBRES", "APELLIDOS"};
        String[] registros = new String[3];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        try{
            String query = "SELECT * FROM ALUMNO WHERE LOWER(NOMBRES)"
                    + " LIKE ? OR LOWER(APELLIDOS) LIKE ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, "%" + busqueda.toLowerCase() + "%");
            pst.setString(2, "%" + busqueda.toLowerCase() + "%");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                registros[0] = String.valueOf(rs.getInt("CARNET"));
                registros[1] = rs.getString("NOMBRES");
                registros[2] = rs.getString("APELLIDOS");
                modelo.addRow(registros);
            }
        }catch (SQLException e){
            System.out.println("Error al cargar datos de la tabla" + e);
        }
        return modelo;
    }
    
    public static void agregarAlumno(Alumno alumno){
        conn = Conexion.conectarse();
        try{
            String query = "INSERT INTO ALUMNO(NOMBRES,APELLIDOS) VALUES (?,?)";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, alumno.getNombres());
            pst.setString(2, alumno.getApellidos());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, 
                    "Alumno registrado exitosamente", "Registro exitoso",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            System.out.println("Error al ingresar alumno: " + e);

        }
    }
    
    public static void modificarAlumno(Alumno alumno){
        conn = Conexion.conectarse();
        try{
            String query = "UPDATE ALUMNO SET NOMBRES=?, APELLIDOS=? WHERE"
                    + " CARNET = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, alumno.getNombres());
            pst.setString(2, alumno.getApellidos());
            pst.setString(3, String.valueOf(alumno.getCarnet()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, 
                    "Alumno modificado exitosamente", "Registro exitoso",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            System.out.println("Error modificando alumno: " + e);

        }
    }
    
    public static void eliminarAlumno(int carnet){
        conn = Conexion.conectarse();
        try{
            String query = "DELETE FROM ALUMNO WHERE CARNET = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, String.valueOf(carnet));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, 
                    "Alumno eliminado exitosamente", "Exito",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            System.out.println("Error borrando alumno: " + e);

        }        
    }
       
}
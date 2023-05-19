package sv.edu.udb.vistas;

import sv.edu.udb.modelo.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author aleev
 */
public class Insert {

    public static void main(String[] args) {
        Connection con = Conexion.conectarse();
        try{
            String insert = "INSERT INTO ALUMNO(NOMBRES, APELLIDOS) "
                    + "VALUES(?,?)";
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setString(1, "Libertad");
            pst.setString(2, "Crespin");
            pst.executeUpdate(); //Para insert, update, delete
            JOptionPane.showMessageDialog(null, "Registro ingresado correctamente");
        }catch(SQLException e){
            System.out.println("Error ejecutando consulta: " + e);
        }
    }
    
}

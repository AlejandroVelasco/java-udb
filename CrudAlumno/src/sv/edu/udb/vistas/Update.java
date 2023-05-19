package sv.edu.udb.vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sv.edu.udb.modelo.Conexion;

/**
 *
 * @author aleev
 */
public class Update {

    public static void main(String[] args) {
        Connection con = Conexion.conectarse();
        try{
            String update = "UPDATE ALUMNO SET NOMBRES = ?,"
                    + " APELLIDOS = ? WHERE CARNET=?";
            PreparedStatement pst = con.prepareStatement(update);
            pst.setString(1, "Ernesto");
            pst.setString(2, "Murcia");
            pst.setInt(3, 5);
            pst.executeUpdate(); //Para insert, update, delete
            JOptionPane.showMessageDialog(null, "Registro actualizado correctamente");
        }catch(SQLException e){
            System.out.println("Error ejecutando consulta: " + e);
        }
    }
    
}

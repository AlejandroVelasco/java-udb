
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
public class Delete {

    public static void main(String[] args) {
                Connection con = Conexion.conectarse();
        try{
            String insert = "DELETE FROM ALUMNO WHERE CARNET=?";
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setInt(1, 5);
            pst.executeUpdate(); //Para insert, update, delete
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
        }catch(SQLException e){
            System.out.println("Error ejecutando consulta: " + e);
        }
    }
    
}

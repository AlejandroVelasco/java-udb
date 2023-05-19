package sv.edu.udb.controladores;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import sv.edu.udb.entidades.Docente;
import sv.edu.udb.modelos.Conexion;

public class DocenteControl {
    
    public static void agregarDocente(Docente docente){
        Connection con = Conexion.conectarse();
        try{
            String call = "{?=call AGREGAR_DOCENTE(?,?,?)}"; 
            CallableStatement pstm = con.prepareCall(call);
            pstm.registerOutParameter(1, Types.VARCHAR);
            pstm.setString(2, docente.getNombre());
            pstm.setString(3, docente.getCorreo());
            pstm.setDate(4, docente.getFechaIngreso());
            ResultSet rs = pstm.executeQuery();
            String respuesta = "";
            while(rs.next()){
                respuesta = rs.getString(1);
            }
            JOptionPane.showMessageDialog(null, respuesta, "INFORMACION",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException | HeadlessException ex){
            System.out.println("Error:" + ex.toString());
        }
    }
    
}

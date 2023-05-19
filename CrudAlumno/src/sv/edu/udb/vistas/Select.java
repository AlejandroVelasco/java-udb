package sv.edu.udb.vistas;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import sv.edu.udb.modelo.Conexion;

/**
 *
 * @author aleev
 */
public class Select {
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = Conexion.conectarse();
        String sql = "select * from ALUMNO";
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                System.out.println("------------------------------------");
                System.out.println("Carnet: " + rs.getString("CARNET"));
                System.out.println("Nombres: " + rs.getString("NOMBRES"));
                System.out.println("Apellidos: " + rs.getString("APELLIDOS"));
                System.out.println("------------------------------------");
            }
        
        }catch(SQLException e){
            System.out.println("Error ejecutando consulta: " + e);
        }
    }
    
    
}

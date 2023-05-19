package sv.edu.udb.modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author aleev
 */
public class Conexion {
    
    /*
    1. Usuario
    2. Constrasenia
    3. Nombre de la base de datos
    4. Puerto a conectar
    */
    private static final String usuario = "sa";
    private static final String pass = "123456";
    private static final String url = "jdbc:derby://localhost:1527/crudAlumno";
    //private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=Modulo3Java";
    private static Connection conexion = null;
    
    public static Connection conectarse(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //SI ES SQL SERVER y hay que agregar el jar
            
            conexion = DriverManager.getConnection(url, usuario, pass);
            //System.out.println("Conexion exitosa");
        }catch(Exception e){
            System.out.println("Error al conectar con base de datos: " + e);
        }
        return conexion;
    }
}

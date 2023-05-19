package sv.edu.udb.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Salvador Peña Menjívar
 */
public class Conexion {
    private static final String USUARIO = "salvador";
    private static final String PASS = "salvador";
    private static final String URL = "jdbc:derby://localhost:1527/BIBLIO";
    //private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=BIBLIOTECA";
    static Connection conexion;

    public static Connection conectarse() {
        try {
            Class.forName("org.apache.derby.jdbc.InternalDriver");
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, PASS);
           // System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró el driver (libreria) " + e);
        } catch (SQLException e) {
            System.out.println("Error al conectarse al gestor de bd " + e);
        } catch (Exception e) {
            System.out.println("Error al conectarse a la BD " + e);
        }
        return conexion;
    }
}

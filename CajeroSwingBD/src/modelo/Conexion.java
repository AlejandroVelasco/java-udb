package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Salvador Peña
 */
public class Conexion {

    private static final String USUARIO = "salvador";
    private static final String PASS = "salvador";
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=CAJERO";
    //private static final String URL = "jdbc:derby://localhost:1527/CAJERO";
    private static Connection conexion = null;

    public static Connection conectarse() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = DriverManager.getConnection(URL, USUARIO, PASS);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectarse a la bd " + e);
        }
        return conexion;
    }

    public static ResultSet ListasRegistros(String sql) {
        Connection con = conectarse();
        ResultSet rs = null;
        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    public static int actualizarRegistros(String sql) {//UPDATE DELETE INSERT
        Connection con = conectarse();
        int filas = 0;
        Statement st = null;
        try {
            st = con.createStatement();
            filas = st.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Error al modificar la BD " + e);
        } finally {
            try {
                con.close();
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión");
            }
        }
        return filas;
    }
}

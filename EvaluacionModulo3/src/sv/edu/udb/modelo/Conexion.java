package sv.edu.udb.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
   
    private static final String usuario = "sa";
    private static final String pass = "123456";
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=EVALUACION_MOD3_JAVA";
    private static Connection conexion = null;
    
    public static Connection conectarse(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
            conexion = DriverManager.getConnection(url, usuario, pass);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar con base de datos: " + e);
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

    public static int actualizarRegistros(String sql) {
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
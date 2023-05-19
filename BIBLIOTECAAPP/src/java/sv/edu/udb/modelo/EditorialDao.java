package sv.edu.udb.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sv.udb.edu.entidades.Categoria;
import sv.udb.edu.entidades.Editorial;

/**
 *
 * @author Salvador Peña Menjívar
 */
public class EditorialDao {
    public static List<Editorial> listarEditoriales() {
        List<Editorial> lstEditorial = new ArrayList<>();
        Editorial editorial = null;
        try {
            String sql = "SELECT * FROM EDITORIAL";
            Connection con = Conexion.conectarse();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                editorial = new Editorial();
                editorial.setCodEditorial(rs.getInt("COD_EDITORIAL"));
                editorial.setNombre(rs.getString("NOMBRE"));
                editorial.setTelefono(rs.getString("TELEFONO"));
                editorial.setDireccion(rs.getString("DIRECCION"));
                editorial.setEmail(rs.getString("EMAIL"));
                editorial.setUrl(rs.getString("URL"));
                lstEditorial.add(editorial);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar editorial " + e);
        }
        return lstEditorial;
    }
    
    
    public static boolean guardarEditorial(Editorial editorial) {
        boolean insercion = false;
        try {
            String sql = "INSERT INTO EDITORIAL (NOMBRE, TELEFONO, DIRECCION, EMAIL, URL) VALUES (?, ?, ?, ?, ?) ";
            Connection conexion = Conexion.conectarse();
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, editorial.getNombre());
            pst.setString(2, editorial.getTelefono());
            pst.setString(3, editorial.getDireccion());
            pst.setString(4, editorial.getEmail());
            pst.setString(5, editorial.getUrl());
            if (pst.executeUpdate() > 0) {
                insercion = true;
            } else {
                insercion = false;
            }
        } catch (SQLException e) {
            System.out.println("Error al agregar editorial " + e);
            insercion = false;
        }
        return insercion;
    }
    
}

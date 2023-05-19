package sv.edu.udb.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sv.udb.edu.entidades.Categoria;

/**
 *
 * @author Salvador Peña Menjívar
 */
public class CategoriaDao {

    /**
     * Este método me permite mostrar a través de una listas de objetos las
     * categoríar
     */
    public static List<Categoria> listarCategorias() {
        List<Categoria> lstCategoria = new ArrayList<>();
        Categoria categoria = null;
        try {
            String sql = "SELECT * FROM CATEGORIA ORDER BY 1 DESC";
            Connection con = Conexion.conectarse();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                categoria = new Categoria();
                categoria.setCodCategoria(rs.getInt("COD_CATEGORIA"));
                categoria.setNombre(rs.getString("NOMBRE"));
                lstCategoria.add(categoria);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar categorias " + e);
        }
        return lstCategoria;
    }

    /**
     * Este método me permite insertar categorías nuevas
     */
    public static boolean guardarCategoria(Categoria categoria) {
        boolean insercion = false;
        try {
            String sql = "INSERT INTO CATEGORIA (NOMBRE) VALUES (?) ";
            Connection conexion = Conexion.conectarse();
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, categoria.getNombre());
            if (pst.executeUpdate() > 0) {
                insercion = true;
            } else {
                insercion = false;
            }
        } catch (SQLException e) {
            System.out.println("Error al agregar categoría " + e);
            insercion = false;
        }
        return insercion;
    }

    /**
     * Este método me permite borrar una categoría
     *
     * @param idCategoria
     * @return
     */
    public static boolean borrarCategoria(int idCategoria) {
        boolean borrado = false;
        try {
            String sql = "DELETE FROM CATEGORIA WHERE COD_CATEGORIA = ?";
            Connection con = Conexion.conectarse();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idCategoria);
            if (pst.executeUpdate() > 0) {
                borrado = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al borrar categoria " + e);
            borrado = false;
        }
        return borrado;
    }

    /**
     * Este método me permite modificar una categoría
     *
     * @param categoria
     * @return
     */
    public static boolean modificarCategoria(Categoria categoria) {
        boolean modificar = false;
        try {
            String sql = "UPDATE CATEGORIA SET NOMBRE = ? WHERE COD_CATEGORIA = ?";
            Connection conexion = Conexion.conectarse();
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, categoria.getNombre());
            pst.setInt(2, categoria.getCodCategoria());
            if (pst.executeUpdate() > 0) {
                modificar = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al modificar la categoría"+e);
            modificar = false;
        }
        return modificar;
    }

    /**
     * Este método me permite buscar una categoría conociendo su código
     * @param idCategoria
     * @return
     */
    public static Categoria buscarCategoriaPorId(int idCategoria) {
        Categoria categoria = new Categoria();
        try {
            String sql = "SELECT * FROM CATEGORIA WHERE COD_CATEGORIA = ?";
            Connection conexion = Conexion.conectarse();
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idCategoria);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                categoria.setCodCategoria(rs.getInt("COD_CATEGORIA"));
                categoria.setNombre(rs.getString("NOMBRE"));
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar una categoría por su código " + e);
        }
        return categoria;
    }

}

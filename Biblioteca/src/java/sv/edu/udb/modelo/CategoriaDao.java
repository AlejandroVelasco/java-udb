package sv.edu.udb.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sv.edu.udb.entidades.Categoria;

/**
 *
 * @author aleev
 */
public class CategoriaDao {
    
    public static List<Categoria> listarCategorias(){
        List<Categoria> lstCategoria = new ArrayList<>();
        Categoria categoria = null;
        try{
            String sql = "SELECT * FROM CATEGORIA";
            Connection con = Conexion.conectarse();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                categoria = new Categoria();
                categoria.setCodCategoria(rs.getInt("COD_CATEGORIA"));
                categoria.setNombre(rs.getString("NOMBRE"));
                lstCategoria.add(categoria);
            }
        }catch(Exception e){
            System.out.println("Error al obtener categorias " + e);  
        }
        return lstCategoria;
    }
    
    /**
     * Metodo Permite buscar categoria por id
     * @param id
     * @return Categoria
     */
    public static Categoria buscarCategoriaPorId(int id){
        Categoria categoria = null;
         try{
            String sql = "SELECT * FROM CATEGORIA WHERE COD_CATEGORIA = ?";
            Connection con = Conexion.conectarse();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                categoria = new Categoria();
                categoria.setCodCategoria(rs.getInt("COD_CATEGORIA"));
                categoria.setNombre(rs.getString("NOMBRE"));
            }
        }catch(Exception e){
            System.out.println("Error al obtener categorias " + e);  
        }
        return categoria;
    }
    
    public static boolean guardarCategoria(Categoria categoria){
        boolean insercion = false;
        try{
            String sql = "INSERT INTO CATEGORIA (NOMBRE) VALUES (?)";
            Connection con = Conexion.conectarse();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, categoria.getNombre());
            if(pst.executeUpdate() > 0){
                insercion = true;
            }
        }catch(SQLException ex){
            System.out.println("Error al guardar:" + ex);
            insercion = false;
        }
        return insercion;
    }
    
    
    public static boolean borrarCategoria(int id){
        boolean bandera=false;
        try{
            String sql = "DELETE FROM CATEGORIA WHERE COD_CATEGORIA = ?";
            Connection con = Conexion.conectarse();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            if(pst.executeUpdate() > 0){
                bandera = true;
            }
        }catch(SQLException ex){
            System.out.println("Error al borrar:" + ex);
            bandera = false; 
        }
        return bandera;
    }
    
    public static boolean modificarCategoria(Categoria categoria){
        boolean bandera=false;
        try{
            String sql = "UPDATE CATEGORIA SET NOMBRE=? WHERE COD_CATEGORIA = ?";
            Connection con = Conexion.conectarse();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, categoria.getNombre());
            pst.setInt(2, categoria.getCodCategoria());
            if(pst.executeUpdate() > 0){
                bandera = true;
            }
        }catch(SQLException ex){
            System.out.println("Error al modificar:" + ex);
            bandera = false; 
        }
        return bandera;
        
    }
    
}

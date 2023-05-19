package controladores;

import entidades.Rol;
import entidades.Status;
import entidades.Usuario;
import java.sql.Date;
import java.sql.ResultSet;
import modelo.Conexion;

public class UsuarioControl {

    public Usuario validarUsuario(String usuario, String pass) {
        String sql = "SELECT * FROM USUARIO WHERE USUARIO = '" + usuario + "' AND PASS='" + pass + "'";
        ResultSet rs = Conexion.ListasRegistros(sql);
        Usuario usuarioValidado = null;
        try {
            while (rs.next()) {
                int idUsuario = rs.getInt("ID_USUARIO");
                Status status = buscarStatus(rs.getInt("ID_STATUS"));
                Rol rol = buscarRol(rs.getInt("ID_ROL"));
                String nombre = rs.getString("NOMBRE");
                String email = rs.getString("EMAIL");
                Date fechaCreacion = rs.getDate("FECHA_CREACION");
                Date fechaModificacion = rs.getDate("FECHA_MODIFICACION");
                usuarioValidado = new Usuario(idUsuario, status, rol, nombre, usuario, pass, email, fechaCreacion, fechaModificacion);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar usuario validado " + e);
        }
        return usuarioValidado;
    }

    public Status buscarStatus(int idStatus) {
        Status status = new Status();
        String sql = "SELECT * FROM STATUS WHERE ID_STATUS = " + idStatus;
        ResultSet rs = Conexion.ListasRegistros(sql);
        try {
            while (rs.next()) {
                int id = rs.getInt("ID_STATUS");
                String descripcion = rs.getString("DESCRIPCION");
                status = new Status(id, descripcion);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar status del usuario");
        }
        return status;
    }

    public Rol buscarRol(int idRol) {
        Rol rol = new Rol();
        String sql = "SELECT * FROM ROL WHERE ID_ROL = " + idRol;
        ResultSet rs = Conexion.ListasRegistros(sql);
        try {
            while (rs.next()) {
                int id = rs.getInt("ID_ROL");
                String descripcion = rs.getString("DESCRIPCION");
                rol = new Rol(id, descripcion);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar status del usuario");
        }
        return rol;
    }

}

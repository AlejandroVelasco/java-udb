package modelo;

import controladores.UsuarioControl;
import entidades.Usuario;

public class TestConexion {

    public static void main(String[] args) {
        // Conexion.conectarse();
        UsuarioControl uc = new UsuarioControl();
        Usuario usuario = uc.validarUsuario("salvador", "salvador");
        System.out.println(usuario.getNombre());

    }

}

package sv.edu.udb.controladores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.codec.digest.DigestUtils;
import sv.edu.udb.entidades.Usuario;
import sv.edu.udb.modelo.Conexion;

public class LoginControl {
    public static Usuario validarUsuario(String usuario, String pass){
        Connection con = Conexion.conectarse();
        String passCifrado = DigestUtils.sha512Hex(pass);
        try{
            String query = "SELECT * FROM USUARIO WHERE "
                    + "USUARIO = ? AND PASS = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, usuario);
            pst.setString(2, passCifrado);
            ResultSet rs = pst.executeQuery();
            Usuario usuarioValido = new Usuario();
            while(rs.next()){
              usuarioValido.setIdUsuario(rs.getInt("ID_USUARIO"));
              usuarioValido.setUsuario(rs.getString("USUARIO"));
              usuarioValido.setPass(rs.getString("PASS"));
              usuarioValido.setIdEstado(rs.getInt("ID_ESTADO"));
            }
            return usuarioValido;
        }catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
}

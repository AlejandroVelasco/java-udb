package controladores;

import entidades.Cuenta;
import entidades.Usuario;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Conexion;

public class CuentasControl {

    public static List<Cuenta> listarCuentasUsuario(Usuario usuario) {
        List<Cuenta> lstCuentasUsuario = new ArrayList<>();
        String sql = "SELECT * FROM CUENTA WHERE ID_USUARIO = " + usuario.getIdUsuario();
        ResultSet rs = Conexion.ListasRegistros(sql);
        try {
            while (rs.next()) {
                int idCuenta = rs.getInt("ID_CUENTA");
                BigDecimal saldo = rs.getBigDecimal("SALDO");
                String numCuenta = rs.getString("NUM_CUENTA");
                Cuenta cuenta = new Cuenta(idCuenta, usuario, saldo, numCuenta);
                lstCuentasUsuario.add(cuenta);
            }
        } catch (Exception e) {
            System.out.println("Error al listar las cuentas del usuario");
        }
        return lstCuentasUsuario;
    }

}

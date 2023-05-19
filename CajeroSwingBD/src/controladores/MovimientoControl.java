package controladores;

import entidades.Cuenta;
import java.math.BigDecimal;
import java.sql.Date;
import modelo.Conexion;

public class MovimientoControl {

    public static void guardarRetiro(Cuenta cuenta, BigDecimal saldoRetirar) {
        BigDecimal saldoNuevo = cuenta.getSaldo().subtract(saldoRetirar);
        java.util.Date utilDate = new java.util.Date();
        String sqlUpdate = "UPDATE CUENTA SET SALDO = " + saldoNuevo + " WHERE ID_CUENTA =  " + cuenta.getIdCuenta();
        String sqlInsert = "INSERT INTO MOVIMIENTO(ID_TIPO_MOVIMIENTO, ID_CUENTA, MONTO, FECHA) VALUES "
                + "(1," + cuenta.getIdCuenta() + "," + saldoRetirar + ",'" + new Date(utilDate.getTime()) + "')";
        try {
            Conexion.actualizarRegistros(sqlUpdate);
            Conexion.actualizarRegistros(sqlInsert);
        } catch (Exception e) {
            System.out.println("Error al guardar el retiro " + e);
        }
    }

    public static void guardarAbono(Cuenta cuenta, BigDecimal saldoAbonar) {
        BigDecimal saldoNuevo = cuenta.getSaldo().add(saldoAbonar);
        java.util.Date utilDate = new java.util.Date();
        String sqlUpdate = "UPDATE CUENTA SET SALDO = " + saldoNuevo + " WHERE ID_CUENTA =  " + cuenta.getIdCuenta();
        String sqlInsert = "INSERT INTO MOVIMIENTO(ID_TIPO_MOVIMIENTO, ID_CUENTA, MONTO, FECHA) VALUES (2," + cuenta.getIdCuenta() + "," + saldoAbonar + ",'" + new Date(utilDate.getTime()) + "')";
        try {
            Conexion.actualizarRegistros(sqlUpdate);
            Conexion.actualizarRegistros(sqlInsert);
        } catch (Exception e) {
            System.out.println("Error al guardar el abono " + e);
        }
    }

}

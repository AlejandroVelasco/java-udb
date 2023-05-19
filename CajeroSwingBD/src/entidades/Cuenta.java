package entidades;

import java.math.BigDecimal;

public class Cuenta {

    private int idCuenta;
    private Usuario idUsuario;
    private BigDecimal saldo;
    private String numCuenta;

    public Cuenta(int idCuenta, Usuario idUsuario, BigDecimal saldo, String numCuenta) {
        this.idCuenta = idCuenta;
        this.idUsuario = idUsuario;
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }

    public Cuenta() {
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "Numero de cuenta =" + numCuenta+ "         Saldo=" + saldo;
    }

}

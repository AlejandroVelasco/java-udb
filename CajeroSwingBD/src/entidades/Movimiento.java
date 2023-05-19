package entidades;

import java.math.BigDecimal;
import java.sql.Date;

public class Movimiento {
 private int idMovimiento;
 private TipoMovimiento idTipoMovimiento;
 private Cuenta idCuenta;
 private BigDecimal monto;
 private Date fecha;

    public Movimiento(int idMovimiento, TipoMovimiento idTipoMovimiento, Cuenta idCuenta, BigDecimal monto, Date fecha) {
        this.idMovimiento = idMovimiento;
        this.idTipoMovimiento = idTipoMovimiento;
        this.idCuenta = idCuenta;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public TipoMovimiento getIdTipoMovimiento() {
        return idTipoMovimiento;
    }

    public void setIdTipoMovimiento(TipoMovimiento idTipoMovimiento) {
        this.idTipoMovimiento = idTipoMovimiento;
    }

    public Cuenta getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Cuenta idCuenta) {
        this.idCuenta = idCuenta;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
 
 
    
}

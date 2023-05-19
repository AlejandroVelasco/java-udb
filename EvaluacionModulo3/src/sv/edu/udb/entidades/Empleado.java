package sv.edu.udb.entidades;

import java.math.BigDecimal;

public class Empleado {
    private int idEmpleado;
    private String nombre;
    private int idDepartamento;
    private BigDecimal salario;

    public Empleado(String nombre, int idDepartamento, BigDecimal salario) {
        this.nombre = nombre;
        this.idDepartamento = idDepartamento;
        this.salario = salario;
    }

    public Empleado(int idEmpleado, String nombre, int idDepartamento, BigDecimal salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.idDepartamento = idDepartamento;
        this.salario = salario;
    }
    
    

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    
    
}

package sv.edu.udb.ejemplos.s3;

public class Persona {
    private String codigo;
    private String nombres;
    private String apellidos;

    public Persona(String nombres, String apellidos) {
        String cod = nombres.substring(0,2) + apellidos.substring(0,2);
        this.codigo = cod;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Persona() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
}

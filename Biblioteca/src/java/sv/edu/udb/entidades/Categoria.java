package sv.edu.udb.entidades;
/**
 *
 * @author aleev
 */
public class Categoria {
    private int codCategoria;
    private String nombre;

    public Categoria(int codCategoria, String nombre) {
        this.codCategoria = codCategoria;
        this.nombre = nombre;
    }

    public Categoria() {
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

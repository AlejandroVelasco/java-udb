package sv.edu.udb.ejemplos.s2;

/**
 * @author aleev
 */
public class Alumno {
    String codAlumno; //Requerido
    String nombres;   //Requerido
    String apellidos; //Requerido
    String telefono;  //No Requerido
    
    //Constructor1
    public Alumno(String codAlumno, String nombres, String apellidos) {
        this.codAlumno = codAlumno;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    //Constructor2
    public Alumno() {
    }
    
}

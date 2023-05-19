package sv.edu.udb.ejemplos.s2;

/**
 *
 * @author aleev
 */
public class TestAlumno {
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("1", "Alejandro Ernesto", "Velasco Crespín");
        alumno1.telefono = "78510345";
        
        Alumno alumno2 = new Alumno("2", "Fátima Argentina", "González Crespín");
        alumno2.telefono = "76654200";
        
        Alumno alumno3 = new Alumno();
        
        System.out.println("Alumno1");
        System.out.println("\t Código: " + alumno1.codAlumno);
        System.out.println("\t Nombres: " + alumno1.nombres);
        System.out.println("\t Apellidos: " + alumno1.apellidos);
        System.out.println("\t Télefono: " + alumno1.telefono);
        
        System.out.println("\nAlumno2");
        System.out.println("\t Código: " + alumno2.codAlumno);
        System.out.println("\t Nombres: " + alumno2.nombres);
        System.out.println("\t Apellidos: " + alumno2.apellidos);
        System.out.println("\t Télefono: " + alumno2.telefono);
        
    }
}
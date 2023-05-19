package sv.edu.udb.evaluacion.registro;

/**
 *
 * @author aleev
 */
public class Usuario {
    
    private String nombre;
    private String usuario;
    private String password;
    private String correo;

    public boolean IniciarSesion(String usuario, String password){
        boolean bandera = false;
        if(this.usuario.equalsIgnoreCase(usuario) 
                && this.password.equals(password)){
            bandera = true;
        }
        return bandera;
    }   
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nombre: " + this.usuario);
        System.out.println("Correo: " + this.correo);
    }
    
    //CONSTRUCTOR
    public Usuario(String nombre, String usuario, String password) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.password = password;
    }

    public Usuario() {
    }
    
    //GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
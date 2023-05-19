package sv.edu.udb.evaluacion.registro;

import java.util.Scanner;

public class TestUsuario {
    static Usuario usuario = new Usuario();
    static Scanner in = new Scanner(System.in);
        
    public static void main(String[] args) {
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("_______________________");
        registro();
        System.out.println("\n");
        inicioSesion();
    }
    
    private static void inicioSesion(){
        String user;
        String password;
        boolean bandera = false;
        System.out.println("Inicio de sesión");
        
        while(!bandera){
            System.out.println("Ingrese usuario");
            user = in.nextLine();
            System.out.println("Ingrese contraseña");
            password = in.nextLine();
            bandera = usuario.IniciarSesion(user, password);
            if(bandera){
                System.out.println("Inicio de sesión exitoso");
                usuario.mostrarDatos();
            }else{
                System.out.println("Fallo inicio de sesión, intente de nuevo");
            }
        }
    }
    
    private static void registro(){
        String nombre;
        String correo;
        String user;
        String password;
        String passwordConfirmacion;
        
        System.out.println("Registro de usuario");
        System.out.println("Ingrese nombre: ");
        nombre = in.nextLine();
        System.out.println("Ingrese correo:");
        correo = in.nextLine();
        System.out.println("Ingrese usuario");
        user = in.nextLine();
        
        boolean bandera = false;
        do{
        System.out.println("Ingrese contraseña");
        password = in.nextLine();
        System.out.println("Confirmar constraseña");
        passwordConfirmacion = in.nextLine();
        bandera = confirmarPassword(password, passwordConfirmacion);
            if(!bandera){
                System.out.println("CONTRASEÑAS NO COINCIDEN, INTENTA DE NUEVO");
            }
        }while(!bandera);
        
        usuario.setCorreo(correo);
        usuario.setNombre(nombre);
        usuario.setUsuario(user);
        usuario.setPassword(password);
        System.out.println("Registro exitoso!");
    }
    
    
    private static boolean confirmarPassword(String password, String confirmarPassword){
        boolean resultado=false;
        if(password.equals(confirmarPassword)){
            resultado = true;
        }
        return resultado;
    }
    
}

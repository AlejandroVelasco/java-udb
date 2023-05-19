package sv.edu.udb.ejercicios.s3;

public class Perro {
    
    private String nombre;
    private int tamanio;

    //Metodos
    public void ladrar(){
        if(this.tamanio <= 14){
            System.out.println("Ladrar: Yip! Yip!");
        }else if(this.tamanio <= 60 ){
            System.out.println("Ladrar: Ruff! Ruff!");
        }else{
            System.out.println("Ladrar: Woof! Woof!");
        }
    }
    
    //Constructores
    public Perro() {
    }

    public Perro(String nombre, int tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    //Setters y getters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

 }
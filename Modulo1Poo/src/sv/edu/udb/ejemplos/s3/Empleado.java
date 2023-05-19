package sv.edu.udb.ejemplos.s3;

public class Empleado extends Persona {
    private double pagoHora;
    private int numHoras;
    private String puesto;

   
    public double calcularSalario(){
        double salario = pagoHora * numHoras;
        return salario;
    }
   
    public double calcularIsss(){
       double isss = calcularSalario()*0.03;
       return isss;
    }
   
    public double calcularAfp(){
       double afp = calcularSalario()*0.0625;
       return afp;
    }
    
    public double calcularRenta(){
        double renta = (calcularSalario() - calcularAfp() - calcularIsss())*0.1;
        return renta;
    }
    
    public double calcularSalarioNeto(){
        return calcularSalario() - calcularAfp() - calcularIsss() - calcularRenta();
    }
   
    public Empleado(double pagoHora, int numHoras, String puesto, String nombres, String apellidos) {
        super(nombres, apellidos);
        this.pagoHora = pagoHora;
        this.numHoras = numHoras;
        this.puesto = puesto;
    }

    public Empleado() {
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
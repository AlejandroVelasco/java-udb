package sv.edu.udb.ejemplos.s3;

import java.util.Scanner;

public class TestEmpleado {

    public static void main(String[] args) {
        String continuar="SI";
        String nombres;
        String apellidos;
        String puesto;
        double pagoHora;
        int numHoras;
        Scanner in = new Scanner(System.in);
        
        while(continuar.equalsIgnoreCase("SI")){
            System.out.println("Digite los nombres");
            nombres =in.nextLine();
            System.out.println("Digite los apellidos");
            apellidos = in.nextLine();
            System.out.println("Digite el puesto");
            puesto = in.nextLine();
            System.out.println("Digite el pago de hora del empleado");
            pagoHora = Double.parseDouble(in.nextLine());
            System.out.println("Digite la cantidad de horas laboradas");
            numHoras = Integer.parseInt(in.nextLine());
            
            Empleado empleado = new Empleado(pagoHora, numHoras, puesto, 
                                    nombres, apellidos);
            
            double salario = empleado.calcularSalario();
            double afp = empleado.calcularAfp();
            double isss = empleado.calcularIsss();
            double renta = empleado.calcularRenta();
            double salarioNeto = empleado.calcularSalarioNeto();
            
            System.out.println("******RESULTADOS******");
            System.out.println("Nombres: " +empleado.getNombres());
            System.out.println("Apellidos: " +empleado.getApellidos());
            System.out.println("Puesto: " + empleado.getPuesto());
            System.out.println("Pago por hora: " + empleado.getPagoHora());
            System.out.println("Número de horas laboradas: " 
                                + empleado.getNumHoras());
            System.out.println("Salario bruto: $" + salario);
            System.out.println("AFP $" + afp);
            System.out.println("ISSS $"+isss);
            System.out.println("RENTA $"+renta);
            System.out.println("Salario Neto $"+salarioNeto);
            System.out.println("\n ¿Desea continuar? SI/NO");
            continuar = in.nextLine();
        }
        
    }
    
}

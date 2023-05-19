package sv.edu.udb.evaluacion.concachampions;

import java.util.Scanner;

public class Concachampions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int local;
        int visitante;
      
        System.out.println("Bienvenido. Ingrese resultados del partido");
        System.out.println("Goles equipo local:");
        local = Integer.parseInt(in.nextLine());
        System.out.println("Goles equipo visitante:");
        visitante = Integer.parseInt(in.nextLine());
        
        System.out.println("*************************************");
        System.out.println("***********RESULTADO*****************");
        System.out.println("***** Local " + local + " vs " + visitante + " Visitante*********");
        
        if(local > visitante){
            System.out.println("*****¡¡¡¡¡LOCAL GANÓ!!!!!************");
            if(local >= 3){
                System.out.println("Al ganar y anotar tres goles o más, queremos celebrar con ¡bebida gratis!");
            }
        }else if(visitante > local){
            System.out.println("*********VISITANTE GANO*************");
        }else{
            System.out.println("********* EMPATE *******************");
        }
        
        
    }
    
}

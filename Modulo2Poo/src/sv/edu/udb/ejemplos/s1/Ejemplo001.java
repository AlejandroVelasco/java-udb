package sv.edu.udb.ejemplos.s1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo001 {
    public static void main(String[] args) {
       mostrarVentana();
    }
    
    public static void mostrarVentana(){
        JFrame frame = new JFrame("Titulo de la ventana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        
        JLabel label = new JLabel("JLabel permite crear una etiqueta");
        frame.getContentPane().add(label);
        
        frame.setVisible(true);
    }
    
}

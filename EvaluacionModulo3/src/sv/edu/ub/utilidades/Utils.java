package sv.edu.ub.utilidades;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author aleev
 */
public class Utils {
    
    /**
     * Este metodo limpio las cajas de texto en un panel
     * El parametro necesario para funcionar es el nombre del panel
     * @param panel 
     */
    public static void limpiarPanel(JPanel panel){
        for(int i = 0; i < panel.getComponentCount(); i++){
             if (panel.getComponent(i) instanceof JTextField) {
                JTextField cajaDeTexto = (JTextField) panel.getComponent(i);
                cajaDeTexto.setText("");
            }
        }
    }
    
}
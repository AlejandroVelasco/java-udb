package sv.edu.udb.evaluacion.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author aleev
 */
public class PruebaModuloTrimestres extends javax.swing.JFrame {

    List<String> primerTrimestre = new ArrayList();
    List<String> segundoTrimestre = new ArrayList();
    List<String> tercerTrimestre = new ArrayList();
    List<String> cuartoTrimestre = new ArrayList();
    DefaultListModel modeloLista = new DefaultListModel();

    
    public PruebaModuloTrimestres() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarDatosIniciales();
         try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
        }catch(Exception e){
            //
        }
        SwingUtilities.updateComponentTreeUI(this);
    }
    
    public void cargarDatosIniciales(){
        //Primer Trimestre
        primerTrimestre.add("Enero");
        primerTrimestre.add("Febrero");
        primerTrimestre.add("Marzo");
        
        //Segundo Trimestre
        segundoTrimestre.add("Abril");
        segundoTrimestre.add("Mayo");
        segundoTrimestre.add("Junio");
        
        //Tercer Trimestre
        tercerTrimestre.add("Julio");
        tercerTrimestre.add("Agosto");
        tercerTrimestre.add("Septiembre");
        
        //Cuarto Trimestre
        cuartoTrimestre.add("Octubre");
        cuartoTrimestre.add("Noviembre");
        cuartoTrimestre.add("Diciembre");
    }
    
    public void vaciarDatos(){
        this.lblMesSeleccionado.setText("");
        modeloLista.clear();
        this.btnGroupRbt.clearSelection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupRbt = new javax.swing.ButtonGroup();
        pnlTrimestres = new javax.swing.JPanel();
        rbtPrimerTrimestre = new javax.swing.JRadioButton();
        rbtSegundoTrimestre = new javax.swing.JRadioButton();
        rbtTercerTrimestre = new javax.swing.JRadioButton();
        rbtCuartoTrimestre = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMeses = new javax.swing.JList<>();
        btnVaciar = new javax.swing.JButton();
        btnRellenar = new javax.swing.JButton();
        lblMesSeleccionado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlTrimestres.setBorder(javax.swing.BorderFactory.createTitledBorder("Trimestres"));

        btnGroupRbt.add(rbtPrimerTrimestre);
        rbtPrimerTrimestre.setText("Trimestre 1");

        btnGroupRbt.add(rbtSegundoTrimestre);
        rbtSegundoTrimestre.setText("Trimestre 2");

        btnGroupRbt.add(rbtTercerTrimestre);
        rbtTercerTrimestre.setText("Trimestre 3");

        btnGroupRbt.add(rbtCuartoTrimestre);
        rbtCuartoTrimestre.setText("Trimestre 4");

        javax.swing.GroupLayout pnlTrimestresLayout = new javax.swing.GroupLayout(pnlTrimestres);
        pnlTrimestres.setLayout(pnlTrimestresLayout);
        pnlTrimestresLayout.setHorizontalGroup(
            pnlTrimestresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrimestresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTrimestresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtPrimerTrimestre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtSegundoTrimestre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtTercerTrimestre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtCuartoTrimestre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pnlTrimestresLayout.setVerticalGroup(
            pnlTrimestresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrimestresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtPrimerTrimestre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtSegundoTrimestre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtTercerTrimestre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtCuartoTrimestre)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel1.setText("Meses");

        lstMeses.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstMesesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstMeses);

        btnVaciar.setText("Vaciar");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        btnRellenar.setText("Rellenar");
        btnRellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRellenarActionPerformed(evt);
            }
        });

        lblMesSeleccionado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMesSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRellenar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(pnlTrimestres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnRellenar)
                                .addGap(26, 26, 26)
                                .addComponent(btnVaciar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(pnlTrimestres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMesSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRellenarActionPerformed
        // TODO add your handling code here:
        if(this.rbtPrimerTrimestre.isSelected()){
            for(String mes : primerTrimestre){
                modeloLista.addElement(mes);
            }
        }
        
        if(this.rbtSegundoTrimestre.isSelected()){
            for(String mes : segundoTrimestre){
                modeloLista.addElement(mes);
            }
        }
        
        if(this.rbtTercerTrimestre.isSelected()){
            for(String mes : tercerTrimestre){
                modeloLista.addElement(mes);
            }
        }
        
        if(this.rbtCuartoTrimestre.isSelected()){
            for(String mes : cuartoTrimestre){
                modeloLista.addElement(mes);
            }
        }
        
        this.lstMeses.setModel(modeloLista);
    }//GEN-LAST:event_btnRellenarActionPerformed

    private void lstMesesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstMesesValueChanged
        // TODO add your handling code here:
        this.lblMesSeleccionado.setText(this.lstMeses.getSelectedValue());
    }//GEN-LAST:event_lstMesesValueChanged

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        // TODO add your handling code here:
        vaciarDatos();
    }//GEN-LAST:event_btnVaciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PruebaModuloTrimestres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PruebaModuloTrimestres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PruebaModuloTrimestres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebaModuloTrimestres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PruebaModuloTrimestres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupRbt;
    private javax.swing.JButton btnRellenar;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMesSeleccionado;
    private javax.swing.JList<String> lstMeses;
    private javax.swing.JPanel pnlTrimestres;
    private javax.swing.JRadioButton rbtCuartoTrimestre;
    private javax.swing.JRadioButton rbtPrimerTrimestre;
    private javax.swing.JRadioButton rbtSegundoTrimestre;
    private javax.swing.JRadioButton rbtTercerTrimestre;
    // End of variables declaration//GEN-END:variables
}

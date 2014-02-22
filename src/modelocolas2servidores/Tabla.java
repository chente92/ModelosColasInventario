/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelocolas2servidores;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.*;
/**
 *
 * @author Vicente
 */
public class Tabla extends javax.swing.JFrame {

    /**
     * Creates new form Tabla
     */
       public Tabla(Object[][] _data) {
        
         Object[][] data = _data;
        
        String []Columnas={"Clientes","Aleatorio de Llegada",
            "Aleatorio de Servicio","Tiempo de Llegada",
            "Tiempo de Servicio","Hora de Llegada","Canal","Inicio de Servicio Canal 1",
            "Fin de Servicio Canal 1","Inicio de Servicio Canal 2",
            "Fin de Servicio Canal 2","Tiempo de espera","Tiempo en el sistema"};
        
        DefaultTableModel TablaModelo=new DefaultTableModel(data, Columnas);
        final JTable tabla = new JTable(TablaModelo);
        
        tabla.setPreferredScrollableViewportSize(new Dimension(2500,1000));
      JScrollPane ScrollPanel =new JScrollPane(tabla);
      getContentPane().add(ScrollPanel, BorderLayout.CENTER);
      getContentPane().setPreferredSize(new Dimension (1200,600));
      
      //Diseno
        tabla.setBackground(new Color(0,96,128));
        tabla.setForeground(Color.white);
        tabla.setSelectionForeground(Color.orange);
        tabla.setRowHeight(24);
        tabla.getTableHeader().setFont(new Font("Segoe UI", 0, 16));
        tabla.setFont(new Font("Segoe UI", 0, 15));
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      
      this.pack();
      this.setVisible(true);
      addWindowListener(new WindowAdapter(){
      public void windowsClosing(WindowEvent e)
      {
          System.exit(0);
      }
      });
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

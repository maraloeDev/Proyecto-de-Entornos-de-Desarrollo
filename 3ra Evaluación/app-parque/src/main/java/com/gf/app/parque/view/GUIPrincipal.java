/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gf.app.parque.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * GUIPrincipal: es la ventana que tiene el menu de opciones. 
 *
 * @author priparno
 */
public class GUIPrincipal extends javax.swing.JFrame {

    /**
     * tamPantalla: el tamanio de la pantalla.
     */
    private Dimension tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * panelMenu: es el panel donde se pondran las opciones.
     */
    private JPanel panelMenu;

    /**
     * botonReserva: es el boton de la opcion reserva.
     */
    private JButton botonReserva;

    /**
     * Creates new form GUIPrincipal
     */
    public GUIPrincipal() {
        initComponents();
        setFrame();
    }

    /**
     * setFrame: es el metodo principal que ajusta y coloca componentes por
     * pantalla
     */
    private void setFrame() {
        this.setTitle("Reservar");
        this.setSize(tamPantalla);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.getContentPane().setLayout(new BorderLayout());
        setButtons();
    }

    /**
     * setButtons: coloca y crea los botones en la ventana.
     */
    private void setButtons() {
        panelMenu = new JPanel(new FlowLayout(FlowLayout.CENTER));
        botonReserva = new JButton("Reserva");
        botonReserva.setPreferredSize(new Dimension(tamPantalla.width, 70));
        panelMenu.add(botonReserva);
        this.getContentPane().add(panelMenu, BorderLayout.CENTER);
    }

    /**
     * getBotonReserva: devuelve un JButton que sera el boton de la opcion
     * reserva.
     *
     * @see JButton
     *
     * @return un JButton
     */
    public JButton getBotonReserva() {
        return botonReserva;
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

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUIPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

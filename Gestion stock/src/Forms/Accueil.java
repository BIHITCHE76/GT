/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Forms;

import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author brahi
 */
public class Accueil extends javax.swing.JInternalFrame {
        
    /**
     * Creates new form Accueil
     */
    public Accueil() {
        initComponents();
        UIManager.put("JFrame.activeTitleBackground", Color.red);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back1_Acc = new javax.swing.JPanel();
        back2_Acc = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setTitle("Accueil ");
        setPreferredSize(new java.awt.Dimension(950, 300));

        back1_Acc.setBackground(new java.awt.Color(255, 255, 0));

        back2_Acc.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout back2_AccLayout = new javax.swing.GroupLayout(back2_Acc);
        back2_Acc.setLayout(back2_AccLayout);
        back2_AccLayout.setHorizontalGroup(
            back2_AccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        back2_AccLayout.setVerticalGroup(
            back2_AccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("Actualiser");

        javax.swing.GroupLayout back1_AccLayout = new javax.swing.GroupLayout(back1_Acc);
        back1_Acc.setLayout(back1_AccLayout);
        back1_AccLayout.setHorizontalGroup(
            back1_AccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(back1_AccLayout.createSequentialGroup()
                .addComponent(back2_Acc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 389, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        back1_AccLayout.setVerticalGroup(
            back1_AccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back2_Acc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(back1_AccLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back1_Acc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back1_Acc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel back1_Acc;
    private javax.swing.JPanel back2_Acc;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

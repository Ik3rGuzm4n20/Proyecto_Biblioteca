/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class autorvent extends javax.swing.JFrame {
    ArrayList <aautor> aAutorA=new ArrayList<aautor>();
    ArrayList <reautor> aAutorR=new ArrayList<reautor>();

    /**
     * Creates new form autorvent
     */
    public autorvent(ArrayList <autorvent> aAv) {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btagregar = new javax.swing.JButton();
        btreporte = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btagregar.setBackground(new java.awt.Color(153, 153, 153));
        btagregar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        btagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agregar-usuario.png"))); // NOI18N
        btagregar.setText("Agregar Autor");
        btagregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagregarActionPerformed(evt);
            }
        });

        btreporte.setBackground(new java.awt.Color(153, 153, 153));
        btreporte.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        btreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/encuesta-de-personas.png"))); // NOI18N
        btreporte.setText("Reporte Autor");
        btreporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btreporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btreporteActionPerformed(evt);
            }
        });

        btsalir.setBackground(new java.awt.Color(153, 153, 153));
        btsalir.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        btsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/deshacer.png"))); // NOI18N
        btsalir.setText("Regresar");
        btsalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel2.setText("Opciones:");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel1.setText("AUTOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(171, 171, 171))))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagregarActionPerformed
        // TODO add your handling code here:
        aautor vAutorA=new aautor(aAutorA);
    }//GEN-LAST:event_btagregarActionPerformed

    private void btreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btreporteActionPerformed
        // TODO add your handling code here:
        reautor vReporteA=new reautor(aAutorR);
    }//GEN-LAST:event_btreporteActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btsalirActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btagregar;
    private javax.swing.JButton btreporte;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

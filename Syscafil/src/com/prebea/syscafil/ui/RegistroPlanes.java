/*
 *  The MIT License
 * 
 *  Copyright 2011 Edwin Bratini.
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */

/*
 * RegistroPlanes.java
 *
 * Created on 05/04/2011, 12:12:46 PM
 */

package com.prebea.syscafil.ui;

import java.awt.Toolkit;

/**
 *
 * @author Edwin Bratini
 */
public class RegistroPlanes extends javax.swing.JFrame {

    /** Creates new form RegistroPlanes */
    public RegistroPlanes() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInfoPlan = new javax.swing.JPanel();
        lblCategoriaPlan = new javax.swing.JLabel();
        cmbCategoriaPlan = new javax.swing.JComboBox();
        lblSubcategoria = new javax.swing.JLabel();
        cmbSubcategoriaPlan = new javax.swing.JComboBox();
        lblNombrePlan = new javax.swing.JLabel();
        txtNombrePlan = new javax.swing.JTextField();
        lblDescripcionPlan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblPrecioPlan = new javax.swing.JLabel();
        ftfPrecioPlan = new javax.swing.JFormattedTextField();
        lblPrecioDepExtra = new javax.swing.JLabel();
        ftfPrecioDepExtra = new javax.swing.JFormattedTextField();
        btnNuevaCatPlan = new javax.swing.JButton();
        btnNuevaSubcatPlan = new javax.swing.JButton();
        lblAsterVal11 = new javax.swing.JLabel();
        lblAsterVal12 = new javax.swing.JLabel();
        lblAsterVal14 = new javax.swing.JLabel();
        lblAsterVal15 = new javax.swing.JLabel();
        lblAsterVal16 = new javax.swing.JLabel();
        lblAsterVal17 = new javax.swing.JLabel();
        statusPanel = new javax.swing.JPanel();
        javax.swing.JSeparator statusPanelSeparator = new javax.swing.JSeparator();
        statusMessageLabel = new javax.swing.JLabel();
        statusAnimationLabel = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        lblMensajeInsercion = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Planes");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/imagenes/prebea_logo.png")));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlInfoPlan.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));

        lblCategoriaPlan.setText("Categoria Plan");

        cmbCategoriaPlan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccion", "Familiar", "Empresarial" }));
        cmbCategoriaPlan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbCategoriaPlanFocusGained(evt);
            }
        });

        lblSubcategoria.setText("Subcategoria");

        cmbSubcategoriaPlan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccion", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSubcategoriaPlan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbSubcategoriaPlanFocusGained(evt);
            }
        });

        lblNombrePlan.setText("Nombre");

        lblDescripcionPlan.setText("Descripcion");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(3);
        jScrollPane1.setViewportView(jTextArea1);

        lblPrecioPlan.setText("Precio");

        ftfPrecioPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfPrecioPlanActionPerformed(evt);
            }
        });

        lblPrecioDepExtra.setText("Precio Dep. Extra");

        btnNuevaCatPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/MBAdd.active.png"))); // NOI18N
        btnNuevaCatPlan.setBorderPainted(false);
        btnNuevaCatPlan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/MBAdd.mousedown.png"))); // NOI18N
        btnNuevaCatPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCatPlanActionPerformed(evt);
            }
        });

        btnNuevaSubcatPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/MBAdd.active.png"))); // NOI18N
        btnNuevaSubcatPlan.setBorderPainted(false);
        btnNuevaSubcatPlan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/MBAdd.mousedown.png"))); // NOI18N
        btnNuevaSubcatPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaSubcatPlanActionPerformed(evt);
            }
        });

        lblAsterVal11.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal12.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal14.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal15.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal16.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal17.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout pnlInfoPlanLayout = new javax.swing.GroupLayout(pnlInfoPlan);
        pnlInfoPlan.setLayout(pnlInfoPlanLayout);
        pnlInfoPlanLayout.setHorizontalGroup(
            pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoPlanLayout.createSequentialGroup()
                .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoPlanLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombrePlan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDescripcionPlan, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombrePlan)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)))
                    .addGroup(pnlInfoPlanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoriaPlan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSubcategoria, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPrecioPlan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPrecioDepExtra, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ftfPrecioPlan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(ftfPrecioDepExtra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInfoPlanLayout.createSequentialGroup()
                                .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCategoriaPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbSubcategoriaPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnNuevaCatPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNuevaSubcatPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(94, 94, 94)))
                .addGap(18, 18, 18)
                .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAsterVal11)
                    .addComponent(lblAsterVal12)
                    .addComponent(lblAsterVal14)
                    .addComponent(lblAsterVal15)
                    .addComponent(lblAsterVal16)
                    .addComponent(lblAsterVal17))
                .addContainerGap())
        );
        pnlInfoPlanLayout.setVerticalGroup(
            pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoPlanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoPlanLayout.createSequentialGroup()
                        .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombrePlan)
                            .addComponent(txtNombrePlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAsterVal11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescripcionPlan)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCategoriaPlan)
                                .addComponent(cmbCategoriaPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNuevaCatPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(pnlInfoPlanLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblAsterVal12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(lblAsterVal14)
                        .addGap(8, 8, 8)))
                .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSubcategoria)
                        .addComponent(cmbSubcategoriaPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblAsterVal15)
                        .addComponent(btnNuevaSubcatPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioPlan)
                    .addComponent(ftfPrecioPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsterVal16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioDepExtra)
                    .addComponent(ftfPrecioDepExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsterVal17))
                .addContainerGap())
        );

        statusAnimationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanelSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusMessageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addComponent(statusAnimationLabel)
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addComponent(statusPanelSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusMessageLabel)
                    .addComponent(statusAnimationLabel))
                .addGap(3, 3, 3))
        );

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/add_25x25.png"))); // NOI18N
        btnAceptar.setText("Aceptar");

        lblMensajeInsercion.setForeground(new java.awt.Color(204, 204, 204));
        lblMensajeInsercion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/salir_25x25.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlInfoPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMensajeInsercion, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlInfoPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMensajeInsercion))
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ftfPrecioPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfPrecioPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfPrecioPlanActionPerformed

    private void btnNuevaCatPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCatPlanActionPerformed
        // TODO add your handling code here:
        RegistroCategoriaPlan rcp = new RegistroCategoriaPlan(this, true);
        rcp.setLocationRelativeTo(this);
        rcp.setVisible(true);
    }//GEN-LAST:event_btnNuevaCatPlanActionPerformed

    private void btnNuevaSubcatPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaSubcatPlanActionPerformed
        // TODO add your handling code here:
        RegistroSubcategoriaPlan rsp = new RegistroSubcategoriaPlan(this, true);
        rsp.setLocationRelativeTo(this);
        rsp.setVisible(true);
    }//GEN-LAST:event_btnNuevaSubcatPlanActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        btnNuevaCatPlan.setVisible(false);
        btnNuevaSubcatPlan.setVisible(false);
        LimpiadorComponentes.limpiarComponentes(this);
        LimpiadorComponentes.limpiarValidationMarkers(this);
    }//GEN-LAST:event_formWindowOpened

    private void cmbCategoriaPlanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbCategoriaPlanFocusGained
        // TODO add your handling code here:
        btnNuevaCatPlan.setVisible(true);
    }//GEN-LAST:event_cmbCategoriaPlanFocusGained

    private void cmbSubcategoriaPlanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbSubcategoriaPlanFocusGained
        // TODO add your handling code here:
        btnNuevaSubcatPlan.setVisible(true);
    }//GEN-LAST:event_cmbSubcategoriaPlanFocusGained

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_btnSalirActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPlanes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnNuevaCatPlan;
    private javax.swing.JButton btnNuevaSubcatPlan;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbCategoriaPlan;
    private javax.swing.JComboBox cmbSubcategoriaPlan;
    private javax.swing.JFormattedTextField ftfPrecioDepExtra;
    private javax.swing.JFormattedTextField ftfPrecioPlan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAsterVal11;
    private javax.swing.JLabel lblAsterVal12;
    private javax.swing.JLabel lblAsterVal14;
    private javax.swing.JLabel lblAsterVal15;
    private javax.swing.JLabel lblAsterVal16;
    private javax.swing.JLabel lblAsterVal17;
    private javax.swing.JLabel lblCategoriaPlan;
    private javax.swing.JLabel lblDescripcionPlan;
    private javax.swing.JLabel lblMensajeInsercion;
    private javax.swing.JLabel lblNombrePlan;
    private javax.swing.JLabel lblPrecioDepExtra;
    private javax.swing.JLabel lblPrecioPlan;
    private javax.swing.JLabel lblSubcategoria;
    private javax.swing.JPanel pnlInfoPlan;
    private javax.swing.JLabel statusAnimationLabel;
    private javax.swing.JLabel statusMessageLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JTextField txtNombrePlan;
    // End of variables declaration//GEN-END:variables

}

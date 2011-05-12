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
 * RegistroCategoriaPlan.java
 *
 * Created on 05/04/2011, 02:53:28 PM
 */

package com.prebea.syscafil.ui;

import com.prebea.syscafil.business.CategoriaPlanManager;
import com.prebea.syscafil.business.EmptyFieldValidator;
import com.prebea.syscafil.business.FieldValidator;
import com.prebea.syscafil.business.FormFieldValidator;
import com.prebea.syscafil.model.entities.CategoriaPlan;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.HashMap;
import javax.swing.JLabel;

/**
 *
 * @author Edwin Bratini
 */
public class RegistroCategoriaPlan extends javax.swing.JDialog {

    /** Creates new form RegistroCategoriaPlan */
    public RegistroCategoriaPlan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        btnAceptar = new javax.swing.JButton();
        lblMensajeInsercion = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreCat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcionCat = new javax.swing.JTextField();
        lblNombreCategoriaValMarker = new javax.swing.JLabel();
        lblDescripcionValMarker = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Categoria Plan");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/imagenes/prebea_logo.png")));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/add_25x25.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblMensajeInsercion.setForeground(new java.awt.Color(204, 204, 204));
        lblMensajeInsercion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensajeInsercion.setText("*");

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/salir2-32x32.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));

        jLabel1.setText("Nombre Categoria");

        jLabel2.setText("Descripcion");

        lblNombreCategoriaValMarker.setForeground(new java.awt.Color(255, 51, 51));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtNombreCat, org.jdesktop.beansbinding.ObjectProperty.create(), lblNombreCategoriaValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        lblDescripcionValMarker.setForeground(new java.awt.Color(255, 51, 51));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtDescripcionCat, org.jdesktop.beansbinding.ObjectProperty.create(), lblDescripcionValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreCat, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcionCat, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcionValMarker)
                    .addComponent(lblNombreCategoriaValMarker))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreCategoriaValMarker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescripcionCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcionValMarker))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAceptar)
                .addGap(43, 43, 43)
                .addComponent(lblMensajeInsercion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensajeInsercion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LimpiadorComponentes.limpiarComponentes(this);
        LimpiadorComponentes.limpiarValidationMarkers(this);
    }//GEN-LAST:event_formWindowOpened

    private boolean checkFormFields() {
        boolean validFields = true;

        FieldValidator emptynessVal;
        emptynessVal = new EmptyFieldValidator();
        FieldValidator[] emptynessArr = new FieldValidator[]{emptynessVal};

        HashMap<JLabel, FieldValidator[]> campos = new HashMap<JLabel, FieldValidator[]>();
        campos.put(lblNombreCategoriaValMarker, emptynessArr);
        campos.put(lblDescripcionValMarker, emptynessArr);

        validFields = FormFieldValidator.verifyFormFields(campos);

        return validFields;
    }

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        if (!checkFormFields()) {
            lblMensajeInsercion.setText("Por favor corriga los campos marcados");
            lblMensajeInsercion.setForeground(Color.red);
            //lblMensajeInsercion.setVisible(true);
            new Thread(new LabelToolTipShower(lblMensajeInsercion, 3000)).start();
            return;
        } else {
            CategoriaPlanManager cpm = new CategoriaPlanManager();

            if (cpm.getCategoriaPlanByNombre(txtNombreCat.getText()) != null) {
                lblNombreCategoriaValMarker.setText("*");
                lblNombreCategoriaValMarker.setVisible(true);
                lblMensajeInsercion.setText("Ya existe una categoria de plan con nombre digitado");
                lblMensajeInsercion.setForeground(Color.red);
                lblMensajeInsercion.setVisible(true);
                return;
            }

            CategoriaPlan catPlan = new CategoriaPlan(txtNombreCat.getText(), txtDescripcionCat.getText(), 'A');
            cpm.crearCategoriaPlan(catPlan);

            lblMensajeInsercion.setText("Categoria de plan creada exitosamente");
            lblMensajeInsercion.setForeground(Color.GREEN);
            lblMensajeInsercion.setVisible(true);
            new Thread(new LabelToolTipShower(lblMensajeInsercion)).start();
            LimpiadorComponentes.limpiarComponentes(this);
            txtNombreCat.requestFocusInWindow();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistroCategoriaPlan dialog = new RegistroCategoriaPlan(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDescripcionValMarker;
    private javax.swing.JLabel lblMensajeInsercion;
    private javax.swing.JLabel lblNombreCategoriaValMarker;
    private javax.swing.JTextField txtDescripcionCat;
    private javax.swing.JTextField txtNombreCat;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}

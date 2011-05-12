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
 * RegistroEmpresas.java
 *
 * Created on 05/04/2011, 12:50:26 PM
 */
package com.prebea.syscafil.ui;

import com.prebea.syscafil.business.DefaultComboFieldValueValidator;
import com.prebea.syscafil.business.EmailFieldValidator;
import com.prebea.syscafil.business.FormFieldValidator;
import com.prebea.syscafil.business.EmpresaManager;
import com.prebea.syscafil.business.EmptyFieldValidator;
import com.prebea.syscafil.business.FieldValidator;
import com.prebea.syscafil.business.PhoneFieldValidator;
import com.prebea.syscafil.business.WebFieldValidator;
import com.prebea.syscafil.model.entities.Empresa;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Edwin Bratini
 */
public class RegistroEmpresas extends javax.swing.JFrame {

    /** Creates new form RegistroEmpresas */
    public RegistroEmpresas() {
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

        pnlEntidad = new javax.swing.JPanel();
        lblRazonSocial = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        cmbTipoDni = new javax.swing.JComboBox();
        lblTipoDni = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblContacto = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        lblPosContacto = new javax.swing.JLabel();
        txtPosContacto = new javax.swing.JTextField();
        lblRSValMarker = new javax.swing.JLabel();
        lblDNIValMarker = new javax.swing.JLabel();
        lblTipoDniValMarker = new javax.swing.JLabel();
        lblContactoValMarker = new javax.swing.JLabel();
        lblPosContactoValMarker = new javax.swing.JLabel();
        statusPanel = new javax.swing.JPanel();
        javax.swing.JSeparator statusPanelSeparator = new javax.swing.JSeparator();
        statusMessageLabel = new javax.swing.JLabel();
        statusAnimationLabel = new javax.swing.JLabel();
        lblMensajeInsercion = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        pnlInfoContacto = new javax.swing.JPanel();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtDireccion2 = new javax.swing.JTextField();
        lblCiudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        lblRegion = new javax.swing.JLabel();
        txtRegion = new javax.swing.JTextField();
        lblPais = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        ftfTelefono = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblWeb = new javax.swing.JLabel();
        txtWeb = new javax.swing.JTextField();
        lblFax = new javax.swing.JLabel();
        ftfFax = new javax.swing.JFormattedTextField();
        lblTelValMarker = new javax.swing.JLabel();
        lblDirValMarker = new javax.swing.JLabel();
        lblDir2ValMarker = new javax.swing.JLabel();
        lblCiudadValMarker = new javax.swing.JLabel();
        lblRegionValMarker = new javax.swing.JLabel();
        lblPaisValMarker = new javax.swing.JLabel();
        lblFaxValMarker = new javax.swing.JLabel();
        lblWebValMarker = new javax.swing.JLabel();
        lblEmailValMarker = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Empresas");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/imagenes/prebea_logo.png")));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlEntidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Entidad"));

        lblRazonSocial.setText("Razon Social");

        txtRazonSocial.setName("txtRazonSocial"); // NOI18N

        txtDni.setName("txtDni"); // NOI18N

        cmbTipoDni.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccion", "RNC" }));
        cmbTipoDni.setName("cmbTipoDni"); // NOI18N

        lblTipoDni.setText("Tipo DNI");

        lblDni.setText("DNI");

        lblContacto.setText("Contacto");

        txtContacto.setName("txtContacto"); // NOI18N

        lblPosContacto.setText("Posicion Contacto");

        txtPosContacto.setName("txtPosContacto"); // NOI18N

        lblRSValMarker.setForeground(new java.awt.Color(255, 51, 51));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtRazonSocial, org.jdesktop.beansbinding.ObjectProperty.create(), lblRSValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        lblDNIValMarker.setForeground(new java.awt.Color(255, 51, 51));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtDni, org.jdesktop.beansbinding.ObjectProperty.create(), lblDNIValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        lblTipoDniValMarker.setForeground(new java.awt.Color(255, 51, 51));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cmbTipoDni, org.jdesktop.beansbinding.ObjectProperty.create(), lblTipoDniValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        lblContactoValMarker.setForeground(new java.awt.Color(255, 51, 51));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtContacto, org.jdesktop.beansbinding.ObjectProperty.create(), lblContactoValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        lblPosContactoValMarker.setForeground(new java.awt.Color(255, 51, 51));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtPosContacto, org.jdesktop.beansbinding.ObjectProperty.create(), lblPosContactoValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout pnlEntidadLayout = new javax.swing.GroupLayout(pnlEntidad);
        pnlEntidad.setLayout(pnlEntidadLayout);
        pnlEntidadLayout.setHorizontalGroup(
            pnlEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRazonSocial, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDni, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTipoDni, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblContacto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPosContacto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(txtPosContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRSValMarker, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDNIValMarker, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTipoDniValMarker, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblContactoValMarker, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPosContactoValMarker, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlEntidadLayout.setVerticalGroup(
            pnlEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntidadLayout.createSequentialGroup()
                .addGroup(pnlEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazonSocial)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRSValMarker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDni)
                    .addComponent(lblDNIValMarker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDni)
                    .addComponent(cmbTipoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoDniValMarker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContacto)
                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactoValMarker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPosContacto)
                    .addGroup(pnlEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPosContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPosContactoValMarker)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statusAnimationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanelSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusMessageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
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

        lblMensajeInsercion.setForeground(new java.awt.Color(0, 102, 0));
        lblMensajeInsercion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/salir2-32x32.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/add_25x25.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        pnlInfoContacto.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion de Contacto"));

        lblDireccion.setText("Direccion");

        txtDireccion.setName("txtDireccion"); // NOI18N

        txtDireccion2.setName("txtDireccion2"); // NOI18N

        lblCiudad.setText("Ciudad");

        txtCiudad.setName("txtCiudad"); // NOI18N

        lblRegion.setText("Region");

        txtRegion.setName("txtRegion"); // NOI18N

        lblPais.setText("Pais");

        txtPais.setName("txtPais"); // NOI18N

        lblTelefono.setText("Telefono");

        ftfTelefono.setName("ftfTelefono"); // NOI18N

        lblEmail.setText("Email");

        txtEmail.setName("txtEmail"); // NOI18N

        lblWeb.setText("Web");

        txtWeb.setName("txtWeb"); // NOI18N

        lblFax.setText("Fax");

        ftfFax.setName("ftfFax"); // NOI18N

        lblTelValMarker.setForeground(new java.awt.Color(255, 51, 51));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, ftfTelefono, org.jdesktop.beansbinding.ObjectProperty.create(), lblTelValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        lblDirValMarker.setForeground(new java.awt.Color(255, 51, 51));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtDireccion, org.jdesktop.beansbinding.ObjectProperty.create(), lblDirValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        lblDir2ValMarker.setForeground(new java.awt.Color(255, 51, 51));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtDireccion2, org.jdesktop.beansbinding.ObjectProperty.create(), lblDir2ValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        lblCiudadValMarker.setForeground(new java.awt.Color(255, 51, 51));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtCiudad, org.jdesktop.beansbinding.ObjectProperty.create(), lblCiudadValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        lblRegionValMarker.setForeground(new java.awt.Color(255, 51, 51));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtRegion, org.jdesktop.beansbinding.ObjectProperty.create(), lblRegionValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        lblPaisValMarker.setForeground(new java.awt.Color(255, 51, 51));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtPais, org.jdesktop.beansbinding.ObjectProperty.create(), lblPaisValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        lblFaxValMarker.setForeground(new java.awt.Color(255, 51, 51));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, ftfFax, org.jdesktop.beansbinding.ObjectProperty.create(), lblFaxValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        lblWebValMarker.setForeground(new java.awt.Color(255, 51, 51));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtWeb, org.jdesktop.beansbinding.ObjectProperty.create(), lblWebValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        lblEmailValMarker.setForeground(new java.awt.Color(255, 51, 51));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtEmail, org.jdesktop.beansbinding.ObjectProperty.create(), lblEmailValMarker, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout pnlInfoContactoLayout = new javax.swing.GroupLayout(pnlInfoContacto);
        pnlInfoContacto.setLayout(pnlInfoContactoLayout);
        pnlInfoContactoLayout.setHorizontalGroup(
            pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFax, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblWeb, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCiudad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRegion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPais, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtWeb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCiudad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtRegion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                    .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDireccion2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                    .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ftfFax, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ftfTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelValMarker)
                    .addComponent(lblDirValMarker)
                    .addComponent(lblDir2ValMarker)
                    .addComponent(lblCiudadValMarker)
                    .addComponent(lblRegionValMarker)
                    .addComponent(lblPaisValMarker)
                    .addComponent(lblFaxValMarker)
                    .addComponent(lblWebValMarker)
                    .addComponent(lblEmailValMarker))
                .addContainerGap())
        );
        pnlInfoContactoLayout.setVerticalGroup(
            pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(ftfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelValMarker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFax)
                    .addComponent(ftfFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFaxValMarker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailValMarker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeb)
                    .addComponent(txtWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWebValMarker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDirValMarker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDir2ValMarker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCiudadValMarker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegion)
                    .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRegionValMarker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPais)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaisValMarker))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlEntidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlInfoContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMensajeInsercion, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addGap(176, 176, 176)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlInfoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMensajeInsercion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        FieldValidator emptynessVal, DefCombVal, phoneVal, emailVal, webVal;
        emptynessVal = new EmptyFieldValidator();
        DefCombVal = new DefaultComboFieldValueValidator();
        phoneVal = new PhoneFieldValidator();
        emailVal = new EmailFieldValidator();
        webVal = new WebFieldValidator();

        FieldValidator[] emptynessArr = new FieldValidator[]{emptynessVal};

        HashMap<JLabel, FieldValidator[]> campos = new HashMap<JLabel, FieldValidator[]>();
        campos.put(lblRSValMarker, emptynessArr);
        campos.put(lblDNIValMarker, emptynessArr);
        campos.put(lblTipoDniValMarker, new FieldValidator[]{DefCombVal});
        campos.put(lblContactoValMarker, emptynessArr);
        campos.put(lblPosContactoValMarker, emptynessArr);
        campos.put(lblTelValMarker, new FieldValidator[]{emptynessVal, phoneVal});

        if (!((JTextComponent) lblFaxValMarker.getLabelFor()).getText().isEmpty()) {
            campos.put(lblFaxValMarker, new FieldValidator[]{phoneVal});
        }

        if (!((JTextComponent) lblEmailValMarker.getLabelFor()).getText().isEmpty()) {
            campos.put(lblEmailValMarker, new FieldValidator[]{emailVal});
        }

        if (!((JTextComponent) lblWebValMarker.getLabelFor()).getText().isEmpty()) {
            campos.put(lblWebValMarker, new FieldValidator[]{webVal});
        }

        campos.put(lblDirValMarker, emptynessArr);
        campos.put(lblDir2ValMarker, emptynessArr);
        campos.put(lblCiudadValMarker, emptynessArr);
        campos.put(lblRegionValMarker, emptynessArr);
        campos.put(lblPaisValMarker, emptynessArr);

        validFields = FormFieldValidator.verifyFormFields(campos);

        return validFields;
    }

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        if (!checkFormFields()) {
            lblMensajeInsercion.setText("Por favor corriga los campos marcados");
            lblMensajeInsercion.setForeground(Color.red);
            //lblMensajeInsercion.setVisible(true);
            new Thread(new LabelToolTipShower(lblMensajeInsercion, 3000)).start();
            return;
        } else {
            //lblMensajeInsercion.setText("");
            lblMensajeInsercion.setVisible(false);

            EmpresaManager em = new EmpresaManager();

            if (em.getEmpresaByDNI(txtDni.getText()) != null) {
                lblDNIValMarker.setText("*");
                lblDNIValMarker.setVisible(true);
                lblMensajeInsercion.setText("Ya existe una empresa con DNI digitado");
                lblMensajeInsercion.setForeground(Color.red);
                lblMensajeInsercion.setVisible(true);
                return;
            }

            Empresa empresa = new Empresa(txtRazonSocial.getText(), txtDni.getText(), cmbTipoDni.getSelectedItem().toString(), txtContacto.getText(),
                    txtPosContacto.getText(), ftfTelefono.getText(), String.format("%s %s", txtDireccion.getText(), txtDireccion2.getText()),
                    txtCiudad.getText(), txtRegion.getText(), txtPais.getText(), 'A');
            empresa.setEmpFax((ftfFax.getText().isEmpty() ? null : ftfFax.getText()));
            empresa.setEmpEmail((txtEmail.getText().isEmpty() ? null : txtEmail.getText()));
            empresa.setEmpWeb((txtWeb.getText().isEmpty() ? null : txtWeb.getText()));

            em.crearEmpresa(empresa);

            lblMensajeInsercion.setText("Empresa creada exitosamente");
            lblMensajeInsercion.setForeground(Color.GREEN);
            lblMensajeInsercion.setVisible(true);
            new Thread(new LabelToolTipShower(lblMensajeInsercion)).start();
            LimpiadorComponentes.limpiarComponentes(this);
            txtRazonSocial.requestFocusInWindow();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new RegistroEmpresas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbTipoDni;
    private javax.swing.JFormattedTextField ftfFax;
    private javax.swing.JFormattedTextField ftfTelefono;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCiudadValMarker;
    private javax.swing.JLabel lblContacto;
    private javax.swing.JLabel lblContactoValMarker;
    private javax.swing.JLabel lblDNIValMarker;
    private javax.swing.JLabel lblDir2ValMarker;
    private javax.swing.JLabel lblDirValMarker;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailValMarker;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblFaxValMarker;
    private javax.swing.JLabel lblMensajeInsercion;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPaisValMarker;
    private javax.swing.JLabel lblPosContacto;
    private javax.swing.JLabel lblPosContactoValMarker;
    private javax.swing.JLabel lblRSValMarker;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblRegionValMarker;
    private javax.swing.JLabel lblTelValMarker;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoDni;
    private javax.swing.JLabel lblTipoDniValMarker;
    private javax.swing.JLabel lblWeb;
    private javax.swing.JLabel lblWebValMarker;
    private javax.swing.JPanel pnlEntidad;
    private javax.swing.JPanel pnlInfoContacto;
    private javax.swing.JLabel statusAnimationLabel;
    private javax.swing.JLabel statusMessageLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccion2;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPosContacto;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRegion;
    private javax.swing.JTextField txtWeb;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

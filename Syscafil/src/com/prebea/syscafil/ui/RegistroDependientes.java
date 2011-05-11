/*
 *  The MIT License
 * 
 *  Copyright 2011 Edwin Bratini <edwin.bratini@gmail.com>.
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
 * RegistroAfiliados.java
 *
 * Created on May 2, 2011, 1:17:14 PM
 */

package com.prebea.syscafil.ui;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Edwin Bratini <edwin.bratini@gmail.com>
 */
public class RegistroDependientes extends javax.swing.JFrame {

    /** Creates new form RegistroAfiliados */
    public RegistroDependientes() {
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

        bgrPEmpresa = new javax.swing.ButtonGroup();
        statusPanel = new javax.swing.JPanel();
        javax.swing.JSeparator statusPanelSeparator = new javax.swing.JSeparator();
        statusMessageLabel = new javax.swing.JLabel();
        statusAnimationLabel = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pnlInfoPersonal = new javax.swing.JPanel();
        cmbTipoDni = new javax.swing.JComboBox();
        txtDni = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblTipoDni = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        ftfFechaNacimiento = new javax.swing.JFormattedTextField();
        lblLugarNacimiento = new javax.swing.JLabel();
        txtLugarNacimiento = new javax.swing.JTextField();
        lblNacionalidad = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox();
        lblEstadoCivil = new javax.swing.JLabel();
        cmbEstadoCivil = new javax.swing.JComboBox();
        lblAsterVal2 = new javax.swing.JLabel();
        lblAsterVal3 = new javax.swing.JLabel();
        lblAsterVal4 = new javax.swing.JLabel();
        lblAsterVal5 = new javax.swing.JLabel();
        lblAsterVal10 = new javax.swing.JLabel();
        lblAsterVal9 = new javax.swing.JLabel();
        lblAsterVal8 = new javax.swing.JLabel();
        lblAsterVal6 = new javax.swing.JLabel();
        lblAsterVal7 = new javax.swing.JLabel();
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
        lblAsterVal11 = new javax.swing.JLabel();
        lblAsterVal12 = new javax.swing.JLabel();
        lblAsterVal13 = new javax.swing.JLabel();
        lblAsterVal14 = new javax.swing.JLabel();
        lblAsterVal15 = new javax.swing.JLabel();
        lblAsterVal16 = new javax.swing.JLabel();
        lblAsterVal17 = new javax.swing.JLabel();
        pnlInfoServicio = new javax.swing.JPanel();
        ftfFechaIngreso = new javax.swing.JFormattedTextField();
        lblFechaIngreso = new javax.swing.JLabel();
        lblAfiliado = new javax.swing.JLabel();
        txtAfiliado = new javax.swing.JTextField();
        lblParentesco = new javax.swing.JLabel();
        txtParentesco = new javax.swing.JTextField();
        chkDepExtra = new javax.swing.JCheckBox();
        btnBuscar = new javax.swing.JButton();
        lblAsterVal18 = new javax.swing.JLabel();
        lblAsterVal19 = new javax.swing.JLabel();
        lblMensajeInsercion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Dependientes");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/imagenes/prebea_logo.png")));
        setName("frmRegistroAfiliado"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        statusAnimationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanelSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusMessageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 796, Short.MAX_VALUE)
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

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/salir_25x25.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));

        pnlInfoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion Personal"));

        cmbTipoDni.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccion", "Cedula", "Pasaporte", "Seguro Social" }));

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblDni.setText("DNI");

        lblTipoDni.setText("Tipo DNI");

        lblFechaNacimiento.setText("Fecha Nacimiento");

        lblLugarNacimiento.setText("Lugar de Nacimiento");

        lblNacionalidad.setText("Nacionalidad");

        lblGenero.setText("Genero");

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccion", "Femenino", "Masculino" }));

        lblEstadoCivil.setText("Estado Civil");

        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccion", "Casado(a)", "Soltero(a)", "Divorciado(a)", "Viudo(a)" }));

        lblAsterVal2.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal3.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal4.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal5.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal10.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal9.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal8.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal6.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal7.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout pnlInfoPersonalLayout = new javax.swing.GroupLayout(pnlInfoPersonal);
        pnlInfoPersonal.setLayout(pnlInfoPersonalLayout);
        pnlInfoPersonalLayout.setHorizontalGroup(
            pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstadoCivil, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGenero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNacionalidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLugarNacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTipoDni, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDni, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ftfFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbTipoDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNacionalidad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAsterVal2)
                    .addComponent(lblAsterVal3)
                    .addComponent(lblAsterVal4)
                    .addComponent(lblAsterVal5)
                    .addComponent(lblAsterVal10)
                    .addComponent(lblAsterVal9)
                    .addComponent(lblAsterVal8)
                    .addComponent(lblAsterVal6)
                    .addComponent(lblAsterVal7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInfoPersonalLayout.setVerticalGroup(
            pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(lblAsterVal2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido)
                    .addComponent(lblAsterVal3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDni)
                    .addComponent(lblAsterVal4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDni)
                    .addComponent(cmbTipoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsterVal5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(ftfFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsterVal10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLugarNacimiento)
                    .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsterVal9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNacionalidad)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsterVal8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsterVal7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoCivil)
                    .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsterVal6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblNombre.getAccessibleContext().setAccessibleName(null);

        pnlInfoContacto.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion de Contacto"));

        lblDireccion.setText("Direccion");

        lblCiudad.setText("Ciudad");

        lblRegion.setText("Region");

        lblPais.setText("Pais");

        lblTelefono.setText("Telefono");

        lblEmail.setText("Email");

        lblAsterVal11.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal12.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal13.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal14.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal15.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal16.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal17.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout pnlInfoContactoLayout = new javax.swing.GroupLayout(pnlInfoContacto);
        pnlInfoContacto.setLayout(pnlInfoContactoLayout);
        pnlInfoContactoLayout.setHorizontalGroup(
            pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCiudad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRegion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPais, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(txtDireccion2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAsterVal11)
                    .addComponent(lblAsterVal12)
                    .addComponent(lblAsterVal13)
                    .addComponent(lblAsterVal14)
                    .addComponent(lblAsterVal15)
                    .addComponent(lblAsterVal16)
                    .addComponent(lblAsterVal17))
                .addContainerGap())
        );
        pnlInfoContactoLayout.setVerticalGroup(
            pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(ftfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsterVal11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsterVal12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsterVal13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsterVal14))
                .addGap(9, 9, 9)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCiudad)
                    .addComponent(lblAsterVal15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegion)
                    .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsterVal16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPais)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsterVal17))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pnlInfoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion de Servicio"));

        lblFechaIngreso.setText("Fecha Ingreso");

        lblAfiliado.setText("Afiliado");

        txtAfiliado.setEditable(false);

        lblParentesco.setText("Parentesco");

        chkDepExtra.setText("Dependiente Extra");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagenes/searchglass_vflip.gif"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblAsterVal18.setForeground(new java.awt.Color(255, 51, 51));

        lblAsterVal19.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout pnlInfoServicioLayout = new javax.swing.GroupLayout(pnlInfoServicio);
        pnlInfoServicio.setLayout(pnlInfoServicioLayout);
        pnlInfoServicioLayout.setHorizontalGroup(
            pnlInfoServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoServicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFechaIngreso)
                    .addComponent(lblAfiliado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInfoServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlInfoServicioLayout.createSequentialGroup()
                        .addComponent(txtAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfoServicioLayout.createSequentialGroup()
                        .addComponent(ftfFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAsterVal18)))
                .addGap(75, 75, 75)
                .addComponent(lblParentesco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInfoServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoServicioLayout.createSequentialGroup()
                        .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAsterVal19))
                    .addComponent(chkDepExtra))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnlInfoServicioLayout.setVerticalGroup(
            pnlInfoServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoServicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoServicioLayout.createSequentialGroup()
                        .addGroup(pnlInfoServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaIngreso)
                            .addComponent(ftfFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAsterVal18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfoServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInfoServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAfiliado)
                                .addComponent(lblAfiliado)))
                        .addGap(20, 20, 20))
                    .addGroup(pnlInfoServicioLayout.createSequentialGroup()
                        .addGroup(pnlInfoServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAsterVal19)
                            .addComponent(lblParentesco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkDepExtra)
                        .addContainerGap(19, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlInfoServicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlInfoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlInfoContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlInfoContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInfoPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(pnlInfoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblMensajeInsercion.setForeground(new java.awt.Color(204, 204, 204));
        lblMensajeInsercion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(189, 189, 189)
                .addComponent(lblMensajeInsercion, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMensajeInsercion))
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        BusquedaRapida br = new BusquedaRapida();
        br.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        br.setLocationRelativeTo(this);
        br.setTitle("Buscar Afiliado");
        br.getLblEntidades().setText("Afiliados");
        br.getRdbField1().setText("Id");
        br.getRdbField2().setText("DNI");
        br.getRdbField3().setText("Apellido");
        br.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LimpiadorComponentes.limpiarComponentes(this);
        LimpiadorComponentes.limpiarValidationMarkers(this);
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDependientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrPEmpresa;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chkDepExtra;
    private javax.swing.JComboBox cmbEstadoCivil;
    private javax.swing.JComboBox cmbGenero;
    private javax.swing.JComboBox cmbTipoDni;
    private javax.swing.JFormattedTextField ftfFechaIngreso;
    private javax.swing.JFormattedTextField ftfFechaNacimiento;
    private javax.swing.JFormattedTextField ftfTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAfiliado;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblAsterVal10;
    private javax.swing.JLabel lblAsterVal11;
    private javax.swing.JLabel lblAsterVal12;
    private javax.swing.JLabel lblAsterVal13;
    private javax.swing.JLabel lblAsterVal14;
    private javax.swing.JLabel lblAsterVal15;
    private javax.swing.JLabel lblAsterVal16;
    private javax.swing.JLabel lblAsterVal17;
    private javax.swing.JLabel lblAsterVal18;
    private javax.swing.JLabel lblAsterVal19;
    private javax.swing.JLabel lblAsterVal2;
    private javax.swing.JLabel lblAsterVal3;
    private javax.swing.JLabel lblAsterVal4;
    private javax.swing.JLabel lblAsterVal5;
    private javax.swing.JLabel lblAsterVal6;
    private javax.swing.JLabel lblAsterVal7;
    private javax.swing.JLabel lblAsterVal8;
    private javax.swing.JLabel lblAsterVal9;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblLugarNacimiento;
    private javax.swing.JLabel lblMensajeInsercion;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblParentesco;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoDni;
    private javax.swing.JPanel pnlInfoContacto;
    private javax.swing.JPanel pnlInfoPersonal;
    private javax.swing.JPanel pnlInfoServicio;
    private javax.swing.JLabel statusAnimationLabel;
    private javax.swing.JLabel statusMessageLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JTextField txtAfiliado;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccion2;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLugarNacimiento;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtParentesco;
    private javax.swing.JTextField txtRegion;
    // End of variables declaration//GEN-END:variables

}

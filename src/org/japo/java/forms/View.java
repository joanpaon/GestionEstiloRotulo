/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.forms;

import java.net.URL;
import javax.swing.ImageIcon;
import org.japo.java.controllers.Controller;
import org.japo.java.entities.Model;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class View extends javax.swing.JFrame {

    // Referencias 
    private Model model;
    private Controller control;

    // Constructor
    public View() {
        // Inicializar GUI - PREVIA
        beforeInit();

        // Construcción - GUI
        initComponents();

        // Inicializar GUI - POSTERIOR
        afterInit();
    }

    // Inicializar GUI - PREVIA
    private void beforeInit() {
        // Generar Modelo
        model = new Model();

        // Generar Controlador
        control = new Controller(model, this);

        // Restaurar Estado Previo
        control.restaurarEstadoApp();

        // Otras inicializaciones
    }

    // Inicializar GUI - POSTERIOR
    private void afterInit() {
        // Icono Ventana - Recurso
        URL urlICN = ClassLoader.getSystemResource("img/favicon.png");
        setIconImage(new ImageIcon(urlICN).getImage());

//        // Escuchador Cambio Texto
//        txfTexto.getDocument().addDocumentListener(new DEM(control));
        // Modelo > Vista
        control.sincronizarModeloVista(model, this);

        // Enfocar Control Inicial
        btnCargar.requestFocus();

        // Otras inicializaciones
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAjustes = new javax.swing.JPanel();
        cbxNegrita = new javax.swing.JCheckBox();
        cbxCursiva = new javax.swing.JCheckBox();
        pnlControles = new javax.swing.JPanel();
        btnCargar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblRotulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión Estilo Rótulo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlAjustes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ajustes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        cbxNegrita.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        cbxNegrita.setText("Negrita");
        cbxNegrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNegritaActionPerformed(evt);
            }
        });

        cbxCursiva.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        cbxCursiva.setText("Cursiva");
        cbxCursiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCursivaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAjustesLayout = new javax.swing.GroupLayout(pnlAjustes);
        pnlAjustes.setLayout(pnlAjustesLayout);
        pnlAjustesLayout.setHorizontalGroup(
            pnlAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAjustesLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(cbxNegrita)
                .addGap(75, 75, 75)
                .addComponent(cbxCursiva, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        pnlAjustesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxCursiva, cbxNegrita});

        pnlAjustesLayout.setVerticalGroup(
            pnlAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAjustesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxNegrita)
                    .addComponent(cbxCursiva))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAjustesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxCursiva, cbxNegrita});

        pnlControles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        btnCargar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlControlesLayout = new javax.swing.GroupLayout(pnlControles);
        pnlControles.setLayout(pnlControlesLayout);
        pnlControlesLayout.setHorizontalGroup(
            pnlControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlesLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        pnlControlesLayout.setVerticalGroup(
            pnlControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(btnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Display", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        lblRotulo.setBackground(java.awt.Color.white);
        lblRotulo.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        lblRotulo.setForeground(java.awt.Color.black);
        lblRotulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRotulo.setText("Texto de Prueba");
        lblRotulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblRotulo.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel1, pnlAjustes, pnlControles});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        control.procesarCierreVentana(evt);
    }//GEN-LAST:event_formWindowClosing

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        control.procesarImportacion(evt);
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        control.procesarExportacion(evt);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxNegritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNegritaActionPerformed
        control.procesarNegrita(evt);
    }//GEN-LAST:event_cbxNegritaActionPerformed

    private void cbxCursivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCursivaActionPerformed
        control.procesarCursiva(evt);
    }//GEN-LAST:event_cbxCursivaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnGuardar;
    public javax.swing.JCheckBox cbxCursiva;
    public javax.swing.JCheckBox cbxNegrita;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblRotulo;
    private javax.swing.JPanel pnlAjustes;
    private javax.swing.JPanel pnlControles;
    // End of variables declaration//GEN-END:variables

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}

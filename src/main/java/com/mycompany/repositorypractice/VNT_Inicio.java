/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.repositorypractice;

/**
 *
 * @author mendlez12
 */
public class VNT_Inicio extends javax.swing.JFrame {

    /**
     * Creates new form VNT_Inicio
     */
    public VNT_Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        BTN_Inicio = new javax.swing.JButton();
        BTN_Explorar = new javax.swing.JButton();
        BTN_Notif = new javax.swing.JButton();
        BTN_Perfil = new javax.swing.JButton();
        BTN_Config = new javax.swing.JButton();
        FLD_Buscar = new javax.swing.JTextField();
        BTN_Buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FLD_Publicar = new javax.swing.JTextArea();
        BTN_Publicar = new javax.swing.JButton();
        BTN_Comun = new javax.swing.JButton();
        BTN_Listas = new javax.swing.JButton();
        PNL_Icono = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 50), new java.awt.Dimension(0, 50), new java.awt.Dimension(32767, 50));
        LST_Tendencias = new java.awt.List();
        PAN_Posts = new java.awt.ScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        BTN_Inicio.setBackground(new java.awt.Color(30, 30, 30));
        BTN_Inicio.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        BTN_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Inicio.setText("Inicio");
        BTN_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_InicioActionPerformed(evt);
            }
        });

        BTN_Explorar.setBackground(new java.awt.Color(30, 30, 30));
        BTN_Explorar.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        BTN_Explorar.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Explorar.setText("Explorar");
        BTN_Explorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ExplorarActionPerformed(evt);
            }
        });

        BTN_Notif.setBackground(new java.awt.Color(30, 30, 30));
        BTN_Notif.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        BTN_Notif.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Notif.setText("Notificaciones");
        BTN_Notif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NotifActionPerformed(evt);
            }
        });

        BTN_Perfil.setBackground(new java.awt.Color(30, 30, 30));
        BTN_Perfil.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        BTN_Perfil.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Perfil.setText("Perfil");
        BTN_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PerfilActionPerformed(evt);
            }
        });

        BTN_Config.setBackground(new java.awt.Color(30, 30, 30));
        BTN_Config.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        BTN_Config.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Config.setText("Configuración");
        BTN_Config.setToolTipText("");
        BTN_Config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ConfigActionPerformed(evt);
            }
        });

        BTN_Buscar.setText("Buscar");

        FLD_Publicar.setColumns(20);
        FLD_Publicar.setRows(5);
        FLD_Publicar.setText("Que estas pensando?");
        FLD_Publicar.setToolTipText("");
        jScrollPane1.setViewportView(FLD_Publicar);
        FLD_Publicar.getAccessibleContext().setAccessibleName("ID_FLD_Publicar");

        BTN_Publicar.setText("Postear");

        BTN_Comun.setBackground(new java.awt.Color(30, 30, 30));
        BTN_Comun.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        BTN_Comun.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Comun.setText("Comunidades");
        BTN_Comun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ComunActionPerformed(evt);
            }
        });

        BTN_Listas.setBackground(new java.awt.Color(30, 30, 30));
        BTN_Listas.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        BTN_Listas.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Listas.setText("Listas");
        BTN_Listas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ListasActionPerformed(evt);
            }
        });

        PNL_Icono.setBackground(new java.awt.Color(51, 255, 153));

        javax.swing.GroupLayout PNL_IconoLayout = new javax.swing.GroupLayout(PNL_Icono);
        PNL_Icono.setLayout(PNL_IconoLayout);
        PNL_IconoLayout.setHorizontalGroup(
            PNL_IconoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );
        PNL_IconoLayout.setVerticalGroup(
            PNL_IconoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        LST_Tendencias.setBackground(new java.awt.Color(30, 30, 30));
        LST_Tendencias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LST_Tendencias.setName("Tendencias"); // NOI18N

        PAN_Posts.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PAN_Posts.setName("Posts"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BTN_Notif)
                                .addComponent(BTN_Inicio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BTN_Perfil, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BTN_Explorar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BTN_Config, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(BTN_Listas)
                            .addComponent(BTN_Comun))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PNL_Icono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addComponent(PAN_Posts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BTN_Publicar)
                        .addGap(9, 9, 9)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FLD_Buscar))
                    .addComponent(LST_Tendencias, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Buscar)
                    .addComponent(FLD_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(512, 512, 512)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LST_Tendencias, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Publicar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PAN_Posts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(PNL_Icono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(BTN_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Explorar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Notif, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Comun, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Listas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Config, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1)))
        );

        BTN_Inicio.getAccessibleContext().setAccessibleName("ID_BTN_Inicio");
        BTN_Explorar.getAccessibleContext().setAccessibleName("ID_BTN_Buscar");
        BTN_Notif.getAccessibleContext().setAccessibleName("ID_BTN_Notif");
        BTN_Perfil.getAccessibleContext().setAccessibleName("ID_BTN_Perfil");
        BTN_Config.getAccessibleContext().setAccessibleName("ID_BTN_Config");
        FLD_Buscar.getAccessibleContext().setAccessibleName("ID_FLD_Publicar");
        BTN_Buscar.getAccessibleContext().setAccessibleName("ID_BTN_Buscar");
        BTN_Publicar.getAccessibleContext().setAccessibleName("ID_BTN_Publicar");
        BTN_Comun.getAccessibleContext().setAccessibleName("ID_BTN_Comun");
        BTN_Listas.getAccessibleContext().setAccessibleName("ID_BTN_Listas");
        PNL_Icono.getAccessibleContext().setAccessibleName("ID_PNL_Icono");
        LST_Tendencias.getAccessibleContext().setAccessibleName("ID_LST_Tendencias");
        PAN_Posts.getAccessibleContext().setAccessibleName("ID_PAN_Posts");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_InicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_InicioActionPerformed

    private void BTN_ExplorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ExplorarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_ExplorarActionPerformed

    private void BTN_NotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NotifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_NotifActionPerformed

    private void BTN_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_PerfilActionPerformed

    private void BTN_ConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_ConfigActionPerformed

    private void BTN_ComunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ComunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_ComunActionPerformed

    private void BTN_ListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ListasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_ListasActionPerformed

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
            java.util.logging.Logger.getLogger(VNT_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VNT_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VNT_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VNT_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VNT_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Buscar;
    private javax.swing.JButton BTN_Comun;
    private javax.swing.JButton BTN_Config;
    private javax.swing.JButton BTN_Explorar;
    private javax.swing.JButton BTN_Inicio;
    private javax.swing.JButton BTN_Listas;
    private javax.swing.JButton BTN_Notif;
    private javax.swing.JButton BTN_Perfil;
    private javax.swing.JButton BTN_Publicar;
    private javax.swing.JTextField FLD_Buscar;
    private javax.swing.JTextArea FLD_Publicar;
    private java.awt.List LST_Tendencias;
    private java.awt.ScrollPane PAN_Posts;
    private javax.swing.JPanel PNL_Icono;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

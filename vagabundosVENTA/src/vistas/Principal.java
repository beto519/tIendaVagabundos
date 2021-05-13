/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.ImagenFondo;
import javax.swing.JOptionPane;
import negocio.EmpleadoDAOIMP;

/**
 *
 * @author Carlos Soto Pacheco
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public static long codigoEmpleado;
    EmpleadoDAOIMP empleadoM = new EmpleadoDAOIMP();

    public Principal() {
        initComponents();
        contenido.setBorder(new ImagenFondo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        contenido = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemEditarEmpleado = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnEliminarProductos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        btnInventario = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu8 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        contenido.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        jMenuBar1.setMinimumSize(new java.awt.Dimension(0, 8));

        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono2/Venta.png"))); // NOI18N
        jMenu1.setText("Venta   ");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jMenuItem4.setText("Registrar venta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono2/icons8_shirt_30px.png"))); // NOI18N
        jMenu2.setText("Productos   ");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jMenuItem1.setText("Registrar Productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator2);

        jMenuItemEditarEmpleado.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jMenuItemEditarEmpleado.setText("Editar Producto");
        jMenuItemEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarEmpleadoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemEditarEmpleado);
        jMenu2.add(jSeparator1);

        btnEliminarProductos.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        btnEliminarProductos.setText("Eliminar Productos");
        btnEliminarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductosActionPerformed(evt);
            }
        });
        jMenu2.add(btnEliminarProductos);
        jMenu2.add(jSeparator3);

        btnInventario.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        jMenu2.add(btnInventario);
        jMenu2.add(jSeparator4);

        jMenuBar1.add(jMenu2);

        jMenu8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono2/report.png"))); // NOI18N
        jMenu8.setText("Reportes   ");
        jMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu8);

        jMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono2/icons8_money_30px_1.png"))); // NOI18N
        jMenu3.setText("Cajero   ");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono2/icons8_user_30px.png"))); // NOI18N
        jMenu9.setText("Empleados   ");
        jMenu9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jMenuItem2.setText("Registrar Empleado");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem2);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        long codigo = Long.valueOf(JOptionPane.showInputDialog("Ingrese codigo de autorización"));

        long codigoA = empleadoM.autorizacion(codigo);
        if (codigoA > 0) {

            RegistrarProductos registrar = new RegistrarProductos();
            registrar.setVisible(true);
            contenido.add(registrar);
        } else {

            JOptionPane.showMessageDialog(null, "codigo no valido",
                    "Hey!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
long codigo = Long.valueOf(JOptionPane.showInputDialog("Ingrese codigo de autorización"));

        long codigoA = empleadoM.autorizacion(codigo);
        if (codigoA > 0) {

            RegistrarEmpleado registrar = new RegistrarEmpleado();
            registrar.setVisible(true);
            contenido.add(registrar);
        } else {

            JOptionPane.showMessageDialog(null, "codigo no valido",
                    "Hey!", JOptionPane.ERROR_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItemEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarEmpleadoActionPerformed
        // TODO add your handling code here:
        
        long codigo = Long.valueOf(JOptionPane.showInputDialog("Ingrese codigo de autorización"));

        long codigoA = empleadoM.autorizacion(codigo);
        if (codigoA > 0) {

            EditarProductos Editar = new EditarProductos();
            Editar.setVisible(true);
            contenido.add(Editar);
        } else {

            JOptionPane.showMessageDialog(null, "codigo no valido",
                    "Hey!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemEditarEmpleadoActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
       
        

            Inventario inventario = new Inventario();
            inventario.setVisible(true);
            contenido.add(inventario);
       
           
        

        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        RealizarVenta mostrar = new RealizarVenta();
        mostrar.setVisible(true);
        contenido.add(mostrar);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnEliminarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductosActionPerformed
    long codigo = Long.valueOf(JOptionPane.showInputDialog("Ingrese codigo de autorización"));

        long codigoA = empleadoM.autorizacion(codigo);
        if (codigoA > 0) {

            EliminarProductos eliminar = new EliminarProductos();
            eliminar.setVisible(true);
            contenido.add(eliminar);
        } else {

            JOptionPane.showMessageDialog(null, "codigo no valido",
                    "Hey!", JOptionPane.ERROR_MESSAGE);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProductosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnEliminarProductos;
    private javax.swing.JMenuItem btnInventario;
    private javax.swing.JDesktopPane contenido;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemEditarEmpleado;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}

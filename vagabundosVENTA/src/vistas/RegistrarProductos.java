/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import negocio.ProductoDAOIMP;

/**
 *
 * @author Carlos Soto Pacheco
 */
public class RegistrarProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistrarProductos
     */
    public RegistrarProductos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void RegistrarProductos() {
        Producto producto = new Producto();
        ProductoDAOIMP DAOProducto = new ProductoDAOIMP();
        try {

            String nombreProducto = txtNombreProducto.getText();
            int cantidad = Integer.valueOf(txtCantidadProducto.getText());
            double precio = Double.parseDouble(txtPrecioProducto.getText());
            long codigo = Long.parseLong(txtCodigoProducto.getText());
            
            
            if (!nombreProducto.equals("")) {
                producto.setNombreProducto(nombreProducto);
                producto.setCantidadProducto(cantidad);
                producto.setPrecioProducto(precio);
                producto.setCodigo(String.valueOf(codigo));
                boolean result = DAOProducto.agregar(producto);

                if (result) {
                    JOptionPane.showMessageDialog(null, "Registro exitoso", "Mensaje",
                            JOptionPane.DEFAULT_OPTION);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar", "Alerta",
                            JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese todos los campos", "Alerta",
                        JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreProducto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidadProducto = new javax.swing.JTextField();
        lblCantidadProductos = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        lblCantidadProductos1 = new javax.swing.JLabel();
        txtPrecioProducto = new javax.swing.JTextField();
        btnGuardarRegistrarProductos = new javax.swing.JButton();
        lblNombreProducto1 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registrar Productos");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        lblNombreProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreProducto.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registrar Productos ");

        txtCantidadProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCantidadProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCantidadProductos.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidadProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadProductos.setText("Precio");

        txtNombreProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });

        lblCantidadProductos1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCantidadProductos1.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidadProductos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCantidadProductos1.setText("Cantidad");

        txtPrecioProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnGuardarRegistrarProductos.setBackground(new java.awt.Color(0, 51, 51));
        btnGuardarRegistrarProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardarRegistrarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save_norm.png"))); // NOI18N
        btnGuardarRegistrarProductos.setBorder(null);
        btnGuardarRegistrarProductos.setContentAreaFilled(false);
        btnGuardarRegistrarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarRegistrarProductos.setFocusPainted(false);
        btnGuardarRegistrarProductos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save_roll.png"))); // NOI18N
        btnGuardarRegistrarProductos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save_press.png"))); // NOI18N
        btnGuardarRegistrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegistrarProductosActionPerformed(evt);
            }
        });

        lblNombreProducto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreProducto1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreProducto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreProducto1.setText("Codigo");

        txtCodigoProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardarRegistrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombreProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantidadProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecioProducto)
                            .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidadProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblCantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(btnGuardarRegistrarProductos)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void btnGuardarRegistrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegistrarProductosActionPerformed

        RegistrarProductos();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarRegistrarProductosActionPerformed

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarRegistrarProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCantidadProductos;
    private javax.swing.JLabel lblCantidadProductos1;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblNombreProducto1;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    // End of variables declaration//GEN-END:variables
}

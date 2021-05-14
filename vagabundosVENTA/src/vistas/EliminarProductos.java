/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lopez
 */
public class EliminarProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form EliminarProductos
     */
    public EliminarProductos() {
        initComponents();
        LlenarTabla();
    }


    private void LlenarTabla() {
        txtID.setVisible(false);

  

        if (txtBuscar.getText().equals("")) {
            List<ProductoWS.Producto> list = buscarTodos();
            String Info[][] = new String[list.size()][5];
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Cantidad");
            model.addColumn("Precio");
                model.addColumn("Codigo");

            for (int i = 0; i < list.size(); i++) {

                model.addRow(
                        new Object[]{list.get(i)
                                    .getIdProducto(),list.get(i)
                                    .getNombreProducto(), list.get(i).getCantidadProducto(), list.get(i)
                            .getPrecioProducto(), list.get(i)
                            .getCodigo()}
                );

                jtableProductos.setModel(model);
            }
        } else if (!txtBuscar.equals("")) {
            String nombreProducto = txtBuscar.getText().toString() + "";
            List<ProductoWS.Producto> list = buscarPorNombre(nombreProducto);
            String Info[][] = new String[list.size()][5];
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Cantidad");
            model.addColumn("Precio");
                model.addColumn("Codigo");

            for (int i = 0; i < list.size(); i++) {

                model.addRow(
                        new Object[]{list.get(i)
                                    .getIdProducto(),list.get(i)
                                    .getNombreProducto(), list.get(i).getCantidadProducto(), list.get(i)
                            .getPrecioProducto(), list.get(i)
                            .getCodigo()}
                );

                jtableProductos.setModel(model);
            }
        }

    }

    private void EliminarProductos() {
 int idProducto = Integer.valueOf(txtID.getText());
      
        
        eliminar(idProducto);

  JOptionPane.showMessageDialog(null, "Eliminacion exitosa", "Mensaje",
                        JOptionPane.DEFAULT_OPTION);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableProductos = new javax.swing.JTable();
        btnElimarProductos = new javax.swing.JButton();
        btnGuardarRegistrarEmpleado = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        jtableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Cantidad", "Precio", "Codigo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtableProductos);

        btnElimarProductos.setBackground(new java.awt.Color(0, 51, 51));
        btnElimarProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnElimarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_norm.png"))); // NOI18N
        btnElimarProductos.setBorder(null);
        btnElimarProductos.setContentAreaFilled(false);
        btnElimarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElimarProductos.setFocusPainted(false);
        btnElimarProductos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_roll.png"))); // NOI18N
        btnElimarProductos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_press.png"))); // NOI18N
        btnElimarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnElimarProductosMouseClicked(evt);
            }
        });
        btnElimarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimarProductosActionPerformed(evt);
            }
        });

        btnGuardarRegistrarEmpleado.setBackground(new java.awt.Color(0, 51, 51));
        btnGuardarRegistrarEmpleado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardarRegistrarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/upd_norm.png"))); // NOI18N
        btnGuardarRegistrarEmpleado.setBorder(null);
        btnGuardarRegistrarEmpleado.setContentAreaFilled(false);
        btnGuardarRegistrarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarRegistrarEmpleado.setFocusPainted(false);
        btnGuardarRegistrarEmpleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/upd_roll.png"))); // NOI18N
        btnGuardarRegistrarEmpleado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/upd_press.png"))); // NOI18N
        btnGuardarRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegistrarEmpleadoActionPerformed(evt);
            }
        });

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(0, 0, 0));
        txtID.setEnabled(false);
        txtID.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarRegistrarEmpleado)
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnElimarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarRegistrarEmpleado))
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnElimarProductos)))
                .addContainerGap())
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

    private void jtableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableProductosMouseClicked
        int id = (int) jtableProductos.getValueAt(jtableProductos.getSelectedRow(), 0);
     
       txtID.setText(id + "");
        // TODO add your handling code here:
    }//GEN-LAST:event_jtableProductosMouseClicked

    private void btnElimarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElimarProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnElimarProductosMouseClicked

    private void btnElimarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimarProductosActionPerformed
        EliminarProductos();

        LlenarTabla();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnElimarProductosActionPerformed

    private void btnGuardarRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegistrarEmpleadoActionPerformed
       
        LlenarTabla();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarRegistrarEmpleadoActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElimarProductos;
    private javax.swing.JButton btnGuardarRegistrarEmpleado;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtableProductos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables

    private static boolean eliminar(int id) {
        ProductoWS.ProductoWS_Service service = new ProductoWS.ProductoWS_Service();
        ProductoWS.ProductoWS port = service.getProductoWSPort();
        return port.eliminar(id);
    }

    private static java.util.List<ProductoWS.Producto> buscarTodos() {
        ProductoWS.ProductoWS_Service service = new ProductoWS.ProductoWS_Service();
        ProductoWS.ProductoWS port = service.getProductoWSPort();
        return port.buscarTodos();
    }

    private static java.util.List<ProductoWS.Producto> buscarPorNombre(java.lang.String nombre) {
        ProductoWS.ProductoWS_Service service = new ProductoWS.ProductoWS_Service();
        ProductoWS.ProductoWS port = service.getProductoWSPort();
        return port.buscarPorNombre(nombre);
    }
    
    
}

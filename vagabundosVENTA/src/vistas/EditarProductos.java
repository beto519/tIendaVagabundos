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
 * @author SEBASTIAN
 */
public class EditarProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditarProductos
     */
    public EditarProductos() {
        initComponents();
       // LlenarTabla();
    }
    
//    private void LlenarTabla() {
//        txtID.setVisible(false);
//        List<Producto> list = DAOProducto.buscarTodos();
//        String Info[][] = new String[list.size()][4];
//        DefaultTableModel model = new DefaultTableModel();
//        
//        model.addColumn("Id");
//        model.addColumn("Nombre");
//        model.addColumn("Cantidad");
//        model.addColumn("Precio");
//        
//        for (int i = 0; i < list.size(); i++) {
//            Info[i][0] = list.get(i).getIdProducto() + "";
//            
//            model.addRow(
//                    new Object[]{list.get(i).getIdProducto(), list.get(i)
//                        .getNombreProducto(), list.get(i).getCantidadProducto(), list.get(i)
//                        .getPrecioProducto()}
//            );
//            
//            TablaP.setModel(model);
//        }
//        
//    }
    
    private void EditarProductos() {
//        Producto producto = new Producto();
//        ProductoDAOIMP DAOProducto = new ProductoDAOIMP();
//        try {
//            
//            String nombreProducto = txtNombreProducto.getText();
//            int cantidadProducto = Integer.valueOf(txtCantidadProducto.getText());
//            int idProducto = Integer.valueOf(txtID.getText());
//            double precioProducto = Double.parseDouble(txtPrecioProducto.getText());
//            
//            if (!nombreProducto.equals("")) {
//                producto.setIdProducto(idProducto);
//                producto.setNombreProducto(nombreProducto);
//                producto.setCantidadProducto(cantidadProducto);
//                producto.setPrecioProducto(precioProducto);
//                DAOProducto.editar(producto);
//                JOptionPane.showMessageDialog(null, "Registro exitoso", "Mensaje",
//                        JOptionPane.DEFAULT_OPTION);
//            } else {
//                JOptionPane.showMessageDialog(null, "Ingrese todos los campos", "Alerta",
//                        JOptionPane.WARNING_MESSAGE);
//            }
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//            
//        }
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtCantidadProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        btnGuardarEditarProductos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaP = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editar Productos");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio:");

        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });

        btnGuardarEditarProductos.setBackground(new java.awt.Color(0, 51, 51));
        btnGuardarEditarProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardarEditarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar_norm.png"))); // NOI18N
        btnGuardarEditarProductos.setBorder(null);
        btnGuardarEditarProductos.setContentAreaFilled(false);
        btnGuardarEditarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarEditarProductos.setFocusPainted(false);
        btnGuardarEditarProductos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar_roll.png"))); // NOI18N
        btnGuardarEditarProductos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar_press.png"))); // NOI18N
        btnGuardarEditarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarEditarProductosMouseClicked(evt);
            }
        });
        btnGuardarEditarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEditarProductosActionPerformed(evt);
            }
        });

        TablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaP);

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(0, 0, 0));
        txtID.setEnabled(false);
        txtID.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPrecioProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidadProducto, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarEditarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarEditarProductos)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void btnGuardarEditarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEditarProductosActionPerformed
        
        EditarProductos();
       // LlenarTabla();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarEditarProductosActionPerformed

    private void btnGuardarEditarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarEditarProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarEditarProductosMouseClicked

    private void TablaPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPMouseClicked
        int id = (int) TablaP.getValueAt(TablaP.getSelectedRow(), 0);
        String nombre = (String) TablaP.getValueAt(TablaP.getSelectedRow(), 1).toString();
        String cantidad = (String) TablaP.getValueAt(TablaP.getSelectedRow(), 2).toString();
        String precio = (String) TablaP.getValueAt(TablaP.getSelectedRow(), 3).toString();
        txtID.setText(id + "");
        txtNombreProducto.setText(nombre);
        txtCantidadProducto.setText(cantidad);
        txtPrecioProducto.setText(precio);
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaPMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaP;
    private javax.swing.JButton btnGuardarEditarProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    // End of variables declaration//GEN-END:variables
}

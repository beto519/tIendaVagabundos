/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import ProductoWS.BuscarPorCodigo;
import entidades.Producto;
import entidades.img;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.net.URL;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Soto Pacheco
 */
public class RealizarVenta extends javax.swing.JInternalFrame implements Runnable {

    List<Producto> productos = new ArrayList();
    Double total = 0.0;

    String hora, minutos, segundos;
    Thread hilo;

    /**
     * Creates new form RealizarVenta
     */
    public RealizarVenta() {
        initComponents();

        codigoEmpleado.setText(Principal.codigoEmpleado + "");
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
        tablaProductos.setTableHeader(null);
        tablaProductos.setDefaultRenderer(Object.class, new img());
        tablaProductos.setRowHeight(40);
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        tablaProductos.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);   //Izquierda public void izq_datos(int col){  DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer(); modelocentrar.setHorizontalAlignment(SwingConstants.LEFT); table.getColumnModel().getColumn(col).setCellRenderer(modelocentrar);  } //Derecha public void der_datos(int col){  DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer(); modelocentrar.setHorizontalAlignment(SwingConstants.RIGHT); table.getColumnModel().getColumn(col).setCellRenderer(modelocentrar);  }  //Derecha public void der_datos2(int col){
        tablaProductos.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);   //Izquierda public void izq_datos(int col){  DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer(); modelocentrar.setHorizontalAlignment(SwingConstants.LEFT); table.getColumnModel().getColumn(col).setCellRenderer(modelocentrar);  } //Derecha public void der_datos(int col){  DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer(); modelocentrar.setHorizontalAlignment(SwingConstants.RIGHT); table.getColumnModel().getColumn(col).setCellRenderer(modelocentrar);  }  //Derecha public void der_datos2(int col){
        tablaProductos.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);   //Izquierda public void izq_datos(int col){  DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer(); modelocentrar.setHorizontalAlignment(SwingConstants.LEFT); table.getColumnModel().getColumn(col).setCellRenderer(modelocentrar);  } //Derecha public void der_datos(int col){  DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer(); modelocentrar.setHorizontalAlignment(SwingConstants.RIGHT); table.getColumnModel().getColumn(col).setCellRenderer(modelocentrar);  }  //Derecha public void der_datos2(int col){
        lblTotal.setVisible(false);
    }

    //metodo para obtener la fecha actual
    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

    public void hora() {
        Calendar calendario = new GregorianCalendar();
        Date horaActual = new Date();
        calendario.setTime(horaActual);
        hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);

    }

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        while (current == hilo) {
            hora();
            labelFecha.setText(hora + ":" + minutos + ":" + segundos);
        }

    }

    public void llenarTabla() {
        total = 0.0;
        DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
        model.setRowCount(0);

        try {

            URL imagePath = new URL(getClass().getResource("../iconos/icons8_cancel_35px.png").toString());
            Image imagen = ImageIO.read(imagePath);
            JLabel label = new JLabel();
            label.setIcon(new ImageIcon(imagen));
            label.setCursor(new Cursor(Cursor.HAND_CURSOR));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            for (Producto p : productos) {

                model.addRow(new Object[]{
                    p.getCodigo(), p.getNombreProducto(), p.getPrecioProducto(),
                    label
                });

                total += p.getPrecioProducto();

            }

            if (productos.get(productos.size() - 1).getIdProducto() > 0) {
                lblTotal.show(true);
            } else {

                lblTotal.show(false);

            }

        } catch (Exception e) {
        }

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
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        codigoEmpleado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Realizar venta");
        setLayer(6);
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        tablaProductos.setBackground(new java.awt.Color(0, 0, 0));
        tablaProductos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tablaProductos.setForeground(new java.awt.Color(255, 255, 255));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        tablaProductos.setDragEnabled(true);
        tablaProductos.setFillsViewportHeight(true);
        tablaProductos.setFocusCycleRoot(true);
        tablaProductos.setFocusTraversalPolicyProvider(true);
        tablaProductos.setInheritsPopupMenu(true);
        tablaProductos.setSurrendersFocusOnKeystroke(true);
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProductos);
        tablaProductos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        codigoEmpleado.setText("0000");

        jLabel1.setText("Empleado: ");

        labelFecha.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigoEmpleado)
                    .addComponent(labelFecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 102, 102));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("jLabel5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Concepto");

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Precio");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String codigo = txtCodigo.getText();
            ProductoWS.Producto pws = buscarPorCodigo(codigo);
            Producto p = new Producto();
            p.setCantidadProducto(pws.getCantidadProducto());
            p.setCodigo(pws.getCodigo());
            p.setIdProducto(pws.getIdProducto());
            p.setNombreProducto(pws.getNombreProducto());
            p.setPrecioProducto(pws.getPrecioProducto());
            if (p.getIdProducto() > 0) {

                productos.add(p);
                llenarTabla();

                lblTotal.setText("Total: " + total);

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el producto", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked

        int fila = tablaProductos.getSelectedRow();
        int columna = tablaProductos.getSelectedColumn();

        if (columna == 3) {

            try {
                String codigoProducto = (String) tablaProductos.getValueAt(fila, 0);
                for (int i = 0; i < productos.size(); i++) {
                    if (productos.get(i).getCodigo().equals(codigoProducto)) {
                        productos.remove(i);
                        break;
                    }
                }
                llenarTabla();
                lblTotal.setText("Total: " + total);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se encontro el producto", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }

    }//GEN-LAST:event_tablaProductosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigoEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables

    private static ProductoWS.Producto buscarPorCodigo(java.lang.String codigo) {
        ProductoWS.ProductoWS_Service service = new ProductoWS.ProductoWS_Service();
        ProductoWS.ProductoWS port = service.getProductoWSPort();
        return port.buscarPorCodigo(codigo);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import com.mycompany.biblioteca.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public final class Reporte extends javax.swing.JFrame {


    /**
     * Creates new form Reporte
     */
    
    Conexion con1=new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    
    public Reporte(ArrayList <Reporte> aRp) {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        consultar();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfcodigo = new javax.swing.JTextField();
        tfnombre = new javax.swing.JTextField();
        tfcategoria = new javax.swing.JTextField();
        tfautor = new javax.swing.JTextField();
        tfprecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfproveedor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btsalir = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("REPORTE DE LIBROS"));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cod. Proveedor", "Cod. Categoria", "Cod. Autor", "Precio"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel6.setText("Seleccione un Libro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel1.setText("Cod. Libro:");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel3.setText("Cod. Categoria:");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel4.setText("Cod. Autor:");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel5.setText("Precio:");

        tfcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcodigoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel7.setText("Cod. Proveedor:");

        tfproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfproveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfautor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(tfcategoria, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfcodigo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfnombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfproveedor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfprecio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("OPCIONES"));

        btsalir.setBackground(new java.awt.Color(204, 204, 204));
        btsalir.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        btsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/deshacer.png"))); // NOI18N
        btsalir.setText("Regresar");
        btsalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });

        btmodificar.setBackground(new java.awt.Color(204, 204, 204));
        btmodificar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        btmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/campo-de-pluma.png"))); // NOI18N
        btmodificar.setText("Modificar");
        btmodificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });

        bteliminar.setBackground(new java.awt.Color(204, 204, 204));
        bteliminar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        bteliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/basura.png"))); // NOI18N
        bteliminar.setText("Eliminar");
        bteliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bteliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btmodificar)
                .addGap(18, 18, 18)
                .addComponent(bteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bteliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // TODO add your handling code here:
            dispose();
    }//GEN-LAST:event_btsalirActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        int fila=Tabla.getSelectedRow();
        if (fila == -1){
        
        JOptionPane.showMessageDialog(null, "No Se Seleccionó Fila");
        }else{
            String Codigo= (String) Tabla.getValueAt (fila, 0).toString();
            String Nombre= (String) Tabla.getValueAt (fila, 1);
            String Proveedor= (String) Tabla.getValueAt (fila, 2);
            String Categoria= (String) Tabla.getValueAt (fila, 3);
            String Autor= (String) Tabla.getValueAt (fila, 4);
            String Precio= (String) Tabla.getValueAt (fila, 5);
            
            tfcodigo.setText(Codigo);
            tfnombre.setText(Nombre);
            tfproveedor.setText(Proveedor);
            tfcategoria.setText(Categoria);
            tfautor.setText(Autor);
            tfprecio.setText(Precio);

        }
    }//GEN-LAST:event_TablaMouseClicked

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        // TODO add your handling code here:
        modificar();
        consultar();
        nuevo();
    }//GEN-LAST:event_btmodificarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
        consultar();
        nuevo();
    }//GEN-LAST:event_bteliminarActionPerformed

    private void tfcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcodigoActionPerformed

    private void tfproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfproveedorActionPerformed

    void consultar(){
            String sql ="Select * from libros";
    
            try{
                conet=con1.getConnection();
                st = conet.createStatement();
                rs= st.executeQuery(sql);
                Object[] libro=new Object[6];
                modelo=(DefaultTableModel) Tabla.getModel();
                while (rs.next()){
                    libro [0]=rs.getInt("Codigo");
                    libro [1]=rs.getString("Nombre");
                    libro [2]=rs.getString("CodProveedor");
                    libro [3]=rs.getString("CodCategoria");
                    libro [4]=rs.getString("CodAutor");
                    libro [5]=rs.getString("Precio");
                    
                    modelo.addRow(libro);
                }
                Tabla.setModel(modelo);
                
                } catch (SQLException ex) {
                }
    }
    
    void modificar(){
    try{
        if (tfcodigo.getText().equals("")||tfnombre.getText().equals("")||tfproveedor.getText().equals("")||tfcategoria.getText().equals("")||tfautor.getText().equals("")||tfprecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"ERROR: Campos Vacios");
        } else {
            String sql="Update libros set Codigo='"+tfcodigo.getText()+"', Nombre='"+tfnombre.getText()+"', CodProveedor='"+tfproveedor.getText()+"', CodCategoria='"+tfcategoria.getText()+"', CodAutor='"+tfautor.getText()+"', Precio='"+tfprecio.getText()+"' where Codigo="+tfcodigo.getText();
            conet=con1.getConnection();
            st=conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Datos del Libro Modificados");
            limpiarTabla();
        }
        } catch (SQLException ex) {
        }
    }
    
    void eliminar(){
        int fila=Tabla.getSelectedRow();
        try {
             if(fila<0){
            JOptionPane.showMessageDialog(null,"Libro No Seleccionado");
            limpiarTabla();
             }
             else{
                 String sql="delete from libros where Codigo="+tfcodigo.getText();
                 conet=con1.getConnection();
                 st=conet.createStatement();
                 st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Libro ELIMINADO");
                limpiarTabla();
             }   
            } catch (SQLException ex) {
            }
    }
          
    void nuevo(){
            tfcodigo.setText("");
            tfnombre.setText("");
            tfproveedor.setText("");
            tfcategoria.setText("");
            tfautor.setText("");
            tfprecio.setText("");
            tfcodigo.requestFocus();
    }
    
    void limpiarTabla(){
            for (int i=0; i<Tabla.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btmodificar;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfautor;
    private javax.swing.JTextField tfcategoria;
    private javax.swing.JTextField tfcodigo;
    private javax.swing.JTextField tfnombre;
    private javax.swing.JTextField tfprecio;
    private javax.swing.JTextField tfproveedor;
    // End of variables declaration//GEN-END:variables
}

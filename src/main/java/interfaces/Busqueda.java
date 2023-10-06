/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import com.mycompany.biblioteca.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public final class Busqueda extends javax.swing.JFrame {
        ArrayList <compra> acompra=new ArrayList<compra>();

    /**
     * Creates new form Busqueda
     */
    
    Conexion con1=new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    
    public Busqueda(ArrayList <Busqueda> aBq) {
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
        lbbusqueda = new javax.swing.JLabel();
        tfbusqueda = new javax.swing.JTextField();
        btbuscar = new javax.swing.JButton();
        lbbusqueda1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfresulcodigo = new javax.swing.JTextField();
        tfresulnombre = new javax.swing.JTextField();
        tfresulcategoria = new javax.swing.JTextField();
        tfresulautor = new javax.swing.JTextField();
        tfresulprecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfresulproveedor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaB = new javax.swing.JTable();
        btsalir = new javax.swing.JButton();
        btfactura = new javax.swing.JButton();
        btcomprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jPanel1.setName("Buscar"); // NOI18N

        lbbusqueda.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        lbbusqueda.setText("Ingrese el Nombre");

        btbuscar.setBackground(new java.awt.Color(204, 204, 204));
        btbuscar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        btbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/busqueda2.png"))); // NOI18N
        btbuscar.setText("Buscar");
        btbuscar.setToolTipText("");
        btbuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });

        lbbusqueda1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        lbbusqueda1.setText("Del Libro:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbbusqueda)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbbusqueda1)
                        .addGap(18, 18, 18)
                        .addComponent(tfbusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbbusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbbusqueda1)
                    .addComponent(tfbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel1.setText("Cod. Libro:");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel4.setText("Cod. Categoria:");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel5.setText("Cod. Autor:");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jLabel6.setText("Precio:");

        tfresulnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfresulnombreActionPerformed(evt);
            }
        });

        tfresulcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfresulcategoriaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        jLabel7.setText("Cod. Proveedor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfresulautor)
                            .addComponent(tfresulprecio)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfresulcodigo)
                            .addComponent(tfresulnombre)
                            .addComponent(tfresulcategoria)
                            .addComponent(tfresulproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))))
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfresulcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfresulnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfresulproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfresulcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfresulautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(tfresulprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Todos los Libros"));

        TablaB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cod. Proveedor", "Cod. Categoria", "Cod. Autor", "Precio"
            }
        ));
        jScrollPane1.setViewportView(TablaB);

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

        btfactura.setBackground(new java.awt.Color(204, 204, 204));
        btfactura.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        btfactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/recibo.png"))); // NOI18N
        btfactura.setText("Factura");
        btfactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btfactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfacturaActionPerformed(evt);
            }
        });

        btcomprar.setBackground(new java.awt.Color(204, 204, 204));
        btcomprar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        btcomprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/carrito-de-compras.png"))); // NOI18N
        btcomprar.setText("Comprar");
        btcomprar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btcomprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btcomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcomprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btcomprar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btfactura, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btcomprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfresulcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfresulcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfresulcategoriaActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        // TODO add your handling code here:
        BuscarPorNombre(tfbusqueda,tfresulcodigo,tfresulnombre,tfresulcategoria,tfresulautor,tfresulprecio);
        
    }//GEN-LAST:event_btbuscarActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // TODO add your handling code here:
            dispose();
    }//GEN-LAST:event_btsalirActionPerformed

    private void btfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfacturaActionPerformed
        // TODO add your handling code here:
        String Reporte = "";
        
        String Codigo =tfresulcodigo.getText();
        String Nombre = tfresulnombre.getText();
        String Categoria = tfresulcategoria.getText();
        String Autor = tfresulautor.getText();
        String Precio = tfresulprecio.getText();

        
        Reporte += "<h1>FACTURA DE COMPRA</h1>";
        Reporte += "<p><strong>---------------------------------------------------------</strong></p>";
        Reporte += "<p><strong>Codigo del Libro:   </strong> " + Codigo + "</p>";
        Reporte += "<p><strong>Nombre del Libro:   </strong> " + Nombre + "</p>";
        Reporte += "<p><strong>Categoria:   </strong> " + Categoria + "</p>";
        Reporte += "<p><strong>Autor:   </strong> " + Autor + "</p>";
        Reporte += "<p><strong>Precio del Libro:   </strong> " + Precio + "</p>";
        Reporte += "<P><p><strong>TOTAL A PAGAR:   </strong> " + Precio + "</p></>";
        Reporte += "<p><strong>---------------------------------------------------------</strong></p>";
        
        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setText(Reporte);
        
        JScrollPane scrollPane = new JScrollPane(editorPane);
        
        JFrame frame = new JFrame("Factura");
        frame.add(scrollPane);
        
        frame.setSize(600, 500);
        frame.setVisible(true);
    }//GEN-LAST:event_btfacturaActionPerformed

    private void btcomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcomprarActionPerformed
        // TODO add your handling code here:
        if (tfresulnombre.getText().equals("")){
        JOptionPane.showMessageDialog(null,"ERROR: Campos Vacios"); 
        }
        else{
        compra vcompra=new compra(acompra);
        }
    }//GEN-LAST:event_btcomprarActionPerformed

    private void tfresulnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfresulnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfresulnombreActionPerformed

void consultar(){
            String sql ="Select * from libros";
    
            try{
                conet=con1.getConnection();
                st = conet.createStatement();
                rs= st.executeQuery(sql);
                Object[] libro=new Object[6];
                modelo=(DefaultTableModel) TablaB.getModel();
                while (rs.next()){
                    libro [0]=rs.getInt("Codigo");
                    libro [1]=rs.getString("Nombre");
                    libro [2]=rs.getString("CodProveedor");
                    libro [3]=rs.getString("CodCategoria");
                    libro [4]=rs.getString("CodAutor");
                    libro [5]=rs.getString("Precio");
                    
                    modelo.addRow(libro);
                }
                TablaB.setModel(modelo);
                
                } catch (SQLException ex) {
                }
    }
    
void BuscarPorNombre(JTextField tfbusqueda, JTextField tfresulcodigo, JTextField tfresulnombre, JTextField tfresulcategoria, JTextField tfresulautor, JTextField tfresulprecio){
        
    String consulta="select Codigo,Nombre,CodProveedor,CodCategoria,CodAutor,Precio from libros where libros.Nombre=(?);";
    
    Conexion con1=new Conexion();
    try{
        CallableStatement cs=con1.getConnection().prepareCall(consulta);
        cs.setString(1, tfbusqueda.getText());
        cs.execute();
        
        ResultSet rs=cs.executeQuery();
        
        if(rs.next()){
        tfresulcodigo.setText(rs.getString("Codigo"));
        tfresulnombre.setText(rs.getString("Nombre"));
        tfresulproveedor.setText(rs.getString("CodProveedor"));
        tfresulcategoria.setText(rs.getString("CodCategoria"));
        tfresulautor.setText(rs.getString("CodAutor"));
        tfresulprecio.setText(rs.getString("Precio"));
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Libro NO Encontrado");
        tfresulcodigo.setText("");
        tfresulnombre.setText("");
        tfresulproveedor.setText("");
        tfresulcategoria.setText("");
        tfresulautor.setText("");
        tfresulprecio.setText("");
        }
        
    } catch (SQLException ex) {
        
        JOptionPane.showMessageDialog(null, "ERROR: "+ex.toString());
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaB;
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton btcomprar;
    private javax.swing.JButton btfactura;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbbusqueda;
    private javax.swing.JLabel lbbusqueda1;
    private javax.swing.JTextField tfbusqueda;
    private javax.swing.JTextField tfresulautor;
    private javax.swing.JTextField tfresulcategoria;
    private javax.swing.JTextField tfresulcodigo;
    private javax.swing.JTextField tfresulnombre;
    private javax.swing.JTextField tfresulprecio;
    private javax.swing.JTextField tfresulproveedor;
    // End of variables declaration//GEN-END:variables
}

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manci
 */
public class registrar_productoss extends javax.swing.JInternalFrame {
Conectar con;
    /**
     * Creates new form registrar_productoss
     */
    public registrar_productoss() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lvl_id_producto = new javax.swing.JLabel();
        txtcodigopro = new javax.swing.JTextField();
        txtnombrepro = new javax.swing.JTextField();
        lvl_nombre_producto = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        lvl_precio = new javax.swing.JLabel();
        lvl_descricion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        btm_registrar = new javax.swing.JButton();
        BTM_nuevo = new javax.swing.JButton();
        txtiva = new javax.swing.JTextField();
        lvl_iva = new javax.swing.JLabel();
        txtfechaca = new javax.swing.JTextField();
        lvl_fecha_caducidad = new javax.swing.JLabel();
        txtcategoria = new javax.swing.JTextField();
        lvl_categoria = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        lvl_cantidad = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        lvl_marca = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lvl_fecha_ingreso1 = new javax.swing.JLabel();
        txtfechain1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Requerido");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Requerido");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Requerido");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Requerido");

        setClosable(true);
        setIconifiable(true);
        setTitle("Registrar producto");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 11, 423, 70));

        lvl_id_producto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lvl_id_producto.setForeground(new java.awt.Color(255, 255, 255));
        lvl_id_producto.setText("ID producto:");
        getContentPane().add(lvl_id_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtcodigopro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoproKeyTyped(evt);
            }
        });
        getContentPane().add(txtcodigopro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 160, 30));

        txtnombrepro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreproKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombrepro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 160, 30));

        lvl_nombre_producto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lvl_nombre_producto.setForeground(new java.awt.Color(255, 255, 255));
        lvl_nombre_producto.setText("Nombre producto:");
        getContentPane().add(lvl_nombre_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 160, 30));

        lvl_precio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lvl_precio.setForeground(new java.awt.Color(255, 255, 255));
        lvl_precio.setText("Precio:");
        getContentPane().add(lvl_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        lvl_descricion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lvl_descricion.setForeground(new java.awt.Color(255, 255, 255));
        lvl_descricion.setText("Descripcion:");
        getContentPane().add(lvl_descricion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtdescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 160, -1));

        btm_registrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btm_registrar.setText("Registrar");
        btm_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(btm_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 110, 40));

        BTM_nuevo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BTM_nuevo.setText("Limpiar");
        BTM_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTM_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(BTM_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 100, 40));

        txtiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtivaActionPerformed(evt);
            }
        });
        txtiva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtivaKeyTyped(evt);
            }
        });
        getContentPane().add(txtiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 140, 30));

        lvl_iva.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lvl_iva.setForeground(new java.awt.Color(255, 255, 255));
        lvl_iva.setText("Iva");
        getContentPane().add(lvl_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 40, 20));

        txtfechaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfechacaKeyTyped(evt);
            }
        });
        getContentPane().add(txtfechaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 140, 30));

        lvl_fecha_caducidad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lvl_fecha_caducidad.setForeground(new java.awt.Color(255, 255, 255));
        lvl_fecha_caducidad.setText("Fecha de caducidad:");
        getContentPane().add(lvl_fecha_caducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        txtcategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcategoriaKeyTyped(evt);
            }
        });
        getContentPane().add(txtcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 139, 30));

        lvl_categoria.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lvl_categoria.setForeground(new java.awt.Color(255, 255, 255));
        lvl_categoria.setText("Categoria:");
        getContentPane().add(lvl_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 140, 30));

        lvl_cantidad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lvl_cantidad.setForeground(new java.awt.Color(255, 255, 255));
        lvl_cantidad.setText("Cantidad:");
        getContentPane().add(lvl_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));
        getContentPane().add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 140, 30));

        lvl_marca.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lvl_marca.setForeground(new java.awt.Color(255, 255, 255));
        lvl_marca.setText("Marca:");
        getContentPane().add(lvl_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Requerido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Requerido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Requerido");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Requerido");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Requerido");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Requerido");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Requerido");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Requerido");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, -1, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Requerido");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, -1, -1));

        lvl_fecha_ingreso1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lvl_fecha_ingreso1.setForeground(new java.awt.Color(255, 255, 255));
        lvl_fecha_ingreso1.setText("Fecha de ingreso:");
        getContentPane().add(lvl_fecha_ingreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, 20));

        txtfechain1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfechain1KeyTyped(evt);
            }
        });
        getContentPane().add(txtfechain1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 140, 30));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Requerido");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_3.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 810, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoproKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtcodigoproKeyTyped

    private void txtnombreproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreproKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' '|| c>' '))evt.consume();
    }//GEN-LAST:event_txtnombreproKeyTyped

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtprecioKeyTyped

    private void btm_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_registrarActionPerformed
        con=new Conectar();
        Connection reg= con.getConnection();
        PreparedStatement pps;
        try {
            pps = reg.prepareStatement("INSERT INTO producto (id_producto,nombre_producto,precio,iva,descripcion,fecha_ingreso,fecha_caducidad,categoria,cantidad,marca) VALUES(?,?,?,?,?,?,?,?,?,?)");
            pps.setString(1,txtcodigopro.getText());
            pps.setString(2,txtnombrepro.getText());
            pps.setString(3,txtprecio.getText());
            pps.setString(4,txtiva.getText());
            pps.setString(5,txtdescripcion.getText());
            pps.setString(6,txtfechain1.getText());  
            pps.setString(7,txtfechaca.getText());
            pps.setString(8,txtcategoria.getText());
            pps.setString(9,txtcantidad.getText());
            pps.setString(10,txtmarca.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
        } catch (SQLException ex) {
            Logger.getLogger(registrar_productoss.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btm_registrarActionPerformed

    private void BTM_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTM_nuevoActionPerformed
        txtcodigopro.setText("");
        txtnombrepro.setText("");
        txtprecio.setText("");
        txtdescripcion.setText("");
        txtiva.setText("");
        txtfechain1.setText("");
        txtfechaca.setText("");
        txtcategoria.setText("");
        txtcantidad.setText("");
        txtmarca.setText("");

    }//GEN-LAST:event_BTM_nuevoActionPerformed

    private void txtivaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtivaKeyTyped
        
    }//GEN-LAST:event_txtivaKeyTyped

    private void txtfechacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechacaKeyTyped
        char c = evt.getKeyChar();
        if ((c<'0' || c>'9') && (c<'/' || c>'/'))evt.consume();
    }//GEN-LAST:event_txtfechacaKeyTyped

    private void txtcategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcategoriaKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' '|| c>' '))evt.consume();
    }//GEN-LAST:event_txtcategoriaKeyTyped

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void txtfechain1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechain1KeyTyped
  char c = evt.getKeyChar();
        if ((c<'0' || c>'9') && (c<'/' || c>'/'))evt.consume();
    }//GEN-LAST:event_txtfechain1KeyTyped

    private void txtivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtivaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTM_nuevo;
    private javax.swing.JButton btm_registrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lvl_cantidad;
    private javax.swing.JLabel lvl_categoria;
    private javax.swing.JLabel lvl_descricion;
    private javax.swing.JLabel lvl_fecha_caducidad;
    private javax.swing.JLabel lvl_fecha_ingreso1;
    private javax.swing.JLabel lvl_id_producto;
    private javax.swing.JLabel lvl_iva;
    private javax.swing.JLabel lvl_marca;
    private javax.swing.JLabel lvl_nombre_producto;
    private javax.swing.JLabel lvl_precio;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcategoria;
    private javax.swing.JTextField txtcodigopro;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtfechaca;
    private javax.swing.JTextField txtfechain1;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtnombrepro;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables

}

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manci
 */
public class tabla_productoss extends javax.swing.JInternalFrame {

    /**
     * Creates new form tabla_productoss
     */
    public tabla_productoss() {
        initComponents();
       
        mostrartabla();
    }

    void mostrartabla(){
             Conectar con=new Conectar();
         Connection Conectar=con.getConnection();
        
        DefaultTableModel modelo=new DefaultTableModel(){
                 @Override
                 public boolean isCellEditable(int row, int column) {
                     
                     if(column==11){
                         return true;
                     }else{
                         return false;
                     }
                 }   
        };
        modelo.addColumn("id_producto");
        modelo.addColumn("nombre_producto");
        modelo.addColumn("precio");
        modelo.addColumn("iva");
        modelo.addColumn("descripcion");
        modelo.addColumn("fecha_ingreso");
        modelo.addColumn("fecha_caducidad");
        modelo.addColumn("categoria");
        modelo.addColumn("cantidad");
        modelo.addColumn("marca");
        tabladatos.setModel(modelo);
        
        String sql = "SELECT*FROM producto";
        
        String dato[]= new String[11];
        try {

        
        Statement st= Conectar.createStatement();
        
        ResultSet rs=st.executeQuery(sql);
        
        while(rs.next()){
            dato[0]=rs.getString(1);
            dato[1]=rs.getString(2);
            dato[2]=rs.getString(3);
            dato[3]=rs.getString(4);
            dato[4]=rs.getString(5);
            dato[5]=rs.getString(6);
            dato[6]=rs.getString(7);
            dato[7]=rs.getString(8);
            dato[8]=rs.getString(9);
            dato[9]=rs.getString(10);
            modelo.addRow(dato);
        }
        tabladatos.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(menu_principal.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Tabla productos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1260, 330));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Actualizar Tabla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 170, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_3.png"))); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(1292, 528));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        mostrartabla();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladatos;
    // End of variables declaration//GEN-END:variables
}
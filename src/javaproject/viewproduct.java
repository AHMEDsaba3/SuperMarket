/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaproject;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author M.user
 */
public class viewproduct extends javax.swing.JFrame {
     Connection con;
         Statement stmt;
         ResultSet rs;
         PreparedStatement prd;

    /**
     * Creates new form addproduct
     */
    public viewproduct() {
        initComponents();
        tocreate();
    }
    public void tocreate() {
//      
//             try{
//
//        con = DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market ", "supermarket","1234");
//        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//        String SQL = "SELECT * FROM PRODUCTS";
//        rs = stmt.executeQuery(SQL);
//        DefaultTableModel tm=(DefaultTableModel)table.getModel();
//        tm.setRowCount(0);
//        while(rs.next()){
//            Object o[]={rs.getInt("column1"),rs.getString("column2"),rs.getString("column3"),rs.getString("column4"),rs.getString("column5"),rs.getString("column6")};
//            tm.addRow(o);
//        }
//      
//        
//       
////       long code = rs.getInt("Code");
////       String name = rs.getString("Name");
////       long orign=rs.getInt("Orign");
////       long price = rs.getInt("Price");
////       long date = rs.getInt("Expiry_Date");
////       long number = rs.getInt("Quantity");
////          rs.next();
//       
//       
////       txt_code.setText(String.valueOf(code));
////       
////       txt_name.setText(name);
////       txt_orign.setText(orign+"");
////       txt_price.setText(String.valueOf(price));
////       txt_date.setText(date+"");
////       txt_qun.setText(number+"");
//       
//      
//       
//  
//     
//        }catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
    
    }

    /**
     * Creates new form viewproduct
     */
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 250));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(62, 60, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setText("view");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 139, -1, -1));

        table.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CODE", "Origin", "NAME", "STOCK", "DEPARTMENT", "EXPIRYDATE", "PRICE", "DNO"
            }
        ));
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 188, 716, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View the products");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 97, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled-78787.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 42));

        jButton2.setBackground(new java.awt.Color(62, 60, 61));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Undo_24x24.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
             try{

        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ", "aast","aast");
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String SQL = "SELECT * FROM PRODUCTS";
        rs = stmt.executeQuery(SQL);
        DefaultTableModel tm=(DefaultTableModel)table.getModel();
        tm.setRowCount(0);
        while(rs.next()){
            Object o[]={rs.getInt("PCODE"),rs.getString("PORIGIN"),rs.getString("PNAME"),rs.getString("PSTOCK"),rs.getString("PDEPARTMENT"),rs.getString("PEXPIRYDATE"),rs.getString("PPRICE"),rs.getString("DNO2")};
            tm.addRow(o);
        }
      
        
       
//       long code = rs.getInt("Code");
//       String name = rs.getString("Name");
//       long orign=rs.getInt("Orign");
//       long price = rs.getInt("Price");
//       long date = rs.getInt("Expiry_Date");
//       long number = rs.getInt("Quantity");
//          rs.next();
       
       
//       txt_code.setText(String.valueOf(code));
//       
//       txt_name.setText(name);
//       txt_orign.setText(orign+"");
//       txt_price.setText(String.valueOf(price));
//       txt_date.setText(date+"");
//       txt_qun.setText(number+"");
       
      
       
  
     
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       admin av=new admin();
       av.show();
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(viewproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewproduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

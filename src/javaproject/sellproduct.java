/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author M.user
 */
public class sellproduct extends javax.swing.JFrame {
    
     Connection con;
     
         Statement stmt;
      
         ResultSet rs;
        
         PreparedStatement prd;


    /**
     * Creates new form sellproduct
     */
    public sellproduct() {
        initComponents();
    tocreate();
    }
    
    public void tocreate() {
      
             try{

        con = DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market ", "supermarket","1234");
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String SQL = "SELECT * FROM PRODUCTS";
        rs = stmt.executeQuery(SQL);
      
       long code = rs.getInt("Code");
       String name = rs.getString("Name");
       long price = rs.getInt("Price");
       long number = rs.getInt("Quantity");
       rs.next();
       
       
       txt_code.setText(String.valueOf(code));
       txt_name.setText(name);
       txt_price.setText(String.valueOf(price));
       txt_qun.setText(number+"");
       
      
       
  
     
        }catch(SQLException e){
            System.out.println(e.getMessage());
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        txt_code = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_qun = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 250));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled-78787.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Undo_24x24.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 6, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/Untitled-1dd.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 180, 270));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel7.setText("Name Of product");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel8.setText("Price Of product");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 130, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel9.setText("Code Of product");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, 130, 20));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel10.setText("Code Of product");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel11.setText("Quantity Of product");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, -1));

        jButton3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel12.setText("Sell Products");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        txt_price.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        txt_price.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.pink));
        jPanel1.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 180, 30));

        txt_code.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        txt_code.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.pink));
        jPanel1.add(txt_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 180, 30));

        txt_name.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        txt_name.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.pink));
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 180, 30));

        txt_qun.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        txt_qun.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.pink));
        jPanel1.add(txt_qun, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 180, 30));

        jButton4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/Untitled-jjjjj2.png"))); // NOI18N
        jButton4.setText("Add to Cart");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 240, 140));

        jButton5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton5.setText("Deliver Items");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cashier ss=new cashier();
        ss.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try{
            long search_id = Long.parseLong(txt_code.getText());
            int found =0;
            rs.absolute(0);
            while(rs.next()){
            if (search_id == rs.getLong(1)){
            found=1;
            
            txt_name.setText(rs.getString("Name"));
             txt_qun.setText(rs.getLong("Quantity")+"");
             txt_price.setText(rs.getLong("Price")+"");
            
            
            }
            
            
            }
            if(found==0){
           
            txt_name.setText("");
             txt_qun.setText("");
             txt_price.setText("");
             JOptionPane.showMessageDialog(this, "Wrong");
            }
            
            
            
        }
        
        catch(SQLException e) {           
            System.out.println(e.getMessage());
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         try{
            
            prd=con.prepareStatement("insert into cart(Name,Price)values(?,?)");
            
           
            prd.setString(1, txt_name.getText());
            prd.setString(2, txt_price.getText());
        
            
              prd.executeUpdate();
              
         
            
        }
        catch(SQLException e){
            System.out.println(e.getMessage());        
        }
            try{

        con = DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market ", "supermarket","1234");
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String SQL = "SELECT * FROM CART";
        rs = stmt.executeQuery(SQL);
        DefaultTableModel tm=(DefaultTableModel)table.getModel();
        tm.setRowCount(0);
        while(rs.next()){
            Object o[]={rs.getString("NAME"),rs.getString("PRICE")};
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
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        delivry s=new delivry();
        s.show();
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(sellproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sellproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sellproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sellproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sellproduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt_code;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_qun;
    // End of variables declaration//GEN-END:variables
}

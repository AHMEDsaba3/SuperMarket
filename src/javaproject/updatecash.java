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

/**
 *
 * @author M.user
 */
public class updatecash extends javax.swing.JFrame {

     Connection con;
         Statement stmt;
         ResultSet rs;
         PreparedStatement prd;
    /**
     * Creates new form updatecash
     */
    public updatecash() {
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
       long orign=rs.getInt("Orign");
       long price = rs.getInt("Price");
       long date = rs.getInt("Expiry_Date");
       long number = rs.getInt("Quantity");
       rs.next();
       
       
       txt.setText(String.valueOf(code));
       txt_name.setText(name);
       txt_orign.setText(orign+"");
       txt_price.setText(String.valueOf(price));
       txt_date.setText(date+"");
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
        txt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_qun = new javax.swing.JTextField();
        txt_code = new javax.swing.JTextField();
        txt_orign = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_date = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 11, -1, -1));

        txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/Untitled-1zzzx.png"))); // NOI18N
        jPanel1.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 30, 330, 240));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Search and Update Product");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 280, -1));

        txt_qun.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        txt_qun.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.pink));
        txt_qun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qunActionPerformed(evt);
            }
        });
        jPanel1.add(txt_qun, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 210, 30));

        txt_code.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        txt_code.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.pink));
        txt_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codeActionPerformed(evt);
            }
        });
        jPanel1.add(txt_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 270, 30));

        txt_orign.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        txt_orign.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.pink));
        txt_orign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_orignActionPerformed(evt);
            }
        });
        jPanel1.add(txt_orign, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 210, 30));

        txt_name.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        txt_name.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.pink));
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 210, 30));

        txt_date.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        txt_date.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.pink));
        txt_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dateActionPerformed(evt);
            }
        });
        jPanel1.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 210, 30));

        txt_price.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        txt_price.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.pink));
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });
        jPanel1.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 210, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("(e.Egyption Pound)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel5.setText("Enter Code of the product your want change ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel6.setText("Enter New Name Of Product");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel7.setText("Enter New Product Orign");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel8.setText("Enter New Product Expiry_Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel9.setText("Enter New product quntity ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel10.setText("Enter New Product Price ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jButton2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        jButton3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cashier ca = new cashier();
        ca.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_qunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_qunActionPerformed

    private void txt_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codeActionPerformed

    private void txt_orignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_orignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_orignActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dateActionPerformed

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try{
            long search_id = Long.parseLong(txt_code.getText());
            int found =0;
            rs.absolute(0);
            while(rs.next()){
            if (search_id == rs.getLong(1)){
            found=1;
            
            txt_name.setText(rs.getString("Name"));
            txt_orign.setText(rs.getString("Orign"));
            txt_date.setText(rs.getString("Date"));
             txt_qun.setText(rs.getLong("Quantity")+"");
             txt_price.setText(rs.getLong("Price")+"");
            break;
            
            }
            
            
            }
            if(found==0){
             txt_code.setText("");
            txt_name.setText("");
            txt_orign.setText("");
            txt_date.setText("");
             txt_qun.setText("");
             txt_price.setText("");
             JOptionPane.showMessageDialog(this, "Wrong");
            }
            
            
            
        }
        
        catch(SQLException e) {           
            System.out.println(e.getMessage());
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           try{
        
        int index=rs.getRow();
        
        
      if(index!=0){
        int id = Integer.parseInt(txt_code.getText());
        String name = txt_name.getText();
        String orign=txt_orign.getText();
             double price = Double.parseDouble(txt_price.getText());
        String date =txt_date.getText();
        long quntity=Long.parseLong(txt_qun.getText());
   
       
        
        rs.updateInt("Code", id);
        rs.updateString("Name", name);
         rs.updateString("Orign", orign);
          rs.updateDouble("Price", price);
          rs.updateString("Date", date);
          rs.updateLong("Quantity", quntity);
         
        rs.updateRow();
        
        JOptionPane.showMessageDialog(this, "prodect information is update ");
      }
        
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(updatecash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatecash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatecash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatecash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatecash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt;
    private javax.swing.JTextField txt_code;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_orign;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_qun;
    // End of variables declaration//GEN-END:variables
}

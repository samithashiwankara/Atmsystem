/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

import atmsystem.Atmsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Samitha Shiwankara
 */
public class fastCash extends javax.swing.JFrame {

    /**
     * Creates new form fastCash
     */
    public fastCash() {
        initComponents();
    }

      int MyAccNum;
     public fastCash(int AccNum) {
        initComponents();
        MyAccNum =AccNum; 
       // AccNumLbl.setText(""+AccNum);
        GetBalance();
    }
    

    Connection Con=null;
     PreparedStatement pst= null,pst1 =null;
     ResultSet Rs=null,Rs1=null;
     Statement St =null,St1=null;
      int OldBalance;
     
    private void GetBalance()
    {
       String Query="select * form accounttb where AccNum='"+MyAccNum+"'";
       try{
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsystem?","root","");
            pst=Con.prepareStatement(Query);
           St1 = Con.createStatement();
           Rs1=St1.executeQuery(Query);
           if(Rs1.next()){
              OldBalance= Rs1.getInt(9);
              BalLab1.setText("Rs:"+OldBalance);
               
           }
           else
           {
            
           }
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(this,e);
       } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        btn500 = new javax.swing.JButton();
        btn2000 = new javax.swing.JButton();
        btn10000 = new javax.swing.JButton();
        btn5000 = new javax.swing.JButton();
        btn1000 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn100 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        BalLab1 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("   ATM  MANAGEMENT SYSTEM");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btn500.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn500.setForeground(new java.awt.Color(51, 51, 255));
        btn500.setText("RS 500");
        btn500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn500MouseClicked(evt);
            }
        });

        btn2000.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn2000.setForeground(new java.awt.Color(51, 51, 255));
        btn2000.setText("RS 2000");
        btn2000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2000MouseClicked(evt);
            }
        });

        btn10000.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn10000.setForeground(new java.awt.Color(51, 51, 255));
        btn10000.setText("RS 10000");
        btn10000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn10000MouseClicked(evt);
            }
        });

        btn5000.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn5000.setForeground(new java.awt.Color(51, 51, 255));
        btn5000.setText("RS 5000");
        btn5000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5000MouseClicked(evt);
            }
        });

        btn1000.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn1000.setForeground(new java.awt.Color(51, 51, 255));
        btn1000.setText("RS 1000");
        btn1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1000MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("LOGOUT");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" X");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("   ATM  MANAGEMENT SYSTEM");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        btn100.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btn100.setForeground(new java.awt.Color(51, 51, 255));
        btn100.setText("RS 100");
        btn100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn100MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("FAST CASH");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BalLab1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        BalLab1.setForeground(new java.awt.Color(0, 0, 255));
        BalLab1.setText("Balance");
        BalLab1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btn1000))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(btn5000))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2000, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn500, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn10000))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BalLab1)
                                .addComponent(jLabel5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn100)
                    .addComponent(btn500))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BalLab1)
                        .addGap(30, 30, 30)
                        .addComponent(btn10000)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1000)
                            .addComponent(btn2000))
                        .addGap(18, 18, 18)
                        .addComponent(btn5000)
                        .addGap(81, 81, 81)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       System.exit(1);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btn100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn100MouseClicked
        if(OldBalance <100){
           
              JOptionPane.showMessageDialog(this, "No Enough Balance ");
          
          }
      else{
          try{
              String Query="update accounttb set Balance =? where AccNum =?";
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsystem?","root","");
               PreparedStatement ps = Con.prepareCall(Query);
               ps.setInt(1, OldBalance-100);
               ps.setInt(2,MyAccNum);
               if(ps.executeUpdate()==1)
               {
                 JOptionPane.showMessageDialog(this, "Balance updated");
                  new MainMenu().setVisible(true);
                  this.dispose();
               }else
               {
                 JOptionPane.showMessageDialog(this, "Missing Information");  
               }
           } catch(Exception e){
               
               JOptionPane.showMessageDialog(this, e);
          }
        
      }
    }//GEN-LAST:event_btn100MouseClicked

    private void btn500MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn500MouseClicked
       if(OldBalance <500){
           
              JOptionPane.showMessageDialog(this, "No Enough Balance ");
          
          }
      else{
          try{
              String Query="update accounttb set Balance =? where AccNum =?";
              Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsystem?","root","");
               PreparedStatement ps = Con.prepareCall(Query);
               ps.setInt(1, OldBalance-500);
               ps.setInt(2,MyAccNum);
               if(ps.executeUpdate()==1)
               {
                 JOptionPane.showMessageDialog(this, "Balance updated");
                  new MainMenu().setVisible(true);
                  this.dispose();
               }else
               {
                 JOptionPane.showMessageDialog(this, "Missing Information");  
               }
           } catch(Exception e){
               
               JOptionPane.showMessageDialog(this, e);
          }
        
      }
    }//GEN-LAST:event_btn500MouseClicked

    private void btn1000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1000MouseClicked
       if(OldBalance <1000){
           
              JOptionPane.showMessageDialog(this, "No Enough Balance ");
          
          }
      else{
          try{
              String Query="update accounttb set Balance =? where AccNum =?";
              Con=(Connection)Atmsystem.connect();
               PreparedStatement ps = Con.prepareCall(Query);
               ps.setInt(1, OldBalance-1000);
               ps.setInt(2,MyAccNum);
               if(ps.executeUpdate()==1)
               {
                 JOptionPane.showMessageDialog(this, "Balance updated");
                  new MainMenu().setVisible(true);
                 this.dispose();
               }else
               {
                 JOptionPane.showMessageDialog(this, "Missing Information");  
               }
           } catch(Exception e){
               
               JOptionPane.showMessageDialog(this, e);
          }
        
      }
    }//GEN-LAST:event_btn1000MouseClicked

    private void btn5000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5000MouseClicked
        if(OldBalance <5000){
           
              JOptionPane.showMessageDialog(this, "No Enough Balance ");
          
          }
      else{
          try{
              String Query="update accounttb set Balance =? where AccNum =?";
              Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsystem?","root","");
               PreparedStatement ps = Con.prepareCall(Query);
               ps.setInt(1, OldBalance-5000);
               ps.setInt(2,MyAccNum);
               if(ps.executeUpdate()==1)
               {
                 JOptionPane.showMessageDialog(this, "Balance updated");
                 
                  new MainMenu().setVisible(true);
                  this.dispose();
               }else
               {
                 JOptionPane.showMessageDialog(this, "Missing Information");  
               }
           } catch(Exception e){
               
               JOptionPane.showMessageDialog(this, e);
          }
        
      }
    }//GEN-LAST:event_btn5000MouseClicked

    private void btn2000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2000MouseClicked
        if(OldBalance <2000){
           
              JOptionPane.showMessageDialog(this, "No Enough Balance ");
          
          }
      else{
          try{
              String Query="update accounttb set Balance =? where AccNum =?";
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsystem?","root","");
               PreparedStatement ps = Con.prepareCall(Query);
               ps.setInt(1, OldBalance-2000);
               ps.setInt(2,MyAccNum);
               if(ps.executeUpdate()==1)
               {
                 JOptionPane.showMessageDialog(this, "Balance updated");
                  new MainMenu().setVisible(true);
                  this.dispose();
               }else
               {
                 JOptionPane.showMessageDialog(this, "Missing Information");  
               }
           } catch(Exception e){
               
               JOptionPane.showMessageDialog(this, e);
          }
        
      }
    }//GEN-LAST:event_btn2000MouseClicked

    private void btn10000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn10000MouseClicked
        if(OldBalance <10000){
           
              JOptionPane.showMessageDialog(this, "No Enough Balance ");
          
          }
      else{
          try{
              String Query="update accounttb set Balance =? where AccNum =?";
              Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsystem?","root","");
               PreparedStatement ps = Con.prepareCall(Query);
               ps.setInt(1, OldBalance-10000);
               ps.setInt(2,MyAccNum);
               if(ps.executeUpdate()==1)
               {
                 JOptionPane.showMessageDialog(this, "Balance updated");
                  new MainMenu().setVisible(true);
                  this.dispose();
               }else
               {
                 JOptionPane.showMessageDialog(this, "Missing Information");  
               }
           } catch(Exception e){
               
               JOptionPane.showMessageDialog(this, e);
          }
        
      }
    }//GEN-LAST:event_btn10000MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Login().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(fastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fastCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalLab1;
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn1000;
    private javax.swing.JButton btn10000;
    private javax.swing.JButton btn2000;
    private javax.swing.JButton btn500;
    private javax.swing.JButton btn5000;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

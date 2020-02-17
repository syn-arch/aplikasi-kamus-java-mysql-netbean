package view;

import com.sun.glass.events.KeyEvent;
import db.Koneksi;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import session.session;

public class dictionary extends javax.swing.JFrame {
    int mx,my;
    String ind,ing;
    String level = session.getLevelLogin();
    public dictionary() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        txtsession.setText(level);
        icon();
    }
    
    public void icon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../img/icon.png")));
    }
    
   public void find() throws ClassNotFoundException{
       Connection con = Koneksi.adiyatnaDB();
       try {
           String sql = "SELECT * FROM kamus WHERE indonesia LIKE '%"+txtword.getText()+"%'";
           Statement s = con.createStatement();
           ResultSet r = s.executeQuery(sql);
           if (r.next()) {
               txtresult.setText(r.getString("japan"));
           }else{
               JOptionPane.showMessageDialog(null, "The word is unfounded!");
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e.getMessage());
                   
       }
   }
   
      public void search() throws ClassNotFoundException{
       Connection con = Koneksi.adiyatnaDB();
       try {
           String sql = "SELECT * FROM kamus WHERE japan LIKE '%"+txtword.getText()+"%'";
           Statement s = con.createStatement();
           ResultSet r = s.executeQuery(sql);
           if (r.next()) {
               txtresult.setText(r.getString("indonesia"));
           }else{
               JOptionPane.showMessageDialog(null, "The word is not founded!");
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e.getMessage());
                   
       }
   }
      
      public void look() throws ClassNotFoundException{
       Connection con = Koneksi.adiyatnaDB();
       try {
           String sql = "SELECT * FROM kamus WHERE japan LIKE '%"+txtresult.getText()+"%'";
           Statement s = con.createStatement();
           ResultSet r = s.executeQuery(sql);
           if (r.next()) {
               txtword.setText(r.getString("indonesia"));
           }else{
               JOptionPane.showMessageDialog(null, "The word is not founded!");
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e.getMessage());
                   
       }
   }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtresult = new javax.swing.JTextField();
        txtword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdic = new javax.swing.JLabel();
        tgl = new javax.swing.JToggleButton();
        bg = new javax.swing.JLabel();
        txtsession = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 520, 140, 70);

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 310, 160, 60);

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 0, 850, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 110, 90, 90);

        txtresult.setFont(new java.awt.Font("Vani", 0, 24)); // NOI18N
        txtresult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtresult.setBorder(null);
        txtresult.setOpaque(false);
        txtresult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtresultKeyPressed(evt);
            }
        });
        getContentPane().add(txtresult);
        txtresult.setBounds(280, 410, 440, 50);

        txtword.setFont(new java.awt.Font("Vani", 0, 24)); // NOI18N
        txtword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtword.setBorder(null);
        txtword.setOpaque(false);
        txtword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwordActionPerformed(evt);
            }
        });
        txtword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtwordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtwordKeyReleased(evt);
            }
        });
        getContentPane().add(txtword);
        txtword.setBounds(280, 230, 440, 50);

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(930, 0, 40, 30);

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(880, 0, 40, 30);

        txtdic.setFont(new java.awt.Font("Vani", 0, 36)); // NOI18N
        txtdic.setForeground(new java.awt.Color(51, 51, 51));
        txtdic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdic.setText("Indonesia - Japan");
        getContentPane().add(txtdic);
        txtdic.setBounds(310, 130, 370, 60);

        tgl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tgl.setText("Change");
        tgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglActionPerformed(evt);
            }
        });
        getContentPane().add(tgl);
        tgl.setBounds(680, 110, 90, 90);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mini_dictionary.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(-60, 0, 1190, 640);

        txtsession.setForeground(new java.awt.Color(255, 255, 255));
        txtsession.setText("User/Admin");
        getContentPane().add(txtsession);
        txtsession.setBounds(50, 600, 320, 50);

        setSize(new java.awt.Dimension(1010, 636));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    if (level.equals("Admin")) {
            new mainAdmin().setVisible(true);
            this.dispose();
      }else if(level.equals("User")){
          new mainUser().setVisible(true);
          this.dispose();
      }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
    int X = evt.getXOnScreen();
    int Y = evt.getYOnScreen();
    
    this.setLocation(X - mx , Y - my);
    }//GEN-LAST:event_jLabel4MouseDragged

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
    mx = evt.getX();
    my = evt.getY();
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
    int i = JOptionPane.showConfirmDialog(null, "Are You Sure?", "Exit Application",JOptionPane.YES_NO_OPTION);
    if(i == JOptionPane.YES_OPTION){
        System.exit(0);
    }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
    this.setState(dictionary.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        String cek = txtdic.getText();
        if(cek.equals("Indonesia - Japan")){
           try {
            find();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dictionary.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }else{
           try {
            search();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dictionary.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void txtwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtwordKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String cek = txtdic.getText();
        if(cek.equals("Indonesia - Japan")){
           try {
            find();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dictionary.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }else{
           try {
            search();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dictionary.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
        
        }
    }//GEN-LAST:event_txtwordKeyPressed

    private void txtwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtwordKeyReleased

    }//GEN-LAST:event_txtwordKeyReleased

    private void tglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglActionPerformed
    if (tgl.isSelected()) {
            txtdic.setText("Japan - Indonesia");
        }else{
            txtdic.setText("Indonesia - Japan");
        }
    }//GEN-LAST:event_tglActionPerformed

    private void txtwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwordActionPerformed

    private void txtresultKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtresultKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        try {
            look();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_txtresultKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    txtword.setText("");
    txtresult.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dictionary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton tgl;
    private javax.swing.JLabel txtdic;
    private javax.swing.JTextField txtresult;
    private javax.swing.JLabel txtsession;
    private javax.swing.JTextField txtword;
    // End of variables declaration//GEN-END:variables

    private ResultSet executeQuery(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

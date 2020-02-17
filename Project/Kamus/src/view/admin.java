package view;

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

public class admin extends javax.swing.JFrame {
    int mx,my;
    String id,fn,user,pass;
    public admin() throws ClassNotFoundException {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        listed();
        icon();
    }
    
    public void icon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../img/icon.png")));
    }
    
        public void listed() throws ClassNotFoundException{
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Id");
        table.addColumn("Username");
        table.addColumn("Password");
        table.addColumn("Level");
        
        try {
            String sql = "SELECT * FROM user WHERE level = 'Admin'";
            Connection con = Koneksi.adiyatnaDB();
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
               table.addRow (new Object[]{
               r.getString(1),
               r.getString(2),
               r.getString(3),
               r.getString(4),
            });
            }
            tbladmin.setModel(table);
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null,error.getMessage());
        }
    }
        
    public void load(){
        id = txtid.getText();
        user = txtusername.getText();
        pass = txtpassword.getText();
    }
    
    public void empty(){
        txtid.setText("");
        txtusername.setText("");
        txtpassword.setText("");
    }
    
    public void add() throws ClassNotFoundException{
        load();
            try {
                String sql = "INSERT INTO user VALUES( null ,'"+user+"','"+pass+"','"+"Admin"+"')";            
                Koneksi.adiyatnaDB().createStatement().executeUpdate(sql);
                listed();
                JOptionPane.showMessageDialog(null,"Save data is Succescfully");
                empty();
            } catch (SQLException error) {
                JOptionPane.showMessageDialog(rootPane,error.getMessage());
            }
    }
    
    public void update() throws ClassNotFoundException{
        load();
            try {
                String sql = "UPDATE user SET "
                        + "username = '"+user+"',"
                        + "password = '"+pass+"'"
                        + "WHERE id = '"+txtid.getText()+"' ";
                Koneksi.adiyatnaDB().createStatement().executeUpdate(sql);
                listed();
                JOptionPane.showMessageDialog(null,"Update data is Succescfully");
                empty();
            } catch (SQLException error) {
                JOptionPane.showMessageDialog(rootPane,error.getMessage());
            }
    }
    
    public void delete() throws ClassNotFoundException{
        load();
        int i = JOptionPane.showConfirmDialog(null, "Are You Sure?", "Delete",JOptionPane.YES_NO_OPTION);
        if(i == JOptionPane.YES_OPTION){
            try {
                String sql  = "DELETE FROM user WHERE id = '"+txtid.getText()+"'";
                Koneksi.adiyatnaDB().createStatement().executeUpdate(sql);
                listed();
                JOptionPane.showMessageDialog(null,"Delete data is Succesfully");
                empty();
            } catch (SQLException error) {
                JOptionPane.showMessageDialog(rootPane,error.getMessage());
            }
        }
    }
    
    public void selectdata(){
         int i = tbladmin.getSelectedRow();

         txtid.setText(""+tbladmin.getValueAt(i,0));
         txtusername.setText(""+tbladmin.getValueAt(i,1));
         txtpassword.setText(""+tbladmin.getValueAt(i,2));
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbladmin = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        tbladmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbladmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbladminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbladmin);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(500, 130, 452, 402);

        jLabel6.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("-");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(900, 0, 30, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("x");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(930, 0, 40, 30);

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 480, 100, 30);

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 0, 930, 30);

        txtusername.setBackground(new java.awt.Color(230, 230, 230));
        txtusername.setBorder(null);
        txtusername.setOpaque(false);
        getContentPane().add(txtusername);
        txtusername.setBounds(130, 260, 220, 30);

        txtpassword.setBackground(new java.awt.Color(230, 230, 230));
        txtpassword.setBorder(null);
        txtpassword.setOpaque(false);
        getContentPane().add(txtpassword);
        txtpassword.setBounds(130, 350, 220, 30);

        jLabel8.setFont(new java.awt.Font("Raavi", 0, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Admin is highest super user!");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 50, 232, 230);

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 420, 100, 40);

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 420, 110, 40);

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 420, 100, 40);

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(110, 120, 270, 90);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mini_admin.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(-60, 0, 1190, 640);

        txtid.setEditable(false);
        txtid.setBorder(null);
        txtid.setOpaque(false);
        getContentPane().add(txtid);
        txtid.setBounds(110, 80, 250, 40);

        setSize(new java.awt.Dimension(1010, 636));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new mainAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();

        this.setLocation(X - mx , Y - my);
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        mx = evt.getX();
        my = evt.getY();
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setState(dictionary.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        int i = JOptionPane.showConfirmDialog(null, "Are You Sure?", "Exit Application",JOptionPane.YES_NO_OPTION);
        if(i == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        try {
            add();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            update();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try {
            delete();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void tbladminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbladminMouseClicked
    selectdata();
    }//GEN-LAST:event_tbladminMouseClicked

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new admin().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbladmin;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}

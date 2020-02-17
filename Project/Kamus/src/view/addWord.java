package view;

import db.Koneksi;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class addWord extends javax.swing.JFrame {
    int mx,my;
    String id,indo,jp;
    public addWord() throws ClassNotFoundException {
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
        table.addColumn("Indonesia");
        table.addColumn("Japan");
        
        try {
            String sql = "SELECT * FROM kamus";
            Connection con = Koneksi.adiyatnaDB();
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
               table.addRow (new Object[]{
               r.getString(1),
               r.getString(2),
               r.getString(3),
            });
            }
            tblword.setModel(table);
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null,error.getMessage());
        }
    }
        
    public void load(){
        id = txtid.getText();
        indo = txtindo.getText();
        jp = txtjp.getText();
    }
    
    public void empty(){
        txtid.setText("");
        txtindo.setText("");
        txtjp.setText("");
        txtindo.requestFocus();
    }
    
    public void add() throws ClassNotFoundException{
        load();
            try {
                String sql = "INSERT INTO kamus VALUES( null , '"+indo+"','"+jp+"')";            
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
                String sql = "UPDATE kamus SET "
                        + "indonesia = '"+indo+"',"
                        + "japan = '"+jp+"'"
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
                String sql  = "DELETE FROM kamus WHERE id = '"+txtid.getText()+"'";
                String reset ="ALTER TABLE kamus DROP id";
                String numbers = "ALTER TABLE kamus ADD id INT NOT NULL AUTO_INCREMENT PRIMARY KEY FIRST";
                
                Koneksi.adiyatnaDB().createStatement().executeUpdate(sql);
                Koneksi.adiyatnaDB().createStatement().executeUpdate(reset);
                Koneksi.adiyatnaDB().createStatement().executeUpdate(numbers);
                
                listed();
                JOptionPane.showMessageDialog(null,"Delete data is Succesfully");
                empty();
            } catch (SQLException error) {
                JOptionPane.showMessageDialog(rootPane,error.getMessage());
            }
        }
    }
    
    public void selectdata(){
         int i = tblword.getSelectedRow();
         txtid.setText(""+tblword.getValueAt(i,0));
         txtindo.setText(""+tblword.getValueAt(i,1));
         txtjp.setText(""+tblword.getValueAt(i,2));
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblword = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtindo = new javax.swing.JTextField();
        txtjp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        tblword.setModel(new javax.swing.table.DefaultTableModel(
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
        tblword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblwordMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblword);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(500, 130, 452, 402);

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel6MouseDragged(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 0, 850, 30);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Word");
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(450, 0, 100, 30);

        jLabel7.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("-");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(900, 0, 30, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("x");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(930, 0, 40, 30);

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 420, 100, 40);

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 430, 110, 40);

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 480, 100, 30);

        txtindo.setBackground(new java.awt.Color(230, 230, 230));
        txtindo.setBorder(null);
        txtindo.setOpaque(false);
        txtindo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtindoKeyPressed(evt);
            }
        });
        getContentPane().add(txtindo);
        txtindo.setBounds(130, 210, 220, 30);

        txtjp.setBackground(new java.awt.Color(230, 230, 230));
        txtjp.setBorder(null);
        txtjp.setOpaque(false);
        txtjp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtjpKeyPressed(evt);
            }
        });
        getContentPane().add(txtjp);
        txtjp.setBounds(130, 300, 220, 30);

        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(310, 370, 100, 40);

        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 370, 100, 40);

        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 370, 110, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mini_add word.png"))); // NOI18N
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
 
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    new mainAdmin().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseDragged
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();

        this.setLocation(X - mx , Y - my);
    }//GEN-LAST:event_jLabel6MouseDragged

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        mx = evt.getX();
        my = evt.getY();
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setState(dictionary.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        int i = JOptionPane.showConfirmDialog(null, "Are You Sure?", "Exit Application",JOptionPane.YES_NO_OPTION);
        if(i == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
            add();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        try {
            update();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        try {
            delete();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void tblwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblwordMouseClicked
    selectdata();
    }//GEN-LAST:event_tblwordMouseClicked

    private void txtindoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtindoKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
    try {
        add();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
    }
        }
    }//GEN-LAST:event_txtindoKeyPressed

    private void txtjpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjpKeyPressed
    if (evt.getKeyCode() == com.sun.glass.events.KeyEvent.VK_ENTER) {
    try {
        add();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
    }
        }
    }//GEN-LAST:event_txtjpKeyPressed

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
            java.util.logging.Logger.getLogger(addWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                    new addWord().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(addWord.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblword;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtindo;
    private javax.swing.JTextField txtjp;
    // End of variables declaration//GEN-END:variables
}

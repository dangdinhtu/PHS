/*
 * loginForm.java
 *
 * Created on March 4, 2006, 5:33 AM
 */

package phs_project;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author  Administrator
 */
public class loginForm extends javax.swing.JDialog { 
    
    /** Creates new form loginForm */
    public loginForm() {
        //end connection
        initComponents();
        Check();        
        new ChangeLookFeel().configureUI();
    }
    private void Check(){
        server = txtServer.getText().trim();
        if(check.isSelected()){
            txtServer.setEditable(true);
        }
        else{
            txtServer.setEditable(false);
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btCancel = new javax.swing.JButton();
        btLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtServer = new javax.swing.JTextField();
        check = new javax.swing.JCheckBox();
        TienHuynh = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("\u0110\u0103ng nh\u1eadp h\u1ec7 th\u1ed1ng");
        setAlwaysOnTop(true);
        setResizable(false);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUserName.setFont(new java.awt.Font("Times New Roman", 0, 12));
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnterKeyEvent(evt);
                CancelKeyEvent(evt);
            }
        });

        jLabel1.setText("T\u00e0i kho\u1ea3n");

        jLabel2.setText("M\u1eadt kh\u1ea9u");

        btCancel.setText("Tho\u00e1t");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        btCancel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CancelKeyEvent(evt);
            }
        });

        btLogin.setText("\u0110\u0103ng nh\u1eadp");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 12));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnterKeyEvent(evt);
                CancelKeyEvent(evt);
            }
        });

        txtServer.setText("LOCALHOST");

        check.setText("M\u00e1y ch\u1ee7");
        check.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        check.setMargin(new java.awt.Insets(0, 0, 0, 0));
        check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(check)
                    .add(jLabel2))
                .add(44, 44, 44)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(txtPassword)
                    .add(txtServer)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(btLogin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btCancel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                    .add(txtUserName))
                .add(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(txtUserName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(6, 6, 6)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(txtPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(check)
                    .add(txtServer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btCancel)
                    .add(btLogin))
                .addContainerGap())
        );

        TienHuynh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phs_project/Image/logo_login.gif")));
        jLabel4.setToolTipText("");
        jLabel4.setAlignmentY(0.0F);

        org.jdesktop.layout.GroupLayout TienHuynhLayout = new org.jdesktop.layout.GroupLayout(TienHuynh);
        TienHuynh.setLayout(TienHuynhLayout);
        TienHuynhLayout.setHorizontalGroup(
            TienHuynhLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel4)
        );
        TienHuynhLayout.setVerticalGroup(
            TienHuynhLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel4)
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TienHuynh, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
            .add(jPanel2, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(TienHuynh, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void checkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkMouseClicked
// TODO add your handling code here:
        Check();
    }//GEN-LAST:event_checkMouseClicked

    private void CancelKeyEvent(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CancelKeyEvent
// TODO add your handling code here:
        if(evt.getKeyCode() ==KeyEvent.VK_ESCAPE){
            btCancel.doClick();
        }
        
    }//GEN-LAST:event_CancelKeyEvent

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
// TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btCancelActionPerformed

    private void EnterKeyEvent(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterKeyEvent
// TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btLogin.doClick();
        }
    }//GEN-LAST:event_EnterKeyEvent

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
// TODO add your handling code here:
        server = txtServer.getText().trim();
        int Result = login(txtUserName.getText(),txtPassword.getText());
        if(Result == 1){
            this.setVisible(false);
            hotelForm af = new hotelForm();
            af.mnitUser.setEnabled(true);
            af.setVisible(true);
        }
        else if(Result == 2){
            this.dispose();
            hotelForm af = new hotelForm();            
            af.mnitUser.setEnabled(false);
            af.setVisible(true);
        }
        else{
            login_count++;
            if(login_count <= 3){
                JOptionPane.showMessageDialog(this,"Liên kiết đến máy chủ thất bại");
                txtUserName.setText("");
                txtPassword.setText("");
                txtUserName.requestFocus();
            }
            else{
                System.exit(0);
            }
        }
    }//GEN-LAST:event_btLoginActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
                  
            }
        });
    }

public int login(String username,String password){    
        int Result = 0;        
        int row_count  =0;
        //String usertypename = null;
        try{
            if(con == null){
                con = new connectDatabase().getConnection();   
            }                        
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);            
            String sql = "SELECT username,password,userTypeName  ";
            sql = sql + "FROM users INNER JOIN userType ";
            sql = sql + "ON users.userTypeId = userType.userTypeId ";
            sql = sql + "WHERE username = '"+username+"' ";
            sql =  sql +"AND password = '"+password+"'";
            ResultSet rs = st.executeQuery(sql);
            rs.last();
            row_count = rs.getRow();
            if(row_count != 0){            
                usertypename = rs.getString(3);   
                user = rs.getString(1);
                if(usertypename.equals("Quản trị cấp cao")){ 
                    Result = 1;
                }
                else if(usertypename.equals("Nhân viên")){
                    Result = 2;
                }
            }                                    
        }
        catch(Exception e){
            System.out.println(e);
        }
        return Result;
    }
    
   // private String sql;
    public static String user = "";
    public static String server = "LOCALHOST";
    private int login_count =0;
    private java.sql.Connection con = null;
    private java.sql.Statement st;
    public static  String usertypename;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TienHuynh;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btLogin;
    private javax.swing.JCheckBox check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtServer;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

}

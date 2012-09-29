/*
 * checkOut.java
 *
 * Created on March 25, 2006, 11:59 PM
 */
package phs_project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author  nhoc
 */
public class checkOut extends javax.swing.JFrame {

    /** Creates new form checkOut */
    public checkOut() {
        initComponents();
        MDH.setText(hotelForm.ODID);
        SQLRUN("sumtotal '" + hotelForm.ODID + "'"); // Chay ham tinh tien cho hoa don co ma hotelForm.ODID
        CostOfRoomShow(hotelForm.ODID); // hien bang rooms
        CostOfServicesShow(hotelForm.ODID); // hien bang services
        CostOfOrderShow(hotelForm.ODID); // hien gia don hang
        //sumtotal(hotelForm.ODID,Tongtien);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        MDH = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CostOfRoom = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CostOfServices = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        phatsinh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        giamgia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Tongtien = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Scroolbar = new javax.swing.JScrollPane();
        CostOfOrder = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Thanh to\u00e1n v\u00e0 tr\u1ea3 ph\u00f2ng");
        jLabel1.setText("M\u00e3 \u0111\u01a1n h\u00e0ng");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh s\u00e1ch ph\u00f2ng \u0111\u00e3 thu\u00ea"));
        CostOfRoom.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(CostOfRoom);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh s\u00e1ch d\u1ecbch v\u1ee5 \u0111\u00e3 g\u1ecdi"));
        CostOfServices.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(CostOfServices);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("Gi\u1ea3m gi\u00e1");

        phatsinh.setText("0");

        jLabel3.setText("Chi ph\u00ed ph\u00e1t sinh");

        giamgia.setText("0");

        jLabel4.setText("T\u1ed5ng s\u1ed1 ti\u1ec1n");

        Tongtien.setText("0");

        jButton1.setText("T\u00ednh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ho\u00e0n t\u1ea5t");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Kh\u00e1ch tr\u1ea3");

        jTextField1.setText("0");

        jLabel7.setText("Ph\u1ea7n b\u00f9");

        jTextField2.setText("0");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("T\u1ed5ng chi ph\u00ed"));
        CostOfOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Scroolbar.setViewportView(CostOfOrder);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(Scroolbar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(Scroolbar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel1)
                        .add(27, 27, 27)
                        .add(MDH, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(19, 19, 19)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(43, 43, 43)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jLabel3)
                                    .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(jLabel7))
                                .add(69, 69, 69)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, giamgia)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jTextField2)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jTextField1)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, Tongtien, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                        .add(phatsinh, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jButton1)))
                            .add(jLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton2)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(MDH, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(38, 38, 38)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(31, 31, 31)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(32, 32, 32)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jButton2)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(phatsinh, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(giamgia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Tongtien, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel4))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel6))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton1))
                            .add(layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(jLabel7)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
        SQLRUN("sumtotal '" + hotelForm.ODID + "'"); // tinh lai tien
        sumtotal(MDH.getText(), Tongtien);
        CostOfOrderShow(MDH.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
        this.dispose();
        hotelForm.ODID = null;
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new checkOut().setVisible(true);
            }
        });
    }

    private void CostOfRoomShow(String ROID) // hien cac phong da thue
    {
        String sqltb = "select * from costofrooms where [Mã]='" + ROID + "'";
        new sqlDatabase().addDataTable(sqltb, CostOfRoom);
    }

    private void CostOfServicesShow(String SOID) // hien cac dich vu da dung
    {
        String sqltb = "select * from CostOfServices where [Mã]='" + SOID + "'";
        new sqlDatabase().addDataTable(sqltb, CostOfServices);
    }

    private void CostOfOrderShow(String COID) {

        String sqltb = "select * from OrderOfCus where [Mã]='" + COID + "'";
        new sqlDatabase().addDataTable(sqltb, CostOfOrder);

    }

    private void sumtotal(String OID, JTextField txtreturn) // tinh tong tien tren hoa don co ma OID va dua gia tri vao TextFeid
    {
        int addition;
        int discount;
        addition = Integer.parseInt(giamgia.getText());
        discount = Integer.parseInt(phatsinh.getText());
        String sqlupdate = " update orders set  addition ='" + addition + "', discount ='"
                + discount + "' where orderid ='" + OID + "'";
        SQLRUN(sqlupdate);
        new sqlDatabase().addDataToTextField("select totalfee from orders where orderId= '" + OID + "'", txtreturn);
        //System.err.println(sqlupdate);
        // ghichu.setText(sqlupdate);
    }

// COPY Tu day di tat ca cac form
                                  /* import cac goi nay
    import java.sql.Connection;
    import java.sql.ResultSet;
    import java.sql.ResultSetMetaData;
    import java.sql.Statement;
    import javax.swing.JOptionPane;
    import javax.swing.JTable;
    import javax.swing.JTextField;

     */
    private void SQLRUN(String SQLTEXT) // Ham de chay cau truy van
    {
        try {
            Connection conn = new connectDatabase().getConnection();
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stm.execute(SQLTEXT);
            conn.close();
            stm.close();
            System.out.println(SQLTEXT);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String SelectedRowToString(JTable TableName, int CollNumb) // Lay va In ten truong thu CollNumb ra  bietn ReturnValua, lay 1 bien
    {
        //int CollNumb ;
        //CollNumb=0;
        int RowSelected;
        String ReturnValue;
        RowSelected = TableName.getSelectedRow();
        ReturnValue = TableName.getValueAt(RowSelected, CollNumb).toString();
        System.out.println(ReturnValue + " ");
        return ReturnValue;
        //System.out.println(TableName.getValueAt(RowSelected,CollNumb));

    }

    private void addItemTooCombobox(JComboBox ComboboxName, String sqlcb) // Dua du lieu tu cau truy van vao combobox, chi co 1 truong trong du lieu
    {
        //String sqlcb = "select TenTruogn from TenBang";
        ComboboxName.addItem("Chon 1");
        new sqlDatabase().addDataCombobox(sqlcb, ComboboxName);
    }

    private void addItemToTable(JTable TableName, String sqltb)// Lay du lieu tu cau truy van dua vao tabe, nhieu ten bang
    {

        //String sqltb=  "select * from Tenbang";
        new sqlDatabase().addDataTable(sqltb, TableName);

    }
    //  Copy tu day di tat ca cac form
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CostOfOrder;
    private javax.swing.JTable CostOfRoom;
    private javax.swing.JTable CostOfServices;
    private javax.swing.JTextField MDH;
    private javax.swing.JScrollPane Scroolbar;
    private javax.swing.JTextField Tongtien;
    private javax.swing.JTextField giamgia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField phatsinh;
    // End of variables declaration//GEN-END:variables
}

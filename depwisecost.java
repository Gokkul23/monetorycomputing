/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nikhil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ELCOT
 */
public class depwisecost extends javax.swing.JFrame {

    /**
     * Creates new form depwisecost
     */
    String s;
    public depwisecost() {}
    public depwisecost(String f){
        initComponents();
        s=f;
        name1.setText(""); clg1.setText(""); cost1.setText("");
        name2.setText(""); clg2.setText(""); cost2.setText("");
        name3.setText(""); clg3.setText(""); cost3.setText("");
        name4.setText(""); clg4.setText(""); cost4.setText("");
        name5.setText(""); clg5.setText(""); cost5.setText("");
        name6.setText(""); clg6.setText(""); cost6.setText("");
        Connection conn=null;
        try
       {String driverName="oracle.jdbc.driver.OracleDriver";
           Class.forName(driverName);
           String serverName="localhost";
           String serverPort="1521";
           String sid="Prassy";
           String url="jdbc:oracle:thin:@localhost:1521/Prassy";
           String username="nikhilproject";
           String password="nikki";
           conn=DriverManager.getConnection(url,username,password);
           System.out.println("Connected");
           Statement st=conn.createStatement();
           ResultSet rs=st.executeQuery("select symp_name,clg_code,cost from symposium where dep_id="+s+"");
           String name[]= new String[6];
           String clg[]=new String[6];
           String cost[]=new String[6]; 
           int i=0;
           while(rs.next() && i<6)
           {
               name[i]=rs.getString(1);
               clg[i]=rs.getString(2);
               cost[i]=rs.getString(3);
               i++;
           }
           name1.setText(name[0]);
           name2.setText(name[1]);
           name3.setText(name[2]);
           name4.setText(name[3]);
           name5.setText(name[4]);
           name6.setText(name[5]);
           clg1.setText(clg[0]);
           clg2.setText(clg[1]);
           clg3.setText(clg[2]);
           clg4.setText(clg[3]);
           clg5.setText(clg[4]);
           clg6.setText(clg[5]);
           cost1.setText(cost[0]);
           cost2.setText(cost[1]);
           cost3.setText(cost[2]);
           cost4.setText(cost[3]);
           cost5.setText(cost[4]);
           cost6.setText(cost[5]);
           CallableStatement cs; 
           String str="select computeSympcost1(?) from dual";
                        cs=conn.prepareCall(str);
                        cs.setString(1,s);
                        ResultSet rs1=cs.executeQuery();
                        try{
                            while(rs1.next()){
                                String g=rs1.getString(1);
                                totcost.setText(g);
                            }
                        }
                        catch(SQLException ex){
                            System.out.println(ex);
                        }
       }
       
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.println(e);
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

        jButton1 = new javax.swing.JButton();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        clg1 = new javax.swing.JLabel();
        clg2 = new javax.swing.JLabel();
        clg3 = new javax.swing.JLabel();
        clg4 = new javax.swing.JLabel();
        clg5 = new javax.swing.JLabel();
        clg6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cost1 = new javax.swing.JLabel();
        cost2 = new javax.swing.JLabel();
        cost3 = new javax.swing.JLabel();
        cost4 = new javax.swing.JLabel();
        cost5 = new javax.swing.JLabel();
        cost6 = new javax.swing.JLabel();
        totcost = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        name1.setText("jLabel1");

        name2.setText("jLabel2");

        name3.setText("jLabel3");

        name4.setText("jLabel4");

        name5.setText("jLabel5");

        name6.setText("jLabel6");

        jLabel7.setText("NAME");

        jLabel1.setText("COLLEGE CODE");

        clg1.setText("jLabel2");

        clg2.setText("jLabel3");

        clg3.setText("jLabel4");

        clg4.setText("jLabel5");

        clg5.setText("jLabel6");

        clg6.setText("jLabel8");

        jLabel2.setText("COST");

        cost1.setText("jLabel3");

        cost2.setText("jLabel4");

        cost3.setText("jLabel5");

        cost4.setText("jLabel6");

        cost5.setText("jLabel8");

        cost6.setText("jLabel9");

        totcost.setText("jLabel3");

        jLabel3.setText("TOTAL COST:");

        jLabel4.setText("DEPARTMENT WISE SYMPOSIUM COST");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(name1)
                            .addComponent(name2)
                            .addComponent(name3)
                            .addComponent(name4)
                            .addComponent(name5)
                            .addComponent(name6)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totcost))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clg2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cost2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clg6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cost6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clg3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cost3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clg4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cost4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clg5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cost5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clg1)
                        .addGap(134, 134, 134)
                        .addComponent(cost1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1)
                    .addComponent(clg1)
                    .addComponent(cost1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name2)
                    .addComponent(clg2)
                    .addComponent(cost2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name3)
                    .addComponent(clg3)
                    .addComponent(cost3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name4)
                    .addComponent(clg4)
                    .addComponent(cost4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name5)
                    .addComponent(clg5)
                    .addComponent(cost5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name6)
                    .addComponent(clg6)
                    .addComponent(cost6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3)
                    .addComponent(totcost))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(depwisecost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(depwisecost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(depwisecost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(depwisecost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new depwisecost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clg1;
    private javax.swing.JLabel clg2;
    private javax.swing.JLabel clg3;
    private javax.swing.JLabel clg4;
    private javax.swing.JLabel clg5;
    private javax.swing.JLabel clg6;
    private javax.swing.JLabel cost1;
    private javax.swing.JLabel cost2;
    private javax.swing.JLabel cost3;
    private javax.swing.JLabel cost4;
    private javax.swing.JLabel cost5;
    private javax.swing.JLabel cost6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel totcost;
    // End of variables declaration//GEN-END:variables
}

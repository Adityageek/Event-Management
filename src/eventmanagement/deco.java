/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * deco.java
 *
 * Created on Dec 14, 2014, 9:08:51 PM
 */

package eventmanagement;
import java.sql.*;

/**
 *
 * @author Aman
 */
public class deco extends javax.swing.JFrame {

    /** Creates new form deco */
    public deco() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Elephant", 3, 24));
        jLabel1.setText("DECORATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jRadioButton1.setText("Rajasthani Theme ");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jRadioButton2.setText("Classical Theme");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jRadioButton3.setText("Royal Theme");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jRadioButton4.setText("Valentine Theme");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 3, 14));
        jLabel2.setText("Theme for Marriage ,Anniversery  !!!!!!!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 3, 14));
        jLabel3.setText("Other Decoration !!!!!!!!!!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jRadioButton5.setText("Flower Decoration");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jRadioButton6.setText("Round Table ");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jRadioButton7.setText("Ballon Decoration");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Documents and Settings\\Aman\\My Documents\\NetBeansProjects\\Event Managementt\\rajasthani.jpg")); // NOI18N
        jLabel4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel4PropertyChange(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Documents and Settings\\Aman\\My Documents\\NetBeansProjects\\Event Managementt\\royal.jpg")); // NOI18N
        jLabel5.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel5PropertyChange(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Documents and Settings\\Aman\\My Documents\\NetBeansProjects\\Event Managementt\\classic.jpg")); // NOI18N
        jLabel6.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel6PropertyChange(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Documents and Settings\\Aman\\My Documents\\NetBeansProjects\\Event Managementt\\valentine.jpg")); // NOI18N
        jLabel7.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel7PropertyChange(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Documents and Settings\\Aman\\My Documents\\NetBeansProjects\\Event Managementt\\flower.jpg")); // NOI18N
        jLabel8.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel8PropertyChange(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\Documents and Settings\\Aman\\My Documents\\NetBeansProjects\\Event Managementt\\round.jpg")); // NOI18N
        jLabel9.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel9PropertyChange(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\Documents and Settings\\Aman\\My Documents\\NetBeansProjects\\Event Managementt\\ballon.jpg")); // NOI18N
        jLabel10.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel10PropertyChange(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, -1, -1));

        jLabel11.setText("ENTER THE COST OF SELECTED ITEM IS RS...");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 20));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 70, -1));

        jButton3.setText("ENTER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("static-access")
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
 jRadioButton2.setSelected(false);
jRadioButton3.setSelected(false);
jRadioButton4.setSelected(false);
jRadioButton5.setSelected(false);
jRadioButton6.setSelected(false);
jRadioButton7.setSelected(false);
jLabel4.setVisible(true);
jLabel5.setVisible(false);
jLabel6.setVisible(false);
jLabel7.setVisible(false);
jLabel8.setVisible(false);
jLabel9.setVisible(false);
jLabel10.setVisible(false);
jOptionPane1.showMessageDialog(null,"THE COST OF SELECTED IS RS... 30000");

// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    @SuppressWarnings("static-access")
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
 jRadioButton1.setSelected(false);
jRadioButton3.setSelected(false);
jRadioButton4.setSelected(false);
jRadioButton5.setSelected(false);
jRadioButton6.setSelected(false);
jRadioButton7.setSelected(false);
jLabel6.setVisible(true);
jLabel5.setVisible(false);
jLabel4.setVisible(false);
jLabel7.setVisible(false);
jLabel8.setVisible(false);
jLabel9.setVisible(false);
jLabel10.setVisible(false);
jOptionPane1.showMessageDialog(null,"THE COST OF SELECTED IS RS... 25000");
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    @SuppressWarnings("static-access")
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
 jRadioButton2.setSelected(false);
jRadioButton1.setSelected(false);
jRadioButton4.setSelected(false);
jRadioButton5.setSelected(false);
jRadioButton6.setSelected(false);
jRadioButton7.setSelected(false);
jLabel5.setVisible(true);
jLabel4.setVisible(false);
jLabel6.setVisible(false);
jLabel7.setVisible(false);
jLabel8.setVisible(false);
jLabel9.setVisible(false);
jLabel10.setVisible(false);
jOptionPane1.showMessageDialog(null,"THE COST OF SELECTED IS RS... 28000");


    }//GEN-LAST:event_jRadioButton3ActionPerformed

    @SuppressWarnings("static-access")
    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
 jRadioButton2.setSelected(false);
jRadioButton3.setSelected(false);
jRadioButton1.setSelected(false);
jRadioButton5.setSelected(false);
jRadioButton6.setSelected(false);
jRadioButton7.setSelected(false);
jLabel5.setVisible(false);
jLabel4.setVisible(false);
jLabel6.setVisible(false);
jLabel7.setVisible(true);
jLabel8.setVisible(false);
jLabel9.setVisible(false);
jLabel10.setVisible(false);
jOptionPane1.showMessageDialog(null,"THE COST OF SELECTED IS RS... 25000");
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    @SuppressWarnings("static-access")
    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
 jRadioButton2.setSelected(false);
jRadioButton3.setSelected(false);
jRadioButton4.setSelected(false);
jRadioButton1.setSelected(false);
jRadioButton6.setSelected(false);
jRadioButton7.setSelected(false);
jLabel5.setVisible(false);
jLabel4.setVisible(false);
jLabel6.setVisible(false);
jLabel7.setVisible(false);
jLabel8.setVisible(true);
jLabel9.setVisible(false);
jLabel10.setVisible(false);
jOptionPane1.showMessageDialog(null,"THE COST OF SELECTED IS RS... 20000");
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    @SuppressWarnings("static-access")
    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
 jRadioButton2.setSelected(false);
jRadioButton3.setSelected(false);
jRadioButton4.setSelected(false);
jRadioButton5.setSelected(false);
jRadioButton1.setSelected(false);
jRadioButton7.setSelected(false);
jLabel5.setVisible(false);
jLabel4.setVisible(false);
jLabel6.setVisible(false);
jLabel7.setVisible(false);
jLabel8.setVisible(false);
jLabel9.setVisible(true);
jLabel10.setVisible(false);
jOptionPane1.showMessageDialog(null,"THE COST OF SELECTED IS RS... 22000");
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    @SuppressWarnings("static-access")
    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
 jRadioButton2.setSelected(false);
jRadioButton3.setSelected(false);
jRadioButton4.setSelected(false);
jRadioButton5.setSelected(false);
jRadioButton6.setSelected(false);
jRadioButton1.setSelected(false);
jLabel5.setVisible(false);
jLabel4.setVisible(false);
jLabel6.setVisible(false);
jLabel7.setVisible(false);
jLabel8.setVisible(false);
jLabel9.setVisible(false);
jLabel10.setVisible(true);
jOptionPane1.showMessageDialog(null,"THE COST OF SELECTED IS RS... 20000");
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    @SuppressWarnings("static-access")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
banquet bq=new banquet();
 
  String cost=jTextField1.getText();
    if( cost.equals(""))
    {
         jOptionPane1.showMessageDialog(null,"Please Select Your Choice & Enter The Price");
      }else
      
if(jRadioButton1.isSelected()){

    bq.setVisible(true);
    this.setVisible(false);
}else
    if(jRadioButton2.isSelected()){

    bq.setVisible(true);
    this.setVisible(false);
}else
    if(jRadioButton3.isSelected()){

    bq.setVisible(true);
    this.setVisible(false);
}else
    if(jRadioButton4.isSelected()){

    bq.setVisible(true);
    this.setVisible(false);
}else
if(jRadioButton5.isSelected()){

    bq.setVisible(true);
    this.setVisible(false);
}else
if(jRadioButton6.isSelected()){

    bq.setVisible(true);
    this.setVisible(false);
}else
if(jRadioButton7.isSelected()){

    bq.setVisible(true);
    this.setVisible(false);
    
}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jLabel4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel4PropertyChange
jLabel4.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4PropertyChange

    private void jLabel5PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel5PropertyChange
jLabel5.setVisible(false);         
    }//GEN-LAST:event_jLabel5PropertyChange

    private void jLabel6PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel6PropertyChange
jLabel6.setVisible(false);        
    }//GEN-LAST:event_jLabel6PropertyChange

    private void jLabel7PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel7PropertyChange
jLabel7.setVisible(false);       
    }//GEN-LAST:event_jLabel7PropertyChange

    private void jLabel8PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel8PropertyChange
jLabel8.setVisible(false);        
    }//GEN-LAST:event_jLabel8PropertyChange

    private void jLabel9PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel9PropertyChange
jLabel9.setVisible(false);         
    }//GEN-LAST:event_jLabel9PropertyChange

    private void jLabel10PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel10PropertyChange
jLabel10.setVisible(false);        
    }//GEN-LAST:event_jLabel10PropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Arr ar= new Arr();
ar.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden

       // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    @SuppressWarnings("static-access")
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try{
     Class.forName("java.sql.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
         Statement stmt=con.createStatement();
         String query ;
           query="insert into final(deco) values('"+jTextField1.getText()+"');" ;
                    int rs=stmt.executeUpdate(query);
                    jOptionPane1.showMessageDialog(null,"VALUE IS ENTER");
         }
    catch(Exception e){
        System.out.print("error");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}

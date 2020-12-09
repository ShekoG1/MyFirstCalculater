/*
   Temorarily the - Variable control - controls which mathematical function is used by means of the value it holds
    Values are as such:
    1 - multiply
    2 - divide
    3 - add
    4 - subtract
 */
package Calculater;

/**
 *
 * @author SHEKHAR
 */
public class myCalulater extends javax.swing.JFrame {

    /**
     * Creates new form myCalulater
     */
    //My declarations
    private static String userInput="";
    private static int [] number = new int[2];
    private static int control = 0;
    private static int Answer = 0;
    private static int next = 0;
    
    public myCalulater() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp1 = new javax.swing.JPanel();
        jl1 = new javax.swing.JLabel();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jbx = new javax.swing.JButton();
        jbdiv = new javax.swing.JButton();
        jbEquals = new javax.swing.JButton();
        jbCE = new javax.swing.JButton();
        jbSubtract = new javax.swing.JButton();
        jbAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp1.setBackground(new java.awt.Color(255, 255, 255));
        jp1.setForeground(new java.awt.Color(255, 255, 255));

        jl1.setBackground(new java.awt.Color(0, 0, 0));
        jl1.setForeground(new java.awt.Color(0, 0, 0));

        jb1.setText("1");
        jb1.setToolTipText("");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb2.setText("2");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb3.setText("3");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jb4.setText("4");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb5.setText("5");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb6.setText("6");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb7.setText("7");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb8.setText("8");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        jb9.setText("9");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        jb0.setText("0");
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });

        jbx.setText("X");
        jbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbxActionPerformed(evt);
            }
        });

        jbdiv.setText("Divide");
        jbdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdivActionPerformed(evt);
            }
        });

        jbEquals.setText("=");
        jbEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEqualsActionPerformed(evt);
            }
        });

        jbCE.setText("CE");
        jbCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCEActionPerformed(evt);
            }
        });

        jbSubtract.setText("-");
        jbSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubtractActionPerformed(evt);
            }
        });

        jbAdd.setText("+");
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addComponent(jl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb9, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(jb8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jb4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(jb5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbSubtract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbdiv, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jbEquals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbdiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jb5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb0, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jbCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSubtract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jl1.getAccessibleContext().setAccessibleName("jl1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // When the number buttons are pressed
    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        if(next > 1){
        Equals();
        }
        // 1
        if(evt.getSource() == jb1){
           userInput = userInput + "1";
           number[next]=Integer.parseInt(userInput);
        jl1.setText(userInput);
        }  
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        // TODO add your handling code here:
        if(next > 1){
        Equals();
        }
          // 2
        if(evt.getSource() == jb2){
           userInput = userInput + "2";
           number[next]=Integer.parseInt(userInput);
        jl1.setText(userInput);
        }  
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        // TODO add your handling code here:
        if(next > 1){
        Equals();
        }
          // 3
        if(evt.getSource() == jb3){
           userInput = userInput + "3";
           number[next]=Integer.parseInt(userInput);
        jl1.setText(userInput);
        }  
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        // TODO add your handling code here:
        if(next > 1){
        Equals();
        }
          // 4
        if(evt.getSource() == jb4){
           userInput = userInput + "4";
           number[next]=Integer.parseInt(userInput);
        jl1.setText(userInput);
        }  
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        // TODO add your handling code here:
        if(next > 1){
        Equals();
        }
          // 5
        if(evt.getSource() == jb5){
           userInput = userInput + "5";
           number[next]=Integer.parseInt(userInput);
        jl1.setText(userInput);
        }  
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        // TODO add your handling code here:
        if(next > 1){
        Equals();
        }
          // 6
        if(evt.getSource() == jb6){
           userInput = userInput + "6";
           number[next]=Integer.parseInt(userInput);
        jl1.setText(userInput);
        }  
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb0ActionPerformed
        // TODO add your handling code here:
        if(next > 1){
        Equals();
        }
          // 0
        if(evt.getSource() == jb0){
           userInput = userInput + "0";
           number[next]=Integer.parseInt(userInput);
        jl1.setText(userInput);
        }  
    }//GEN-LAST:event_jb0ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        // TODO add your handling code here:
        if(next > 1){
        Equals();
        }
          // 7
        if(evt.getSource() == jb7){
           userInput = userInput + "7";
           number[next]=Integer.parseInt(userInput);
        jl1.setText(userInput);
        }  
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        // TODO add your handling code here:
        if(next > 1){
        Equals();
        }
          // 8
        if(evt.getSource() == jb8){
           userInput = userInput + "8";
           number[next]=Integer.parseInt(userInput);
        jl1.setText(userInput);
        }  
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        // TODO add your handling code here:
        if(next > 1){
        Equals();
        }
          // 9
        if(evt.getSource() == jb9){
           userInput = userInput + "9";
           number[next]=Integer.parseInt(userInput);
        jl1.setText(userInput);
        }  
    }//GEN-LAST:event_jb9ActionPerformed

    private void jbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbxActionPerformed
        // TODO add your handling code here:
       if(evt.getSource() == jbx){
           userInput = "";
           control = control *0 + 1;
           next++;
       jl1.setText(" ");
        }
    }//GEN-LAST:event_jbxActionPerformed

    private void jbdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdivActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == jbdiv){
            userInput = "";
            control = control *0 + 2;
            next++;
            jl1.setText(" ");
        }
    }//GEN-LAST:event_jbdivActionPerformed

    private void jbSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubtractActionPerformed
        // TODO add your handling code here:
        userInput = "";
         if(evt.getSource() == jbSubtract){
             control = control *0 + 4;
             next++;
             jl1.setText(" ");
        }
    }//GEN-LAST:event_jbSubtractActionPerformed

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        // TODO add your handling code here:
         if(evt.getSource() == jbAdd){
             userInput = "";
             control = control *0 + 3;
             next++;
             jl1.setText(" ");
        }
    }//GEN-LAST:event_jbAddActionPerformed

    private void jbEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEqualsActionPerformed
        // TODO add your handling code here:
         if(evt.getSource() == jbEquals){
             jl1.setText(" ");
        Equals();
        }
    }//GEN-LAST:event_jbEqualsActionPerformed

    private void jbCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCEActionPerformed
        // TODO add your handling code here:
         if(evt.getSource() == jbCE){
             next = 0;
             control = 0;
             Answer = 0;
        userInput = "";
        jl1.setText(userInput);
        }
    }//GEN-LAST:event_jbCEActionPerformed
    public void Equals(){
    if(control == 1){
    Multiply();
    }
    if(control == 2){
    Divide();
    }
    if(control == 3){
    Add();
    }
    if(control == 4){
    Subtract();
    }
    }
    
    public void Multiply(){
    userInput = "";
    Answer = number[0] * number[1];
    userInput = Integer.toString(Answer);
    jl1.setText(userInput);
    number[0]= Answer;
    }
    public void Divide(){
        userInput = "";
     Answer = number[0] / number[1];
    userInput = Integer.toString(Answer);
    jl1.setText(userInput);
    number[0]= Answer;
    }
    
    public void Add(){
        userInput = "";
     Answer = number[0] + number[1];
    userInput = Integer.toString(Answer);
    jl1.setText(userInput);
    number[0]= Answer;
    }
    
    public void Subtract(){
        userInput = "";
     Answer = number[0] - number[1];
    userInput = Integer.toString(Answer);
    jl1.setText(userInput);
    number[0]= Answer;
    }
    
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
            java.util.logging.Logger.getLogger(myCalulater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myCalulater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myCalulater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myCalulater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myCalulater().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbCE;
    private javax.swing.JButton jbEquals;
    private javax.swing.JButton jbSubtract;
    private javax.swing.JButton jbdiv;
    private javax.swing.JButton jbx;
    private javax.swing.JLabel jl1;
    private javax.swing.JPanel jp1;
    // End of variables declaration//GEN-END:variables
}

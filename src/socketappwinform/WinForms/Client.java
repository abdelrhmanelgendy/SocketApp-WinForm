/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketappwinform.WinForms;

import com.sun.webkit.event.WCKeyEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

/**
 *
 * @author Abd elrahman
 */
public class Client extends javax.swing.JFrame {

 
    public Client() {
        initComponents();
        comboAlgorithms.setSelectedItem("Binary Search");
        lblError1.setText("");
        
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        comboAlgorithms = new javax.swing.JComboBox<>();
        lblError1 = new javax.swing.JLabel();
        txtArray = new javax.swing.JTextField();
        lblsearch = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSend1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 255, 153));
        setBounds(new java.awt.Rectangle(100, 200, 0, 0));
        setName("myFrame"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 204, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtChat.setColumns(20);
        txtChat.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        txtChat.setForeground(new java.awt.Color(255, 51, 0));
        txtChat.setRows(5);
        txtChat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtChatKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtChat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 750, 300));

        btnSend.setBackground(new java.awt.Color(5, 40, 100));
        btnSend.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        btnSend.setForeground(new java.awt.Color(255, 255, 255));
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        jPanel1.add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 100, 40));

        comboAlgorithms.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        comboAlgorithms.setForeground(new java.awt.Color(4, 50, 100));
        comboAlgorithms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Binary Search", "Sequential Search", "Merge Sort", "Selection Sort", "Bubble Sort", "Insertion Sort", "Count Sort" }));
        comboAlgorithms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAlgorithmsActionPerformed(evt);
            }
        });
        jPanel1.add(comboAlgorithms, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 320, 40));

        lblError1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblError1.setForeground(new java.awt.Color(204, 0, 51));
        lblError1.setText("qcqecqe");
        jPanel1.add(lblError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 560, 30));

        txtArray.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        txtArray.setForeground(new java.awt.Color(4, 50, 100));
        txtArray.setText("45,1,23,6,89,2,0,14,7");
        txtArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArrayActionPerformed(evt);
            }
        });
        txtArray.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtArrayKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtArrayKeyTyped(evt);
            }
        });
        jPanel1.add(txtArray, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 570, 40));

        lblsearch.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblsearch.setForeground(new java.awt.Color(4, 50, 100));
        lblsearch.setText("search For");
        jPanel1.add(lblsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, 30));

        txtNumber.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        txtNumber.setForeground(new java.awt.Color(4, 50, 100));
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });
        txtNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumberKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumberKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 310, 40));

        lblError.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblError.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 540, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(4, 50, 100));
        jLabel8.setText("Array");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 60, -1));

        btnSend1.setBackground(new java.awt.Color(5, 40, 100));
        btnSend1.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        btnSend1.setForeground(new java.awt.Color(255, 255, 255));
        btnSend1.setText("Clear Chat");
        btnSend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSend1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 130, 40));

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 40, 100));
        jLabel1.setText("Client Connected to Port 1201");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 380, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 50, 100));
        jLabel4.setText("Algorithm");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
  
        lblError1.setText("");
        if (txtArray.getText().equals("")||txtArray.getText().equals(",")) {
            lblError1.setText("Please Enter the Array First");
            getToolkit().beep();
            return;
        }
        if (comboAlgorithms.getSelectedItem().toString().equals("Binary Search")) {
            if (txtNumber.getText().equals("")) {
                lblError1.setText("Please Enter the Number You Need To Search For First");
                getToolkit().beep();
            return;
            }
        }
          if (comboAlgorithms.getSelectedItem().toString().equals("Sequential Search")) {
            if (txtNumber.getText().equals("")) {
                lblError1.setText("Please Enter the Number You Need To Search For First");
                getToolkit().beep();
            return;
            }
        }
          if (comboAlgorithms.getSelectedItem().toString().equals("Binary Search")) {
            String text = txtArray.getText();
            String[] split = text.split(",");
            int [] a =new int[split.length];
              for (int i = 0; i < split.length; i++) {
                  a[i]=Integer.parseInt(split[i].toString());
              }
            Arrays.sort(a);
            String z ="";
            for(Object i :a)
            {
            z+=i.toString()+",";
            }
            String result = z.substring(0, z.length()-1);
            txtArray.setText(result);
        
        }
        try {  
   String msgout = "";  
      if (comboAlgorithms.getSelectedItem().toString()=="Sequential Search"||comboAlgorithms.getSelectedItem().toString()=="Binary Search") {
          
           msgout = comboAlgorithms.getSelectedItem().toString()+" "+txtArray.getText()+","+txtNumber.getText();
      }
      else  
      {
          
   msgout = comboAlgorithms.getSelectedItem().toString()+" "+txtArray.getText();
      }
   dtotpt.writeUTF(msgout);  

  } catch (Exception e) {
  txtChat.setText(txtChat.getText()+"\n"+"make sure you are connected to the server");
  }  
       
        
        
        
        
  		

                         
    }//GEN-LAST:event_btnSendActionPerformed

    private void comboAlgorithmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAlgorithmsActionPerformed
txtChat.setText("");
        String s="---------------------------------------";
        txtChat.setText(txtChat.getText()+"\n"+s);
        String item =comboAlgorithms.getSelectedItem().toString();
        if (item=="Sequential Search"||item=="Binary Search") {
             txtNumber.setVisible(true);
         lblsearch.setVisible(true);
         
        }
        else
        {
         txtNumber.setVisible(false);
         lblsearch.setVisible(false);
         
        }
        
        
        
       
   
    }//GEN-LAST:event_comboAlgorithmsActionPerformed

    private void txtArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArrayActionPerformed


        
    }//GEN-LAST:event_txtArrayActionPerformed

    private void txtArrayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtArrayKeyTyped
  char c =evt.getKeyChar();
        if (c!=44&&!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }

        
    }//GEN-LAST:event_txtArrayKeyTyped

    private void txtArrayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtArrayKeyPressed

      
        
    }//GEN-LAST:event_txtArrayKeyPressed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        
    }//GEN-LAST:event_txtNumberActionPerformed

    private void txtNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberKeyPressed

    private void txtNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberKeyTyped
 char c =evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumberKeyTyped

    private void btnSend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend1ActionPerformed
txtChat.setText("");
    }//GEN-LAST:event_btnSend1ActionPerformed

    private void txtChatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChatKeyTyped
 evt.consume();
    }//GEN-LAST:event_txtChatKeyTyped
void Enabled(boolean  x)
{
btnSend.enable(x);

comboAlgorithms.enable(x);
}

    
     static Socket sckt;  
 static DataInputStream dtinpt;  
 static DataOutputStream dtotpt;  
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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
        
         try {  
   sckt = new Socket("127.0.0.1", 1201);  
   dtinpt = new DataInputStream(sckt.getInputStream());  
   dtotpt = new DataOutputStream(sckt.getOutputStream());  
   String msgin = "";  
   while (!msgin.equals("Exit")) {  
    msgin = dtinpt.readUTF();  
  
           txtChat.setText(txtChat.getText()+ "\n" + msgin);  

  
    
   }  
  } catch (Exception e) {
  
  txtChat.setText(txtChat.getText()+"\n"+e.getMessage());
  }  
        
        
       
        
  
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnSend;
    private static javax.swing.JButton btnSend1;
    private javax.swing.JComboBox<String> comboAlgorithms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblError1;
    private javax.swing.JLabel lblsearch;
    private static javax.swing.JTextField txtArray;
    private static javax.swing.JTextArea txtChat;
    private static javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}

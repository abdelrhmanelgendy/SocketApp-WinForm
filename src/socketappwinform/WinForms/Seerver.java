/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketappwinform.WinForms;


import socketappwinform.Algorithms.BinarySearch;
import socketappwinform.Algorithms.SelectionSort;
import socketappwinform.Algorithms.InsertionSort;
import socketappwinform.Algorithms.SequentialSearch;
import socketappwinform.Algorithms.BubbleSort;
import socketappwinform.Algorithms.Merge;
import socketappwinform.Model.AlgorithmArray;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import socketappwinform.Algorithms.CountSort;


/**
 *
 * @author Abd elrahman
// */
public class Seerver extends javax.swing.JFrame {

    private static void MergeSortAlgorithm(AlgorithmArray algoritm) {
        Merge merge =new Merge();
        int[] a = new int[algoritm.getArray().length];
               for (int i = 0; i < algoritm.getArray().length; i++) {
                   a[i]=Integer.parseInt( algoritm.getArray()[i]);
               }
         merge.inputs(a);
    }

    private static void SelectionSortAlgorithm(AlgorithmArray algoritm) {
        
        int[] a = new int[algoritm.getArray().length];
                 for (int i = 0; i < algoritm.getArray().length; i++) {
                   a[i]=Integer.parseInt( algoritm.getArray()[i]);
               }
                 
                 
                 SelectionSort selection =new SelectionSort();
                 selection.inputs(a);
                 
        
        
    }

    private static void SequentialSearchAlgorithm(AlgorithmArray algoritm) {
         SequentialSearch S =new SequentialSearch();

         int[] a = new int[algoritm.getArray().length];
                 for (int i = 0; i < algoritm.getArray().length; i++) {
                   a[i]=Integer.parseInt( algoritm.getArray()[i]);
               }
               int targer =Integer.parseInt(algoritm.getArray()[algoritm.getArray().length-1]);
              int size =algoritm.getArray().length-1;
               S.inputs(targer,size,a);

              
        
 
    }

    private static void BubbleSortAlgorithm(AlgorithmArray algoritm) {
         BubbleSort bubble =new BubbleSort();
//         SequentialSearch.returnedArray.clear();
         int[] a = new int[algoritm.getArray().length];
               for (int i = 0; i < algoritm.getArray().length; i++) {
                   a[i]=Integer.parseInt( algoritm.getArray()[i]);
               }
               bubble.inputs(a);
           
               
        
    }

    private static void InsertionSortAlgorithm(AlgorithmArray algoritm) {
        
        InsertionSort insertion =new InsertionSort();
           int[] a = new int[algoritm.getArray().length];
               for (int i = 0; i < algoritm.getArray().length; i++) {
                   a[i]=Integer.parseInt( algoritm.getArray()[i]);
               }
        insertion.inputs(a);
        
        
    }
    
     static void BinarySearchAlgorithm( AlgorithmArray algoritm)
    {
          int[] a = new int[algoritm.getArray().length];
                 for (int i = 0; i < algoritm.getArray().length; i++) {
                   a[i]=Integer.parseInt( algoritm.getArray()[i]);
               }
               int target =Integer.parseInt(algoritm.getArray()[algoritm.getArray().length-1]);
               BinarySearch b =new BinarySearch();
               int size =algoritm.getArray().length-1;
                 b.inputs(target,size,a);

    }

    private static void countSortAlgorithm(AlgorithmArray algoritm) {
       CountSort count =new CountSort();
           int[] a = new int[algoritm.getArray().length];
               for (int i = 0; i < algoritm.getArray().length; i++) {
                   a[i]=Integer.parseInt( algoritm.getArray()[i]);
               }
        count.inputs(a);
    }


  
    public Seerver() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMainChat = new javax.swing.JTextArea();
        btnClose1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(900, 200, 0, 0));
        setMinimumSize(new java.awt.Dimension(750, 540));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setBackground(new java.awt.Color(5, 40, 100));
        btnClose.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("Close The Connection");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 220, 40));

        txtMainChat.setColumns(20);
        txtMainChat.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        txtMainChat.setForeground(new java.awt.Color(255, 0, 0));
        txtMainChat.setLineWrap(true);
        txtMainChat.setRows(5);
        txtMainChat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMainChatKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtMainChat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 710, 460));

        btnClose1.setBackground(new java.awt.Color(5, 40, 100));
        btnClose1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnClose1.setForeground(new java.awt.Color(255, 255, 255));
        btnClose1.setText("Clear Chat");
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 130, 40));

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 40, 100));
        jLabel1.setText("Server on Port 1201");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 280, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        
        try
        {
        sckt.close();   
        ssckt.close();  
        dtinpt.close(); 
        dtotpt.close();
        }
        catch(Exception e)
        {
        txtMainChat.setText(txtMainChat.getText()+"\n"+e.getMessage());
        }
        
        
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
txtMainChat.setText("");
    }//GEN-LAST:event_btnClose1ActionPerformed

    private void txtMainChatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMainChatKeyTyped

        
        evt.consume();
    }//GEN-LAST:event_txtMainChatKeyTyped

static ServerSocket ssckt;  
 static Socket sckt;  
 public static DataInputStream dtinpt;  
 public static DataOutputStream dtotpt;  
 
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
            java.util.logging.Logger.getLogger(Seerver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seerver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seerver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seerver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seerver().setVisible(true);
            }
        });
        
        String msgin = "";  
  try {  
   ssckt = new ServerSocket(1201);  
   sckt = ssckt.accept();  
   dtinpt = new DataInputStream(sckt.getInputStream());  
   dtotpt = new DataOutputStream(sckt.getOutputStream());  
   
   while (!msgin.equals("exit")) {  
    msgin = dtinpt.readUTF();  
    
    txtMainChat.setText(txtMainChat.getText()+"\n"+"Client :"+msgin);
       AlgorithmArray algoritm = getAlgoritm(msgin);
       
       
       
       //بتحدد الكلاس اللي هتستخدمه عشان تبعتله المصفوفه بناءا علي اسم الالجورزم
       switch(algoritm.getAlgoritm())
       {
           
           case "Binary Search":
             
        BinarySearchAlgorithm(algoritm);

        
               break;
               case "Merge Sort":
                    MergeSortAlgorithm(algoritm);
               break;
               case "Selection Sort":
                    SelectionSortAlgorithm(algoritm);
               break;
               case "Sequential Search":
                     SequentialSearchAlgorithm(algoritm);
                   System.err.println("SEEEE");
                  
               break;
               case "Bubble Sort":
                    BubbleSortAlgorithm(algoritm);
               break;
               case "Insertion Sort":
                    InsertionSortAlgorithm(algoritm);
               break;
               case "Count Sort":
                       countSortAlgorithm(algoritm);
               break; 
               
               case  "none":
                   break;
                   
               
       
       }


       
    
   }  
  } catch (Exception e) {
  txtMainChat.setText(txtMainChat.getText()+"\n"+e.getMessage());
  }  
    
    }
    
    
    //بتجيب الالجوريزم اللي انت اخترته من شاشة التانيه
    //بتجيب المصفوفه
    //بتجيب الرقم اللي عاوز تبحث عنه اللي هو بيبقي اخر رقم في المصفوفه اللي جايه من الشاشه التانيه
    static AlgorithmArray getAlgoritm(String statement)
    {
        AlgorithmArray a ;
        String[] arr ;
        String algorithm;
        if (statement.contains("Binary Search")) {
            algorithm ="Binary Search";
           String msg =statement.replace("Binary Search", "").trim();
           arr=msg.split(",");
//           Arrays.sort(arr);
           a=new AlgorithmArray(algorithm, arr);
           return a;
           
        }
            if (statement.contains("Merge Sort")) {
                algorithm ="Merge Sort";
            String msg =statement.replace("Merge Sort", "").trim();
           arr=msg.split(",");
           a=new AlgorithmArray(algorithm, arr);
           return a;
        }
                if (statement.contains("Selection Sort")) {
                    algorithm="Selection Sort";
            String msg =statement.replace("Selection Sort", "").trim();
           arr=msg.split(",");
           a=new AlgorithmArray(algorithm, arr);
           return a;
        }
                    if (statement.contains("Sequential Search")) {
                    algorithm="Sequential Search";
            String msg =statement.replace("Sequential Search", "").trim();
           arr=msg.split(",");
           a=new AlgorithmArray(algorithm, arr);
           return a;
        }
                        if (statement.contains("Bubble Sort")) {
                    algorithm="Bubble Sort";
            String msg =statement.replace("Bubble Sort", "").trim();
           arr=msg.split(",");
           a=new AlgorithmArray(algorithm, arr);
           return a;
        }
                            if (statement.contains("Insertion Sort")) {
                    algorithm="Insertion Sort";
            String msg =statement.replace("Insertion Sort", "").trim();
           arr=msg.split(",");
           a=new AlgorithmArray(algorithm, arr);
           return a;
        }
                                                if (statement.contains("Count Sort")) {
                    algorithm="Count Sort";
            String msg =statement.replace("Count Sort", "").trim();
           arr=msg.split(",");
           a=new AlgorithmArray(algorithm, arr);
           return a;
        }
                return new AlgorithmArray("none", new String[]{"s"});
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnClose;
    private static javax.swing.JButton btnClose1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea txtMainChat;
    // End of variables declaration//GEN-END:variables
}

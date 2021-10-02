/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketappwinform.Algorithms;
import java.util.Scanner;
import socketappwinform.Model.Inputs;
import socketappwinform.WinForms.Seerver;
import static socketappwinform.WinForms.Seerver.dtotpt;
import socketappwinform.Model.Inputs;

//import static sortmultithreading.BinarySearch.scanner;

/**
 *
 * @author abdel
 */
public class InsertionSort implements Runnable,Inputs{
   static Scanner scanner = new Scanner(System.in);
    
    public static int firstPart,lastPart,array[];
    private static String threadName;
    static int start,end;

    public InsertionSort() {
    }

    public InsertionSort(int firstPart, int lastpart,String threadName,int start1 ,int end1) {
        this.firstPart = firstPart;
        
        this.threadName = threadName;
        this.lastPart=lastpart;
        start=start1;
        end=end1;
        this.run();

    }
    
    
  


   public static void insertionSort(int array[],int number,String thread) {  
        int n =number;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }

    }  
   void printArray(int sortedArray[])
  {
      
    
      for (int i = start; i < end; i++) {
          String stat= sortedArray[i]+" ";
          
          try{
           dtotpt.writeUTF(stat);  
    Seerver.txtMainChat.setText(Seerver.txtMainChat.getText() + stat);  
  } catch (Exception e) {}
            
        
       
          
          
      }
       try{

    
  } catch (Exception e) {}
      
     
      
  }
 

    @Override
    public void run() {
     
            int n =lastPart;  
        for (int j = firstPart; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }
        String stat= "this array part sorted by "+threadName;
        try{
           dtotpt.writeUTF("Server: "+stat);  
  
  } catch (Exception e) {}
         try{

    
  } catch (Exception e) {}
        
            
        
        
        
        
        printArray(array);

        
    }

    @Override
    public void inputs(int[] a) {
         array=a;
        InsertionSort sort = new InsertionSort(0,array.length/2,"thread A ",0,array.length/2);
        
     InsertionSort sort2 = new InsertionSort(array.length/2,array.length,"thread B ",array.length/2,array.length);
    }

    @Override
    public void inputs(int target, int size, int[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
  
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketappwinform.Algorithms;

import java.util.Arrays;
import static socketappwinform.Algorithms.InsertionSort.array;
import static socketappwinform.Algorithms.InsertionSort.start;
import socketappwinform.Model.Inputs;
import socketappwinform.WinForms.Seerver;
import static socketappwinform.WinForms.Seerver.dtotpt;

/**
 *
 * @author Abd elrahman
 */
public class CountSort implements Runnable,Inputs {
   public static int firstPart,lastPart,array[];
    private static String threadName;
    static int start,end;

      public CountSort(int firstPart, int lastpart,String threadName,int start1 ,int end1) {
        this.firstPart = firstPart;
        
        this.threadName = threadName;
        this.lastPart=lastpart;
        start=start1;
        end=end1;
        Thread th =new Thread(this);
        th.run();

    }
    
    
      static void countSort(int[] arr)
    {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
 
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
 
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
 
 
    static void printArray(int[] arr)
    {
        
      for (int i = start; i < end; i++) {
      String stat= arr[i]+" ";
          
          try{
           dtotpt.writeUTF(stat);  
    Seerver.txtMainChat.setText(Seerver.txtMainChat.getText() + stat);  
  } catch (Exception e) {}
            
        
    }
    }
    
 


    
    
    @Override
    public void run() {
        countSort(array);
        
         String stat= "this array part sorted by "+threadName;
         
         
        try{
           dtotpt.writeUTF("Server: "+stat);  
           printArray(array);
  
  } catch (Exception e) {}
         try{

    
  } catch (Exception e) {}
        
            
        
        
        
        
        
    }

    public CountSort() {
    }

    @Override
    public void inputs(int[] a) {
            array =a ;
        CountSort sort = new CountSort(0,array.length/2,"thread A ",0,array.length/2);
        
     CountSort sort2 = new CountSort(array.length/2,array.length,"thread B ",array.length/2,array.length);
    }

    @Override
    public void inputs(int target, int size, int[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}

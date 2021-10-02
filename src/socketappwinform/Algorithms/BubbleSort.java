
package socketappwinform.Algorithms;

import socketappwinform.Model.Inputs;
import static socketappwinform.WinForms.Seerver.dtotpt;

public class BubbleSort implements Runnable,Inputs {
   private static int arr[],arr1 [] , arr2[];
    public static int firstPart,lastPart,array[];
    private static String threadName;
    
    int start ,end;


    public BubbleSort(int firstPart, int lastpart,String threadName,int start,int end){

        this.firstPart = firstPart;
        this.threadName = threadName;
        this.lastPart=lastpart;
        this.start=start;
        this.end=end;
                
        
        this.run();


    }
    @Override
    public void run(){

                bubbleSort(arr,threadName);

    }
      void printArray(int[] arr){

        for(int i=start; i < end; i++){
            String stat= arr[i] + " ";
           
            try {  

   dtotpt.writeUTF(stat+" ");  
 
  } catch (Exception e) {}
            
        }
        try{
 
    
  } catch (Exception e) {}
       
       

    }
     void bubbleSort(int[] arr , String thread) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        String stat ="Server: this array part sorted by "+thread+"  ";

        try {  
   
   
   dtotpt.writeUTF(stat);  
  
  } catch (Exception e) {}  
        printArray(arr);

    }

    public BubbleSort() {
    }




    @Override
    public void inputs(int[] a) {
         arr = a;
        new BubbleSort(0,arr.length/2,"Thread A ",0,arr.length/2);
        new BubbleSort((arr.length/2),arr.length-1,"Thread B ",arr.length/2,arr.length);

    }

    @Override
    public void inputs(int target, int size, int[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    }


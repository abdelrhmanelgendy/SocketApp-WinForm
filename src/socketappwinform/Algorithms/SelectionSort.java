
package socketappwinform.Algorithms;

import static socketappwinform.WinForms.Seerver.dtotpt;
import static socketappwinform.Algorithms.SequentialSearch.returnedArray;
import socketappwinform.Model.Inputs;

public class SelectionSort implements Runnable,Inputs {
    private  int startIndex, endIndex;
    private static int   mList [];

    private String threadName;

    @Override
    public void run(){

selectionsort();


    }

    public SelectionSort(int startIndex, int endIndex, String threadName) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.threadName = threadName;
        run();
    }
    

        private static void printArray(int[] array,int start,int end){
         
            for (int i = start; i < end; i++) {
                String stat=array[i]+" ";
                    try{
              dtotpt.writeUTF(stat);  
   
  }
            catch (Exception e) {} 

            }
            
               try{

     
  }
            catch (Exception e) {} 
            

         
        }
    private  void swap(int[] array,int left,int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
        private   void  selectionsort(){
        int min;
        for(int i=startIndex; i<endIndex;i++){
            min = i;
            for(int j =min; j<mList.length;j++){
                if(mList[j] <mList[min]){
                    min = j;
                }
            }
            if( min !=i){
                swap(mList,i,min);
            }
        }
             String stat= "Server: this Part of Array Is sorted by thread "+threadName;
                 try{
              dtotpt.writeUTF(stat);  
 
  }
            catch (Exception e) {} 
                    

                try{

   
  }
            catch (Exception e) {} 
            printArray(mList, startIndex, endIndex);
            
                
               
    }
 

    public SelectionSort() {
    }

    @Override
    public void inputs(int[] a) {
       mList=a;
        int size =mList.length;
        new SelectionSort(0,size/2,"Thread A ");
        new SelectionSort(size/2,size,"Thread B ");
    }

    @Override
    public void inputs(int target, int size, int[] a) {
       
    }
        



}




package socketappwinform.Algorithms;

import java.util.ArrayList;
import java.util.Scanner;
import socketappwinform.Model.Inputs;
import socketappwinform.WinForms.Seerver;
import static socketappwinform.WinForms.Seerver.dtotpt;

public class SequentialSearch implements Runnable,Inputs {
    private int startIndex, endIndex;
    private  static int  nElements, key , myArray[];
    private boolean flag;
    private String threadName;
    public static Scanner scanner = new Scanner(System.in);
    public static String returnedArray;

    public String getReturnedArray() {
        return returnedArray;
    }

    public SequentialSearch(int startIndex, int endIndex, String threadName) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.threadName = threadName;
        Thread thread = new Thread(this);
        thread.start();
    }

    public SequentialSearch() {
    }
    


    
    


        @Override
    public void run() {


            for (int i = startIndex; i <=endIndex ; i++) {
                if(key==myArray[i]){
                     
                    returnedArray=("Server: Search is successful by "+threadName+" and the number "+key+" found in Index "+i+"\n");
                    flag = true;
                      try{

            Seerver.dtotpt.writeUTF(returnedArray);  
  }
            catch (Exception e) {} 
                    
                    return;
                }
            }
            returnedArray=("Server: Search is not successful by "+threadName+" Number "+key+" Not Found"+"\n");
            try{
              dtotpt.writeUTF(returnedArray);  

  }
            catch (Exception e) {} 


    }

    @Override
    public void inputs(int[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inputs(int target, int size, int[] a) {
        
         this.nElements = size;
        this.key = target;
        this.myArray = a;
         new SequentialSearch(0,(nElements/2)-1,"Thread A");
        new SequentialSearch(nElements/2,nElements-1,"Thread B");
    }


}

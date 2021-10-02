/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketappwinform.Algorithms;

import socketappwinform.Model.Inputs;
import socketappwinform.WinForms.Seerver;






public class BinarySearch implements Runnable,Inputs{

 
   private int startIndex, endIndex;
	private static int nElements, Target, mList [];
	static String returned ;
	private String threadName;

 

    public BinarySearch() {
    }
        
        public BinarySearch(int startIndex, int endIndex, String threadName)
        {
            
            this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.threadName = threadName;
		Thread thread = new Thread(this);
		thread.start();
        }
    
 
    @Override
   public void run() {


 int leftSide=startIndex;
 
        int rightSide=endIndex;
        for(int i = startIndex; i<=endIndex; i++) {
        while (leftSide<=rightSide) {            
            
            int middle=(leftSide+rightSide)/2;
            if (Target<mList[middle]) 
            {
            rightSide=middle-1;    
            }
            else if (Target>mList[middle])
            {
           leftSide=middle+1;     
            }
            else if (Target==mList[middle])
            {
 
                returned=("Server: " +Target +" has been found in index "+middle+" by "+threadName);
                   try {  
   
  
  Seerver.dtotpt.writeUTF(returned);  

  } catch (Exception e) {
  
  
  }  
                
 return ;
 
  

               
            }
          
            
            
        }
            
        
            returned=("Server: "+Target +" has not found by "+threadName);
            try{
            Seerver.dtotpt.writeUTF(returned);  
 
  } catch (Exception e) {}  
            return ;
        }
    
    
}

    @Override
    public void inputs(int[] a) {
      
    }

    @Override
    public void inputs(int target, int size, int[] a) {
        nElements=size;
            Target=target;
            mList=a;
             
        new BinarySearch(0,nElements/2, "Thread A");
        new BinarySearch(nElements/2, nElements-1, "Thread B");
            
    }
}

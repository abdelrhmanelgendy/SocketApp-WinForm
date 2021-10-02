import java.util.Scanner;


public class BB implements Runnable{

   static Scanner scanner=new Scanner(System.in); 
   private int startIndex, endIndex;
	private static int nElements, Target, mList [];
	
	private String threadName;
        
        public BB(int startIndex, int endIndex, String threadName)
        {
            
            this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.threadName = threadName;
		Thread thread = new Thread(this);
		thread.start();
        }
     public static void inputs(int target,int element,int[] arr)
        {
        
        Target=target;
        nElements=element;
        mList=arr;
        new BB(0,nElements/2, "Thread 1");
        new BB(nElements/2, nElements-1, "Thread 2");
        }

//    public static int BinarySearch(int [] mList,int Target,int startIndex,int endIndex,String Thread)
//    {
//        int leftSide=startIndex;
//        int rightSide=endIndex-1;
//        for(int i = startIndex; i<=endIndex; i++) {
//        while (leftSide<=rightSide) {            
//            
//            int middle=(startIndex+endIndex)/2;
//            if (Target<mList[middle]) 
//            {
//            rightSide=middle-1;    
//            }
//            else if (Target>mList[middle])
//            {
//           leftSide=middle+1;     
//            }
//            else 
//            {
//                
//                return middle;
//            }
//            
//        }
//        }
//        return -1;
//        
//        
//        
//    }

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
                System.out.println(Target +" has been found in index "+middle+" by "+threadName );
                return;

               
            }
          
            
            
        }
            System.out.println(Target +" has not found by "+threadName);
            
            return ;
        }
    
    
}
}
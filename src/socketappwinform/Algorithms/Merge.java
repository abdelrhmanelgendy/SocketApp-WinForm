package socketappwinform.Algorithms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abd elrahman
 */
import java.util.Random;
import java.util.Scanner;
import socketappwinform.Model.Inputs;
import static socketappwinform.WinForms.Seerver.dtotpt;

public class Merge implements Runnable,Inputs {




    
    public static int arr [];
    public static int start ;
    public static int end ;
 	public  static 	Scanner scanner= new Scanner(System.in);

        
        
    
    public String threadName;

    public Merge() {
    }

    public Merge(int[] arr, int start, int end,String threadName) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.threadName=threadName;
    }
    
    


	void merge(int arr[], int l, int m, int r)
	{
		
		int n1 = m - l + 1;
		int n2 = r - m;

		
		int L[] = new int[n1];
		int R[] = new int[n2];

		
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		

		
		int i = 0, j = 0;

		
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	
	void sort(int arr[], int l, int r)
	{
		if (l < r) {
			
			int m = (l + r) / 2;

			
			sort(arr, l, m);
			sort(arr, m + 1, r);

			
			merge(arr, l, m, r);
		}
	}

	
	static void printArray(int arr[],int a ,int b)
	{
		

		for (int i = a; i < b; ++i)
                {    

                        
try {  
   
   String m=arr[i] + " ";
   dtotpt.writeUTF(m);  

  } catch (Exception e) {}  
        
                }
                try {  
 

  } catch (Exception e) {} 

	}
        



    @Override
    public void run() {

sort(arr, start,end-1)  ;


try {  
   String msgout = "Server: this array part is sorted by "+threadName;  
   
   dtotpt.writeUTF(msgout);  

  } catch (Exception e) {}  
        
 
        printArray(arr, start, end);


    }

    @Override
    public void inputs(int[] a) {
          arr=a;
 
        int length = arr.length;
                new Merge(arr, 0, length/2,"Thread A").run();

                  new Merge(arr,length/2, length,"Thread B").run();
    }

    @Override
    public void inputs(int target, int size, int[] a) {
        
    }
 
}


    
    
    




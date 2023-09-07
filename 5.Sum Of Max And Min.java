/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    int MAX = Integer.MIN_VALUE;
	    int MIN = Integer.MAX_VALUE;
	    
	    for(int i=0;i<n;i++){
	        if(arr[i]<MIN)
	            MIN = arr[i];
	       if(arr[i]>MAX)
	            MAX = arr[i];
	    }
	    
	    System.out.println(MAX+MIN);
	}
}

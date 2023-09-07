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
	    int t=n;
	    int size=0;
	    
	    if(n<0){System.out.println("FALSE");}
	    else{
    	    while(n!=0){
    	        n = n/10;
    	        size++;
    	    }
    	    
    	    
    	    
    	    if(t == (t*t)%(int)Math.pow(10, count)){
    	        System.out.println("TRUE");
    	    }else{
    	        System.out.println("FALSE");
    	    }
	    }
	}
}

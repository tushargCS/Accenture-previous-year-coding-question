/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	        int sum=0;
	        int arr[] = new int[]{10,-12,2,5,3,15,17,21,-3,-4};
	        for(int i=0;i<arr.length;i++){
	            if(isprime(i)){
	                sum+=arr[i];   
	            }
	        }
	        System.out.println(sum);
	}
	
	public static boolean isprime(int n){
	   int flag=0;
	   for(int i=2;i<=Math.sqrt(n);i++){
	       if(n%i==0){
	           flag=1;
	           break;
	       }
	   }
	   
	   if(flag==1){
	       return false;
	   }else{
	       return true;
	   }
	}
}

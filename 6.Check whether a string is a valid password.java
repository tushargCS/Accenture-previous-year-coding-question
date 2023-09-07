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
	    String s = sc.nextLine();
	    int n = s.length();
	    int length = n>=4?1:0;
	    int numeric=0;
	    int Capital=0;
	    int space_slace=0;
	    int start_char=0;
	    for(int i=0;i<n;i++){
	        if(s.charAt(i)==' ' || s.charAt(i)=='/'){
	            space_slace=1;
	            break;
	        }else if(i==0 && Character.isDigit(s.charAt(i))){
	            start_char=1;
	            break;
	        }
	        else if(Character.isDigit(s.charAt(i))){
	            numeric=1;
	        }else if(Character.isUpperCase(s.charAt(i))){
	            Capital=1;
	        }
	    }
	    
	    if(length==1 && numeric==1 && Capital==1 && space_slace==0 && start_char==0){
	        System.out.println("YES");
	    }else{
	        System.out.println("NO");
	    }
	    
	}
}

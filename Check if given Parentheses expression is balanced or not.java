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
	    char c[] = s.toCharArray();
	    Stack<Character>stack = new Stack<>();
	    int i=0;
	    while(i<c.length){
	        if(c[i]=='('){
	            stack.add('(');
	        }else if(c[i]==')'){
	            stack.pop();
	        }
	        i++;
	    }
	    
	    if(stack.size()==0){
	        System.out.println("0");
	    }else{
	        System.out.println("1");
	    }
	}
}

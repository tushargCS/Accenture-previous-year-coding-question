/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String str=””;
    int count=0;
    for(int i=0;i<s.length();i++){
    char c=s.charAt(i);
    if(c == 'A' || c == 'E' || c == 'I' || c == '0' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
    continue;
    }
    str+=c;
    }
    System.out.print(str);
    }
      
}

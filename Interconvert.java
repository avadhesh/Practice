/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Collectors;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		String inputStr = s.nextLine();
		Codechef obj = new Codechef();
		System.out.println(obj.convertStringToInt(inputStr));
	    System.out.println(obj.convertIntToString(Integer.parseInt(inputStr)));
		
	}
	public int convertStringToInt(String input){
	    int result = 0;
	    int isNegative = input.charAt(0)=='-'?-1:1 ;
	    int index = isNegative==-1 ? 1 : 0;
	    while(index < input.length())
	    {
	        result = result*10 + input.charAt(index)-'0';
	        index++;
	    }
	    return result*isNegative;
	}
	
	public String convertIntToString(int input)
	{
	    StringBuilder sb = new StringBuilder();
	    boolean isNegative = input < 0;
	    if(isNegative)
	       input = -1*input; 
	    while(input>0)
	    {
	        sb.append(input%10);
	        input = input/10;
	    }
	    if(isNegative)
	    {
	        sb.append("-");
	    }
	    return sb.reverse().toString();
	}

}

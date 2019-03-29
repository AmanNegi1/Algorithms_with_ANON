package Recursion;
import java.util.*;
public class StringToInt {

	public static int helper(String str) {
		if(str.length()==1) {
			int t=str.charAt(0)-'0';
			return t;
		}
		
		int p=str.charAt(0)-'0';
		
		int r=helper(str.substring(1));
        int c=p*(int)Math.pow(10,str.length()-1)+r;
        return c;
	}
	public static void main(String args[]) {
		String s="1234";
		int t=helper(s);
		System.out.print(t);
	}
}

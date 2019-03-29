package Recursion;

public class print_keypad {
 
public static String helper(int n) {
		
		if(n==2) {
		 	String c="abc";
		 return c;
		}else if(n==3) {
			String c="def";
			 return c;
		}else if(n==4) {
			String c="ghi";
			 return c;
		}else {
			String c="jkl";
			 return c;
		}
		
	}//end of helper
	public static void print_keypad(int n,String output) {
		if(n==0) {
			System.out.println(output);
			return ;
		}
		String l=helper(n%10);
		print_keypad(n/10,l.substring(0, 1)+output);
		print_keypad(n/10,l.substring(1, 2)+output);
		print_keypad(n/10,l.substring(2, 3)+output);
		
	}
	public static void print_keypad(int n) {
//		if(n==0) {
//			System.out.println(" ");
//			return ;
//		}
//		print_keypad(n/10);
		
		print_keypad(n,"");
	}
	public static void main(String []args) {
		int n=23;
		print_keypad(n);
	}
}

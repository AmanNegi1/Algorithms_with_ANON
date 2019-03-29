package Recursion;

public class remove_X {
 
	public static String remove_x(String s,String output) {
		if(s.length()<=1) {
			if(s.charAt(0)!='x') {
			output=output+s.charAt(0);
			}
			return output;
		}
		if(s.charAt(0)!='x') {
			output=output+s.charAt(0);
		}
		String st=remove_x(s.substring(1),output);
	    return st;
	}
	public static void main(String args[]) {
		String  str="xxa";
		String s=remove_x(str,"");
		System.out.println(s);
	}
}

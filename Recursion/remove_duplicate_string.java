package Recursion;

public class remove_duplicate_string {
 
	public static String remove_duplicates(String s) {
		if(s.length()<=1) {
			return s;
		}
		String ans="";
		if(s.charAt(0)!=s.charAt(1)) {
			ans=ans+s.charAt(0);
		}
		
		String sm=remove_duplicates(s.substring(1));
		return ans+sm;
	}
	public static void main(String args[]) {
		String s="aabcddeee";
		String ss= remove_duplicates(s);
	    System.out.println(ss);
	}
}

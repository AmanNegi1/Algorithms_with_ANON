package Recursion;

public class replace_by_given_char {
	public static String replace_char(String s,char n,char r) {
		if(s.length()==0) {
			return s ;
		}
		String ans="";
		if(s.charAt(0)==n) {
			ans=ans+r;
		}else {
			ans=ans+s.charAt(0);
		}
		String sm=replace_char(s.substring(1),n,r);
	    return ans+sm;
	}
public static void main(String args[]) {
	String str="abacd";
	char x='a';
	char r='x';
	String s=replace_char(str,x,r);
	System.out.println(s);
}
}

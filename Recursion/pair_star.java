package Recursion;

public class pair_star {
     
	public static String make_star_pair(String str) {
		if(str.length()<=1) {
			return str;
		}
		String output="";
		if(str.charAt(0)==str.charAt(1)) {
        output=output+str.charAt(0)	+"*"+make_star_pair(str.substring(1));		
		}else {
		output=str.charAt(0)+	make_star_pair(str.substring(1));
		}
		return output;
	}
	public static void main(String []args) {
		String st="aaaa";
		String s=make_star_pair(st);
		System.out.println(s);
	}
}

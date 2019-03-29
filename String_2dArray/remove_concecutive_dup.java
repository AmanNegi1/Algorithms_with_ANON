package String_2dArray;

public class remove_concecutive_dup {
	public static String removeConsecutiveDuplicates(String input) {
	  String str="";
	  for(int i=0;i<input.length();i++) {
		  if(input.charAt(i)==str.charAt(str.length()-1)) {
			  
		  }else {
			  str=str+input.charAt(i);
		  }
	  }
	  return str;
	}
	public static void main(String []args) {
		String str="aabbbcdd";
		String str1=removeConsecutiveDuplicates(str);
		System.out.println(str1);
	}
}

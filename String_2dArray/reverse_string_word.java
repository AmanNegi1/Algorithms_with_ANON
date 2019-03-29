package String_2dArray;

public class reverse_string_word {
	public static String reverseEachWord(String input) {
		int t=0;
		String input1="";
		char s=' ';
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' '||i+1==input.length()) {
				if(i+1==input.length()) {
					for(int p=i ; p>=t;p--) {
						input1=input1+input.charAt(p);
						}	
				}else {
					for(int p=i-1 ; p>=t;p--) {
						input1=input1+input.charAt(p);
					}
				}
				
				t=i;
				input1=input1+" ";
			}else {
				
			}
		}
		return input1;
	}
	public static void main(String []args) {
		String str="Hello graphic era here is aman negi";
		String str1=reverseEachWord(str);
		System.out.println(str1);
	}
}

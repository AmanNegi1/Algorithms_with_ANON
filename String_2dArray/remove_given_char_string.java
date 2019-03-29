package String_2dArray;

public class remove_given_char_string {
	public static String removeAllOccurrencesOfChar(String input, char c) {
       String str="";
       for(int i=0;i<input.length();i++) {
    	   if(input.charAt(i)==c) {
    		   
    	   }else {
    		   str=str+input.charAt(i);
    	   }
       }
       return str;
	}
	public static void main(String []args) {
		String str="Hello graphic era here is aman negi";
		char ch='e';
		String str1=removeAllOccurrencesOfChar(str,ch);
		System.out.println(str1);
	}
}

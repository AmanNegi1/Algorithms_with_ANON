package Recursion;

public class String_Add {

	public static void main(String args[]) {
		String a="abc";
	
		
		 int t=a.length();
		 int i=0;
		 for(int j = 0; j<=a.length(); j++){
			 String s = a.substring(0,j) + 'a' + a.substring(j);
			 System.out.println(s);
  			 }
		
	}
}

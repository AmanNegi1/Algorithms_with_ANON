package Recursion;

public class checkAb {

	public static boolean check_Ab(String input) {
		if(input.length()<=1){
			if(input.charAt(0)=='a')
	          return true;
			else {
				return false;
			}
	        }
//		    if(input.charAt(0)=='a'&& input.charAt(1)=='a') {
//		    	check_Ab(input.substring(1));
//		    }
	        if(input.charAt(0)=='a' && input.charAt(1)=='b') {
	        	if(input.length()>=3)
	        	check_Ab(input.substring(input.length()-3));
	        	else {
	        		check_Ab(input.substring(1));
	        	}
	         }
	         else {
	        	return false;}
   return true;
	}
	public static void main(String []args) {
		String str="abbaba";
		boolean t=check_Ab(str);
		System.out.println(t);
	}
}

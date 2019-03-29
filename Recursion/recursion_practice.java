package Recursion;

public class recursion_practice {
    public static String check_str(String input) {
        if(input.length()==0||input.length()==1){
        	// System.out.println(input);
        	return input;
          } 
          String out="";
          
          String temp=check_str(input.substring(1));
         // System.out.println(temp);
          return temp;
    }
	public static void main(String args[]) {
	 String str="xpiy";
	 String s=check_str(str);
	System.out.println(s);
   
	}
	
}

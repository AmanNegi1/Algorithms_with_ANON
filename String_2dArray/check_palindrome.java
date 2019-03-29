package String_2dArray;

public class check_palindrome {
	public static boolean checkPalindrome(String str){
		int s=0;
        boolean t=false;
        int e=str.length()-1;
        while(s<=e){
          if(str.charAt(s)==str.charAt(e)){
            t=true;
            s++;
            e--;
        //    continue;
          }else{
            t=false;
            return t;
          }
        }
      return t;
      
	}
	public static void main(String []args) {
		String st="oppo";
		Boolean t=checkPalindrome(st);
       System.out.print(t);
	}
}

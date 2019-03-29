package Stack;

public class check_redundent_braket {

	public static boolean checkclosing(String str){
	       int i=0;
	      while(str.length()>i){
	        if(str.charAt(i)==')' && str.charAt(i+1)==')'){
	      
	          return true;
	        }
	        i++;
	      }//end of while
	      return false;
	    }
	public static boolean checkBraket(String input) {
		 int i=0;
	
	        while(i<input.length()){
	        if(input.charAt(i)=='('&& input.charAt(i+1)=='('){
	        	//System.out.println("yes");
	             boolean b=checkclosing(input.substring(i+1));
	             return b;
	        }else{
	          i++;
	        }}
	        return false;
	}
	public static void main(String[] args) {
 		// TODO Auto-generated method stub
     String s="((a+n))";
     boolean p=checkBraket(s);
     System.out.print(p);
	}

}

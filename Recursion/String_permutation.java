package Recursion;

public class String_permutation {

	public static String[] permutate(String input) {
		if(input.length()==0){
			String s[]= {""};
            return s;
          }
		
          String a[]=permutate(input.substring(1));
          String s[]= new String[a.length+1];
         // if(input.length()>=2) {
          for(int j = 0; j<input.length(); j++){
        	  
			  s[j] = input.substring(0,j) + input.charAt(j) + input.substring(j);
			 // System.out.println(s[j]); 
            }
     //    }
                   
      return s;
	}
	public static void main(String args[]) {
		String s="abc";
		String sp[]=permutate(s);
		for(int i=0;i<sp.length;i++) {
			System.out.println(sp[i]);
		}
	}
}

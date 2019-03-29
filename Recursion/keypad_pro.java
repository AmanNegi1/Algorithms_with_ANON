package Recursion;

public class keypad_pro {

	public static char[] helper(int n) {
		
		if(n==2) {
		 	char c[]={'a','b','c'};
		 return c;
		}else if(n==3) {
			char c[]={'d','e','f'};
			 return c;
		}else if(n==4) {
			char c[]={'g','h','i'};
			 return c;
		}else {
			char c[]={'x'};
			 return c;
		}
		
	}
	public static String [] keypad(int x) {
		if(x==0) {
			String s[]= {""};
			return s ;
		}
	    String ss[]=keypad(x/10);
       char r[]=helper(x%10);
	    String o_p[]= new String[ss.length*r.length];
	    for(int i=0;i<ss.length;i++) {
	    	o_p[i]=ss[i];
	    }
	   
	    for(int i=0;i<o_p.length;i++) {
	    	for(int j=0;j<r.length;j++) {
	    		o_p[j+ss.length]=""+o_p[i+ss.length]+r[j];
	    	}
	    }
   return o_p;
	}
	public static void main(String args[]) {
		int n=234;
		String a[]=keypad(n);
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
	}
}

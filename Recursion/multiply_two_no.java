package Recursion;

public class multiply_two_no {
	public static int multiply2(int x,int y,int s){
	      if(x==0){
	        return s;
	      }
	      s=s+y;
	     int ans= multiply2(x-1,y,s);
	       return ans;
	    }//end of multiply2 function..
	
	public static void multiply_easy(int x,int y) {
		if(y==0) {
			return ;
		}
		int ans=x*multiply_easy(x,y-1);
		System.out.println(ans+x);
	}
		public static int multiplyTwoIntegers(int m, int n){
		  	int s=0;
	      int r=multiply2(m,n,s);
	   multiply_easy(m,n);
	     // System.out.println("Multiply_Easy "+rr);
		  return r;
		}
		public static void main(String []args) {
			int a=5,b=5;
			int r=multiplyTwoIntegers(a,b);
	   System.out.println(r);
		}
}

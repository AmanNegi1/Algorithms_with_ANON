package java_prctice;
import java.util.*;
public class feb_series {
   public static boolean febb(int n) {
	   int a=0,b=1,c;
	   for(int i=1;i<n;i++) {
		   c=a+b;
		   if(c==n) {
			   return true;
		   }
		   a=b;
		   b=c;
	   }
	   
	   return false;
   }
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int x=s.nextInt();
     
     boolean f=febb(x);
	 System.out.println(f);
	}

}

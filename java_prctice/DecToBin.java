package java_prctice;
import java.util.*;
public class DecToBin {
   public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 int x=scan.nextInt();
	 int k=0;
	 long n=0;
	 while(x!=0) {
		 int rem=x%2;
		 n=n+rem*(long)Math.pow(10,k);
	     x=x/2;
	     k++;
	 }//end of while loop...
	 System.out.println(n);
	}

}

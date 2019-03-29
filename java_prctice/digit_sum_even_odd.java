package java_prctice;
import java.util.*;
public class digit_sum_even_odd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int even=0,odd=0;
		while(x!=0) {
			 int r=x%10;
			 if(r%2==0) {
				 even=even+r;
			 }else {
				 odd=odd+r;
			 }
			 x=x/10;
		}//end of while loop/////
	   System.out.println(even);
	   System.out.println(odd);
	}

}

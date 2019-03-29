package Recursion;
import java.util.*;
public class increasing_order {
	public static int print(int n){
		if(n == 1){
			System.out.print(n + " ");
			return 1;
		}
		
		 print(n - 1);
        System.out.print(n+" ");
       
      return 0;
    }	
//Scanner scan=new Scanner(System.in);
   public static void main(String []args) {
	   int n=9;
	   print(n);
   }
	

}

package java_prctice;
import java.util.*;
public class SquareRoot {

	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int x=scan.nextInt();
       for(int i=1;i*i<=x;i++) {
    	   if((i+1)*(i+1)>x) {
    		   
    		   System.out.println(i*i);
    	      break;
    	   }
       }
	}

}

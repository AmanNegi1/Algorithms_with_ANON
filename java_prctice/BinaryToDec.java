
package java_prctice;
import java.util.*;
public class BinaryToDec {
    
	public static void main(String[] args) {
      //Binary to decimal conversion...     
	  Scanner scan=new Scanner(System.in);
      int i=0;
      int s=0;
	  int b=scan.nextInt();
	  int length = (int)(Math.log10(b)+1);
	  System.out.println(length);
      while(b!=0) {
    	  int n=b%10;
    
    	  if(n==1) {
    		  while(i<=length) {
    		  s=s+(int)Math.pow(2,i);
    		  b=b/10;
    		
    		  i++;
    		  break;
    		  }//end of while loop
    		  
    	  }else {
    		//  System.out.print(" i = "+i);
    		  i++;
    		  
    		  b=b/10;
    	  }//end of else..
      }//end of 1 while llooop...
      System.out.println(s);
	}

}

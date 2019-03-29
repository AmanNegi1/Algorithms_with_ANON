package java_prctice;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
      int x=scan.nextInt();
       for(int i=2;i<=x;i++){
    	   int c=0;
         for(int j=2;j<=i;j++){
           if(i%j==0){
             c++;
             
           }
           
         }
         if(c==1) {
        	 System.out.println(i);
         }
       }
       
		
	}

}

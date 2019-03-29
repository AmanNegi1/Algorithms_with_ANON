package java_prctice;
import java.util.*;
public class sum_choice_product {

	public static void main(String[] args) {
	     Scanner s=new Scanner(System.in);
	     int n =s.nextInt();
	      int sum=0;
	      System.out.println("1:only sum");
	      System.out.println("2:product");
		 int z=s.nextInt();
	      if(z==1){
	        for(int i=1;i<=n;i++){
	          sum=sum+i;
	        }
	        System.out.println(sum);
	      }else if(z==2){
	        int f=1;
	        for(int i=1;i<=n;i++){
	         f=f*i;
	        }
	        System.out.println(f);
	      }else{
	        System.out.println(-1);
	      }

	    }

}

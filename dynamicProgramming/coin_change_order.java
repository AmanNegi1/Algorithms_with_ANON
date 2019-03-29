package dynamicProgramming;

import java.util.Scanner;

public class coin_change_order {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the denomination size");
     int n=s.nextInt();
     int d[]=new int[n];
     System.out.println("Enter the number to be change ");
     int coin_for_change=s.nextInt();
     System.out.println("Enter the denomination Array");
     for(int i=0;i<d.length;i++) {
    	 d[i]=s.nextInt();
     }
     int r=coin_change(d,coin_for_change,d.length); 	
	 System.out.println(r);
	}

	private static int coin_change(int[] d, int coin_for_change,int n) {
	  if(n==0) {
		  return 1;
	  }
	  if(coin_for_change==0) {
		  return 0;
	  }
	  if(n<0) {
		  return 0;
	  }
	  int first_Ans=coin_change(d,coin_for_change-d[0],n);
	  int sec_ans=coin_change(d+1,coin_for_change,n-1);
	  return first_Ans+sec_ans;
	}

}

package practive2;

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i=1,j,k,l=1;
      while(i<=n){
        k=1;
        while(k<=n-i){
          System.out.print(" ");
          k++;
        }//end of while space..
         j=1;
        while(j<=l){
          System.out.print("*");
          j++;
          
        }//end of printed value..
        l=l+2;
       i++;
       System.out.println();
      }

		
	}

}


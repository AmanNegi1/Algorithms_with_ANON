package java_prctice;
import java.util.*;
public class threeNplus2 {
/*
 * Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
N varies from 1 to 1000.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
     int c;
     for(int i=1;i<=n;i++) {
    	 int p=3*i+2;
    	 if(p%4!=0) {
    	 System.out.print(p+" ");
    	 }else {
    		n++;
    	 }
     }
	}

}

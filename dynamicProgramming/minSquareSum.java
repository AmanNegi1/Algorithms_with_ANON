package dynamicProgramming;
import java.util.*;
public class minSquareSum {
//  1*1  2*2 3*3
	public static int Square(int n) {
		if(n<=3) {
			return n;
		}
		int res=n;
		for(int x=1;x<=n;x++) {
			int temp=x*x;
			if(temp>n) {
				break;
			}else {
				res=Math.min(res, 1+Square(n-temp));
			}
		
		}
		return res;
	}
	public static int squareM(int n) {
		int store[]=new int[n+1];
		store[1]=1;
		store[2]=2;
		store[3]=3;
		if(store[n]!=0) {
		 return store[n];	
		}
		int res=n;
		for(int x=1;x<=n;x++) {
			int temp=x*x;
			if(temp>n) {
				break;
			}else {
				store[res]=Math.min(res, 1+Square(n-temp));
			}
		
		}
		return store[res];
	}
	public static void main(String args[]) {
		int n=14;
		int t=Square(n);
		System.out.println("Minimum Square: "+t);
		int t1=Square(14);
		//System.out.println(t1);
	}
}

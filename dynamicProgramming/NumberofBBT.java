package dynamicProgramming;
import java.util.*;
public class NumberofBBT {

	
	public static int balancedBBT(int h) {
		int mod=(int)Math.pow(10,9)+7;
		return balancedBBT(h,mod);
	}
	public static int balancedBBT(int h,int mod) {
		if(h==1||h==0) {
			return 1;
		}
		int x=balancedBBT(h-1);
		int y=balancedBBT(h-2);
		long res1=(long)x*x;
		long res2=(long)2*x*y;
		int val1=(int)(res1%mod);
		int val2=(int)(res2%mod);
	    return (val1+val2)%mod;
	}
	public static void main(String args[]) {
		
		int h=3;
		int t=balancedBBT(h);
		System.out.println(t);
	}
}

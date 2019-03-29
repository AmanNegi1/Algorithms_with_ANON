package dynamicProgramming;
import java.util.*;
public class fibnaci {

	public static int fibDp(int n) {
		int storage[]=new int[n+1];
		storage[0]=0;
		storage[1]=1;
		for(int i=2;i<=n;i++) {
			storage[i]=storage[i-1]+storage[i-2];
		}
		return storage[n];
		
		
	}
	public static int  fibseries(int n) {
		if(n==0||n==1) {
			return n;
		}
		return fibseries(n-1)+fibseries(n-2);
	}
	public static int fib(int n,int storage[]) {
		if(n==0|| n==1) {
			storage[n]=n;
			return storage[n];
		}
		if(storage[n]!=-1) {
			return storage[n];
		}
		storage[n]= fib(n-1,storage)+fib(n-2,storage);
	    return storage[n];
	}
	public static int fib(int n) {
		int storage[]=new int[n+1];
		for(int i=0;i<storage.length;i++) {
			storage[i]=-1;
		}
		return fib(n,storage);
	}
	public static void main(String args[]) {
		//System.out.println(fibseries(5));
		System.out.println(fib(4));
        System.out.println(fibDp(5));
	}
}

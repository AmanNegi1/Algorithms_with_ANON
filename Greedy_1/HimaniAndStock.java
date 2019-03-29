package Greedy_1;
import java.util.*;
public class HimaniAndStock {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int mod=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		int x[]=new int[n];
		x[0]=0;
		for(int i=0;i<n;i++) {
			x[i]=i;
		}
		int c[]=new int[n];
		for(int i=1;i<n;i++) {
		x[i]=((x[i-1]%mod)*(a+b))%(int)Math.pow(2, 32);
		c[i]=(x[i]/(int)Math.pow(2, 8));
		}
		for(int i=0;i<n;i++) {
			System.out.println(x[i]+" "+c[i]);
		}
	}

}

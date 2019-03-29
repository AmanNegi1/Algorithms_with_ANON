package BackTracking;
import java.util.*;
public class SeiveOfErathosthensePrime {

	public static int makeSieve(int n) {
		boolean isPrime[]=new boolean[n+1];
		for(int i=2;i<=n;i++) {
			isPrime[i]=true;
		}
		isPrime[0]=false;
		isPrime[1]=false;
		for(int i=2;i*i<=n;i++) {
			if(isPrime[i]) {
				for(int j=i*i;j<=n;j+=i) {
					isPrime[j]=false;
				}
			}
		}//end of for loop../
		int count=0;
		for(int i=0;i<isPrime.length;i++) {
			if(isPrime[i]) {
				count++;
			}
		}
		return count;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int isPrime=makeSieve(n);
		System.out.println(isPrime);
	}
}

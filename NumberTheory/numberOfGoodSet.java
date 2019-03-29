package NumberTheory;

import java.util.Arrays;

public class numberOfGoodSet {
	public static void main(String args[]) {
		int arr[]= {2,3};
		Arrays.sort(arr);
		int sieve[]=new int[arr[arr.length-1]+1];
		for(int i=0;i<arr.length;i++) {
			sieve[arr[i]]++;
			
		}
		int mod=(int)Math.pow(10, 9)+7;
		for(int i=0;i<arr.length;i++) {
			if(sieve[i]>0) {
				for(int j=2*i;j<sieve.length;j+=i) {
					
					if(sieve[j]>0)
					sieve[j]=(sieve[j]%mod+sieve[i]%mod);
				   }
			}
		}
		int c=0;
		for(int i=0;i<sieve.length;i++) {
			if(sieve[i]!=0) {
				c=(c%mod+sieve[i]%mod)%mod;
			}
		}
		System.out.println(c);
	}
}

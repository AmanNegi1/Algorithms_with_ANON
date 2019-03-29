package NumberTheory;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class boringFactorialCode{
	 boolean checkPrime(long n) 
    { 
        // Converting long to BigInteger 
        BigInteger b = new BigInteger(String.valueOf(n)); 
        
        return b.isProbablePrime(1); 
    } 
	long boringFact(int p,int n) {
	    long i=n+1;
		long t=-1;
		
		while(i<=p-1) {
			if(checkPrime(p)) {
			t=((t%p)*((long)Math.pow(i, p-2)%p))%p;
			}else {
				return p;
			}
          i++;
		}
		t=t+p;
  		t=t%p;
		return t;
	}
}
public class boringFactorial{
	public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	int tC=sc.nextInt();
    	while(tC--!=0) {
    		int number=sc.nextInt();
    		int primeNum=sc.nextInt();
    		boringFactorialCode obj=new boringFactorialCode();
    		System.out.println(obj.boringFact(primeNum,number));
    	    
    	}
}
}

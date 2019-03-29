package NumberTheory;
import java.util.*;
public class semiPrimes {

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int test[]=new int[t];
		for(int i=0;i<test.length;i++) {
			test[i]=s.nextInt();
		}
		int i=0;
		String str[]=findSemiPrime(test);
		for(int ii=0;ii<str.length;ii++) {
			System.out.println(str[ii]);
		}
	}

	private static String[] findSemiPrime(int[] test) {
		String s[]=new String[test.length];
		int j=0;
		for(int i=0;i<test.length;i++) {
			if(test[i]==9||test[i]==1) {
				s[j]="No";
				j++;
				continue;
			}
			if(test[i]%2==0) {
				int t=test[i]/2;
				if(checkprime(t)) {
					s[j]="No";
					
					j++;
				}else {
					s[j]="Yes";
					j++;
				}
			}else if(checkprime(test[i])) {
				s[j]="No";
			    j++;
			}else {
				s[j]="Yes";
				j++;
			}
		}//end of for loop..
		return s;
	}

	private static boolean checkprime(int t) {
		boolean isPrime[]=new boolean [t+1];
		for(int i=0;i<=t;i++){
			isPrime[i] = true;
		}
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i=2;i*i<=t;i++){
			if(isPrime[i] == true){
				for(int j=i*i;j<=t;j+=i){
					isPrime[j] = false;
				}
			}
		}
       
		return isPrime[t];
	}
}

package NumberTheory;
import FastScanner.FastReader;;
public class EuclidMeth2 {

	public static void gcd(int a,int b) {
		if(b==0 ||a==b) {
			System.out.println(a);
			return;
		}
		
		int r=a%b;
		int q=a/b;
		while(a==q*b+r) {
			if(a<b) {
				int temp=a;
				a=b;
				b=temp;
			}
			if( r<b) {
			if(r==0) {
				System.out.println(b);
				break;
			}
			int t=a;
			a=b;
			b=r;
			r=a%b;
			q=a/b;
		}
		}
	}
	
	public static void main(String args[]) {
		FastReader fr=new FastReader();
		int a=fr.nextInt();
		int b=fr.nextInt();
		gcd(a,b);
	}
}

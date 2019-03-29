package NumberTheory;
import java.util.Scanner;
public class GCDEuclid {

	public static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
	  int ans= gcd(b,a%b);
	  return ans;
	}
	public static void main(String[] args) {
       Scanner s=new Scanner (System.in);
       int p=3;
       String sp="dfdfd";
    //   int d=sp[i]
       char q=(char) (p+'a');
       //int a=s.nextInt();
       //int b=s.nextInt();
       //int ans=gcd(a,b);
       //System.out.print(a*b/gcd(a,b));
	   //System.out.println(ans);
       System.out.println(gcd(13,16));
	}

}

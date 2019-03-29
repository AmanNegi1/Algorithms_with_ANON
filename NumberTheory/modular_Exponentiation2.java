package NumberTheory;
import java.util.*;
public class modular_Exponentiation2 {
	public static int modRecursive(int a,int b,int c) {
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return modRecursive((a*a)%c,b/2,c);
		}else {
			return ((a%c)*modRecursive((a*a)%c,b/2,c))%c;
		}
	}
			public static void main(String args[]) {
				Scanner s=new Scanner(System.in);
				int a=s.nextInt();
				int b=s.nextInt();
				int c=s.nextInt();
				int t=modRecursive(a,b,c);
				System.out.println(t);
			}
}

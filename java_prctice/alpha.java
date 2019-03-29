package java_prctice;
import java.util.*;
public class alpha {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
      char p='A';
      for(int i=1;i<=x;i++){
        for(int j=1;j<=i;j++){
          System.out.print(p);
        }
        p++;
        System.out.println();
      }
	}

}

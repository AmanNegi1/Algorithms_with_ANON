package java_prctice;
import java.util.*;
public class pattern3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		
		for(int i=x-1;i>=0;i--) {
			for(int j=1;j<=i;j++) {
              System.out.print(j);
            }
          System.out.println();
        }
}
}

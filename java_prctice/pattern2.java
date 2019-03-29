package java_prctice;
import java.util.*;
public class pattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		System.out.println(1);
		for(int i=1;i<x;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
				int p=i-1;
				
				for(int k=j;k<=p;k++) {
					System.out.print("0");
				}
				System.out.print(i);
				break;
			}
			
			System.out.println();
		}
		
	}

}

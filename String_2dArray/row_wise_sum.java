package String_2dArray;
import java.util.*;
public class row_wise_sum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int arr[][]=new int[n1][n2];
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		
		int sum=0;
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				sum=sum+arr[i][j];
			}
		System.out.print(" "+sum);
		sum=0;
		}
		
	}
}

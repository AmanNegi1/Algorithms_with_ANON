package Fenwick_Binary_index_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfQuery {
	public static void update(int BIT[],int idx,int value,int n) {
		for( ; idx<=n ; idx+=idx & (-idx) ) {
			BIT[idx]+=value;
		}
	}
	public static int Query(int BIT[],int idx) {
		int sum=0;
		for(;idx>0 ; idx-=idx & (-idx)) {
			sum+=BIT[idx];
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   int n=Integer.parseInt(br.readLine());
	   int arr[]=new int[n+1];
	   int BIT[]=new int[n+1];
	   for(int i=1;i<=n;i++) {
		   arr[i]=Integer.parseInt(br.readLine());
		   update(BIT,i,arr[i],n);
	   }
	   System.out.println("Sum of "+Query(BIT,3));
	   System.out.println("Sum of "+Query(BIT,4)+Query(BIT,0));
	   
	}

}

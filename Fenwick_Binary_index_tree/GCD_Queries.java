package Fenwick_Binary_index_tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GCD_Queries {

	public static void UPDATE(int bit[],int idx,int value,int size) {
		for(;idx<=size;idx+= idx &(-idx)) {
			
		}
	}
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String st=br.readLine();
		int arr[]=new int[n+1];
		int bit[]=new int[n+1];
		for(int i=1;i<n;i++) {
			bit[i]=1;
		}
		for(int i=1;i<=n;i++) {
			arr[i]=Integer.parseInt(st);
			
			UPDATE(bit,i,arr[i],n);
		}
		
		
	}

}

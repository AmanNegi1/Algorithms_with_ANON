package Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class Horrible_Queries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    Arrays.fill(arr, 0);
	    int tree[]=new int[n*2];
	    int Lazy[]=new int[n*2];
	    buildTree(arr,tree,0,n-1,1);
	   
	    int queries=s.nextInt();
	    while(queries--!=0) {
	    	int ch=s.nextInt();
	    	switch(ch) {
	    	case 0:
	    		int left=s.nextInt();
	    		int right=s.nextInt();
	    		int value=s.nextInt();
	    		update(arr,tree,Lazy,0,n-1,1,left-1,right-1,value);
	    		for(int i=1;i<2*n;i++) {
	    	    	System.out.print(tree[i]+" ");
	    	    }
	    		System.out.println();
	    		for(int i=1;i<2*n;i++) {
	    	    	System.out.print(Lazy[i]+" ");
	    	    }
	    		break;
	    	case 1:
	    		int rangeL=s.nextInt();
	    		int rangeR=s.nextInt();
	    		int r=Query(arr,tree,Lazy,0,n-1,1,rangeL-1,rangeR-1);
	    		System.out.println(r);
	    		break;
	    	}
	    }
	    
	}
	public static int Query(int arr[],int tree[],int lazy[],int start,int end,int tn,int left,int right) {
		
		if(start>right || end<left) {
			if(lazy[tn]!=0) {
				tree[tn]=tree[tn]+lazy[tn];
				lazy[tn]=0;
			}
			return 0;
		}
		if(start>=left && end<=right) {
		if(lazy[tn]!=0) {
			tree[tn]= tree[tn]+lazy[tn];
			lazy[tn]=0;
			return tree[tn];
		}else {
			return tree[tn];
		}
		}
		int mid=(start+end)/2;
		int ans1=Query(arr,tree,lazy,start,mid,tn*2,left,right);
		int ans2=Query(arr,tree,lazy,mid+1,end,tn*2+1,left,right);
		return ans1+ans2;
	}
	public static void update(int arr[],int tree[],int lazy[],int start,int end,int tn,int left,int right,int incVal) {
		if(start>end)return;
		if(lazy[tn]!=0) {
			tree[tn]+=lazy[tn];
			if(start!=end) {
				lazy[tn*2]+=lazy[tn];
				lazy[tn*2+1]+=lazy[tn];
			}
			lazy[tn]=0;
		}
		if(start>right || end<left) {
			return;
		}
		if(start>=left && end <=right) {
			tree[tn]+=incVal;
			if(start!=end) {
				lazy[tn*2]+=incVal;
				lazy[tn*2+1]+=incVal;
			}
			return;
		}
		int mid=(start+end)/2;
		update(arr,tree,lazy,start,mid,tn*2,left,right,incVal);
		update(arr,tree,lazy,mid+1,end,tn*2+1,left,right,incVal);
		tree[tn]=tree[tn*2]+tree[tn*2+1];
		return;
	}
	
	public static void buildTree(int arr[],int tree[],int start,int end,int tn) {
		if(start==end) {
			tree[tn]=arr[start];
			return;
		}
		int mid=(start+end)/2;
		buildTree(arr,tree,start,mid,tn*2);
		buildTree(arr,tree,mid+1,end,tn*2+1);
		tree[tn]=tree[tn*2]+tree[tn*2+1];
		return;
	}

}

package Segment_Tree;

import java.util.Scanner;

public class RangeMinimumQuery {
	public static void buildTree(int arr[],int  tree[],int start,int end,int treeNode) {
		if(start==end) {
			tree[treeNode]=arr[start];
			return;
		}
		int mid=(start+end)/2;
		buildTree(arr,tree,start,mid,treeNode*2);
		buildTree(arr,tree,mid+1,end,treeNode*2+1);
		tree[treeNode]=Integer.min(tree[treeNode*2], tree[treeNode*2+1]);
	}
	
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int num_query=s.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<arr.length;i++) {
    	 arr[i]=s.nextInt();
     }
     int idx=0,value=0,left=0,right=0;
     int tree[]=new int [2*n];
     
     buildTree(arr,tree,0,n-1,1);
     for(int i=1;i<tree.length;i++) {
    	 System.out.print(tree[i]+" ");
     }
     System.out.println();
    while(num_query--!=0) {
    	 char c=s.next().charAt(0);
    	 switch(c) {
    	 case 'q':
    		 left=s.nextInt();
    		 right=s.nextInt();
    		 int min=min_query(arr,tree,0,n-1,1,left,right);
    		 System.out.println(min);
    		 break;
    	 case 'u':
    		 idx=s.nextInt();
    		 value=s.nextInt();
    		 update_query(arr,tree,0,n-1,1,idx,value);
    		 break;
    	 }
     }
    for(int i=1;i<tree.length;i++) {
   	 System.out.print(tree[i]+" ");
    }
	}//end of main
    public static int min_query(int arr[],int tree[],int start,int end,int treeNode,int left,int right) {
    	
    	if(start>right || end<left) {
    		return 0;
    	}
    	if(start>=left && end<=right) {
    		return tree[treeNode];
    	}
    	int mid=(start+end)/2;
    	int ans1=min_query(arr,tree,start,mid,treeNode*2,left,right);
    	int ans2=min_query(arr,tree,mid+1,end,treeNode*2+1,left,right);
    	return Integer.min(ans1, ans2);
    }
    public static void update_query(int arr[],int tree[],int start,int end,int treeNode ,int index,int value) {
    	if(start==end) {
    		arr[index]=value;
    		tree[treeNode]=value;
    		return;
    	}
    	int mid=(start+end)/2;
    	if(index>mid) {
    		update_query(arr,tree,mid+1,end,treeNode*2+1,index,value);
    	}else {
    		update_query(arr,tree,start,mid,treeNode*2,index,value);
    	}
        tree[treeNode]=Integer.min(tree[treeNode*2], tree[treeNode*2+1]);
        return;
    }
}

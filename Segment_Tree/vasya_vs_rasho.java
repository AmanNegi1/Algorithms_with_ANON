package Segment_Tree;

import java.util.Scanner;
class TreeClass{
	int index;
	int value;
	public TreeClass(int index,int value) {
		this.index=index;
		this.value=value;
		
	}
}
public class vasya_vs_rasho {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int A[]=new int[n];
	   int B[]=new int[n];
	   for(int i=0;i<n;i++) {
		  A[i]=sc.nextInt();
		 
	   }
	   for(int i=0;i<n;i++) {
			
			  B[i]=sc.nextInt();
		   }
	   TreeClass tree[]=new TreeClass[2*n];
	   buildTree(A,B,tree,0,n-1,1);
	   for(int i=1;i<tree.length;i++) {
		   System.out.println(tree[i].index+" "+tree[i].value);
	   }
	   int worrierOftheday=sc.nextInt();
	
	   while(worrierOftheday--!=0) {
       int left=sc.nextInt();
       int right=sc.nextInt();
       TreeClass r=Query(tree,0,n-1,1,left,right);
       System.out.println(r.index);
	   }
	}
	public static TreeClass Query(TreeClass tree[],int start,int end,int treeNode,int left ,int right) {
		if(start>right || end<left) {
			return new TreeClass(Integer.MIN_VALUE,Integer.MIN_VALUE);
		}
		if(start>=left && end<=right) {
			return tree[treeNode];
		}
		int mid=(start+end)/2;
		TreeClass ans1=Query(tree,start,mid,treeNode*2,left,right);
		TreeClass ans2=Query(tree,mid+1,end,treeNode*2+1,left,right);
		if(ans1.value > ans2.value) {
			return ans1;
		}else if (ans1.value == ans2.value){
		  return  new TreeClass((int )Math.max(ans1.index,ans2.index),ans1.value);
		}else {
			return ans2;
		}
	}
	public static void buildTree(int arr[],int brr[],TreeClass tree[],int start,int end,int treeNode) {
		if(start==end) {
		TreeClass tcc=new TreeClass(start,arr[start]);	
		tree[treeNode]=tcc;
		return;
		}
		int mid=(start+end)/2;
		buildTree(arr,brr,tree,start,mid,treeNode*2);
		buildTree(arr,brr,tree,mid+1,end,treeNode*2+1);
		TreeClass tc;
		if(tree[treeNode*2].value >tree[treeNode*2+1].value) {
			tc=new TreeClass(tree[treeNode*2].index,tree[treeNode*2].value);
		}else if (tree[treeNode*2].value ==tree[treeNode*2+1].value){
			tc=new TreeClass((int )Math.max(tree[treeNode*2].index,tree[treeNode*2+1].index),tree[treeNode*2].value);
		} else{
			tc=new TreeClass(tree[treeNode*2+1].index,tree[treeNode*2+1].value);
		}
		tree[treeNode]=tc;
		return;
		
	}

}

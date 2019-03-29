package Segment_Tree;

import java.util.Scanner;

class subArrayNode{
	int maxSum;
	int sum;
	int bestPrefixSum;
	int bestSuffixSum;
	public subArrayNode(int maxSum,int sum,int bps,int bss) {
		this.maxSum=maxSum;
		this.sum=sum;
		this.bestPrefixSum=bps;
		this.bestSuffixSum=bss;
	}
}
public class maximum_sumSubarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		subArrayNode[] tree=new subArrayNode[2*n];
		buildTree(arr,tree,0,n-1,1);
		for(int i=1;i<2*n;i++) {
			System.out.println(tree[i].maxSum+"  "+ tree[i].sum+" "+tree[i].bestPrefixSum +" "+tree[i].bestSuffixSum+" ");
		}
		int numQueries=sc.nextInt();
		while(numQueries--!=0) {
			 int left=sc.nextInt();
			 int right=sc.nextInt();
			 subArrayNode nd=Query(tree,0,n-1,1,left,right);
			 int max=(int )Math.max((int)Math.max(nd.bestPrefixSum, nd.bestSuffixSum),(int )Math.max(nd.maxSum,nd.sum));
			 System.out.println(max);
		}
		
	}
	public static subArrayNode Query(subArrayNode tree[], int start,int end, int treeNode,int left,int right) {
	
		if(start>right|| end <left) {
		subArrayNode nn=new subArrayNode(0,0,0,0);
		return nn;
		}
		if(start>=left && end<=right) {
			return tree[treeNode];
		}
		int mid=(start+end)/2;
		subArrayNode nd1=Query(tree,start,mid,treeNode*2,left,right);
		subArrayNode nd2=Query(tree,mid+1,end,treeNode*2+1,left,right);
		int max=(int )Math.max(nd1.maxSum, nd2.maxSum);
		int sum=(int) Math.max(nd1.sum, nd2.sum);
		int bps=(int) Math.max(nd1.bestPrefixSum, nd2.bestPrefixSum);
		int bss=(int )Math.max(nd1.bestSuffixSum, nd2.bestSuffixSum);
		subArrayNode nd=new subArrayNode(max,sum,bps,bss);
		//tree[treeNode]=nd;
		return nd;
		
	}
	public static void buildTree(int arr[],subArrayNode[] tree,int start,int end,int treeNode) {
		if(start==end) {
			
			subArrayNode node=new subArrayNode(arr[start],arr[end],0,0);
			tree[treeNode]=node;
			return;
		}
		int mid=(start+end)/2;
		buildTree(arr,tree,start,mid,treeNode*2);
		buildTree(arr,tree,mid+1,end,treeNode*2+1);
		int maxSum=(int)Math.max(tree[treeNode*2].maxSum, tree[treeNode*2+1].maxSum);
		int sum=tree[treeNode*2].sum+tree[treeNode*2+1].sum;
		int bps=(int )Math.max(tree[treeNode*2].bestPrefixSum,tree[treeNode*2].sum+tree[treeNode*2+1].bestPrefixSum);
	    int bss=(int )Math.max(tree[treeNode*2+1].bestSuffixSum,tree[treeNode*2+1].sum+tree[treeNode*2].bestSuffixSum);
	    subArrayNode newNode=new subArrayNode(maxSum,sum,bps,bss);
	    tree[treeNode]=newNode;
	    return;
	}

}

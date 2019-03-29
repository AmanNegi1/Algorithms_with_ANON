package Segment_Tree;

import java.util.Scanner;
class Node{
	 int left;
	 int right;
	public Node(int l,int r) {
		left=l;
		right=r;
	}
}
public class Even_or_Odd{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Node tree[]=new Node[2*n];
		
		buildTree(arr,tree,0,n-1,1);
	
		int testQueries=sc.nextInt();
		while(testQueries--!=0) {
			switch(sc.nextInt()) {
			case 0:
				int index=sc.nextInt();
				int value=sc.nextInt();
				update(arr,tree,0,n-1,1,index,value);
				break;
			case 1:
				int left=sc.nextInt();
				int right=sc.nextInt();
				Node EvenCount=query(tree,1,0,n-1,left,right);
				System.out.println(EvenCount.right);
					break;
			case 2:
				int leftA=sc.nextInt();
				int rightB=sc.nextInt();
				Node oddCount=query(tree,1,0,n-1,leftA,rightB);
				System.out.println(oddCount.left);
				break;
			}
		}
	}
	public static Node query(Node tree[], int treeNode,int start,int end,int left,int right) {
		if(start>right||end<left) {
			Node n=new Node(0,0);
			return n;
		}
		if(start>=left && end<=right) {
			return tree[treeNode];
		}
		int mid=(start+end)/2;
		Node n1=query(tree,treeNode*2,start,mid,left,right);
		Node n2=query(tree,treeNode*2+1,mid+1,end,left,right);
		int l=n1.left+n2.left;
		int r=n1.right+n2.right;
		Node n3=new Node(l,r);
		return n3;
	}
	public static void update(int arr[],Node tree[],int start,int end,int treeNode,int idx,int value) {
		if(start==end) {
			arr[idx]=value;
			if(value%2==0) {
				Node n1=new Node(0,1) ;
				tree[treeNode]=n1;	
			}else {
				Node n1=new Node(1,0) ;
				tree[treeNode]=n1;	
			}
			return;
		}
		int mid=(start+end)/2;
		if(mid<idx) {
			update(arr,tree,mid+1,end,treeNode*2+1,idx,value);
		}else {
			update(arr,tree,start,mid,treeNode*2,idx,value);
		}
		Node node=new Node(tree[treeNode*2].left+tree[treeNode*2+1].left,tree[treeNode*2].right+tree[treeNode*2+1].right);
		tree[treeNode]=node;
		return;
	}
	public static void buildTree(int arr[],Node tree[],int start,int end,int treeNode) {
		if(start==end) {
			
			if(arr[start]%2==0) {
				Node node1=new Node(0,1);
				tree[treeNode]=node1;
			}else {
				Node node2=new Node(1,0);
				tree[treeNode]=node2;			
			}
			return;
		}
		int mid=(start+end)/2;
		buildTree(arr,tree,start,mid,treeNode*2);
		buildTree(arr,tree,mid+1,end,treeNode*2+1);
		Node node=new Node(tree[treeNode*2].left+tree[treeNode*2+1].left,tree[treeNode*2].right+tree[treeNode*2+1].right);
		tree[treeNode]=node;
		return;
	}

}

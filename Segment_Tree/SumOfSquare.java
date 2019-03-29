package Segment_Tree;

import java.util.Scanner;
class LazyTree{
	int value;
	int type;
	public LazyTree(int val,int type){
		this.value=val;
		this.type=type;
	}
}
class  NodeCreation{
	int  sum;
	int square_sum;
	public NodeCreation(int sum,int ss) {
		this.sum=sum;
		this.square_sum=ss;
	}
}
public class SumOfSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int arr[]=new int[n];
	    NodeCreation tree[]=new NodeCreation[2*n];
	    LazyTree lazy[]=new LazyTree[2*n];
	    for(int i=0;i<n;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    buildTree(arr,tree,0,n-1,1);
	}
   public static NodeCreation setUpdate(int arr[],NodeCreation tree[],LazyTree lazy[],int start,int end,int tn,int left,int right,int setVal) {
	   if(start>end) {
		   return null;
	   }
	   if(lazy[tn]!=null && lazy[tn].type==2) {
		   tree[tn].sum+=lazy[tn].value;
		   tree[tn].square_sum+=lazy[tn].value*lazy[tn].value;
		   if(start!=end) {
			   lazy[tn*2].value+=lazy[tn].value;
			   lazy[tn*2+1].value+=lazy[tn].value;
			  }
		   lazy[tn]=null;
	   }
	   if(start>=left && end<=right) {
		    arr[start]=setVal;
			tree[tn].square_sum+=setVal*setVal*(end-start+1);
			tree[tn].sum+=setVal*(end-start+1);
			if(start!=end) {
				lazy[tn*2].value+=setVal;
				lazy[tn*2+1].value+=setVal;
				}
			return tree[tn];
		}
		int mid=(start+end)/2;
		NodeCreation node1=setUpdate(arr,tree,lazy,start,mid,tn,left,right,setVal);
		NodeCreation node2=setUpdate(arr,tree,lazy,mid+1,end,tn,left,right,setVal);
		tree[tn].square_sum+=setVal*setVal*(end-start+1);
		tree[tn].sum+=setVal*(end-start+1);
		return tree[tn];
   }
   public static void incUpdate(int arr[],NodeCreation tree[],LazyTree lazy[],int start,int end,int tn,int left,int right,int incVal) {
	if(start>end) {
		return;
	}
	if(lazy[tn]!=null &&  lazy[tn].type==1) {
		tree[tn].sum+=lazy[tn].value;
		tree[tn].square_sum+=lazy[tn].value;
        if(start!=end) {
        	lazy[tn*2].value+=lazy[tn].value;
        	lazy[tn*2+1].value+=lazy[tn].value;
        }
        lazy[tn]=null;
	}
	if(start>right || end<left) {
		return;
	}
	if(start>=left && end<=right) {
		tree[tn].square_sum+=incVal*incVal;
		tree[tn].sum+=incVal*(end-start+1);
		if(start!=end) {
			lazy[tn*2].value+=incVal;
			lazy[tn*2+1].value+=incVal;
		}
		return;
	}
	int mid=(start+end)/2;
	incUpdate(arr,tree,lazy,start,mid,tn,left,right,incVal);
	incUpdate(arr,tree,lazy,mid+1,end,tn,left,right,incVal);
	tree[tn].square_sum+=incVal*incVal*(end-start+1)+2*incVal*tree[tn].sum;
	tree[tn].sum+=incVal*(end-start+1);
	return ;
   }
   public static void buildTree(int arr[],NodeCreation tree[],int start,int end, int tn) {
	   if(start==end) {
		   NodeCreation node=new NodeCreation(arr[start],arr[start]*arr[start]);
		   tree[tn]=node;
		   return;
	   }
	   int mid=(start+end)/2;
	   buildTree(arr,tree,start,mid,tn*2);
	   buildTree(arr,tree,mid+1,end,tn*2+1);
	   tree[tn]=new NodeCreation(tree[tn*2].sum+tree[tn*2+1].sum,tree[tn*2].square_sum+tree[tn*2+1].square_sum);
	   return;
	   
   }
}

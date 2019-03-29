package Segment_Tree;

import java.util.Scanner;

public class two_vs_3 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	String st=s.next();
	s.nextLine();
	char[] arr=new char[st.length()];
	arr=st.toCharArray();
	int modArr[]=new int[n+1];
	for(int i=0;i<n;i++) {
		modArr[i]=(int)Math.pow(2, i)%3;
	}
	int tree[]=new int[4*n];
	buildTree(arr,tree,0,n-1,1,modArr);
	int numOfQueries=s.nextInt();
	while(numOfQueries--!=0) {
		switch(s.nextInt()) {
		case 0:
			int left=s.nextInt();
			int right=s.nextInt();
			int val=Query(tree,0,n-1,1,left-1,right-1,modArr);
			System.out.println(val);
			break;
		case 1:
			int index=s.nextInt();
			update(arr,tree,0,n-1,1,index-1,modArr);
			break;
		}
	}
	}
	public static void update(char arr[],int tree[],int start,int end,int treeNode,int idx,int modArr[]){
	      if(start==end){
	        if(arr[start]=='0'){
	          arr[idx]='1';
	          tree[treeNode]='1';
	          return;
	        }else{
	          return;
	        }
	      }
	      int mid=(start+end)/2;
	      if(idx>mid){
	        update(arr,tree,mid+1,end,treeNode*2+1,idx, modArr);
	      }else{
	        update(arr,tree,start,mid,treeNode*2,idx,modArr);
	      }
	      int modulo=(end-mid);
	      tree[treeNode]=(tree[treeNode*2]*modulo)%3+tree[treeNode*2+1];
	      return;
	    }
	public static int Query(int tree[],int start,int end,int treeNode,int left,int right,int modArr[]) {
		if( start>right || end <left){
			return -1;
		}
		if(start>=left && end<=right) {
			return tree[treeNode];
		}
		
		int mid=(start+end)/2;
		int ans1=Query(tree,start,mid,treeNode*2,left,right,modArr);
		int ans2=Query(tree,mid+1,end,treeNode*2+1,left,right,modArr);
		int modulo=modArr[mid+1];
        
		return (ans1+(ans2*modulo))%3;
		
	}
	public static void buildTree(char arr[],int tree[],int start,int end,int treeNode,int []modArr) {
		if(start==end) {
			tree[treeNode]=arr[start];
			return;
		}
		int mid=(start+end)/2;
		buildTree(arr,tree,start,mid,treeNode*2,modArr);
	    buildTree(arr,tree,mid+1,end,treeNode*2+1,modArr);
	    int modulo=modArr[end-mid];
	    tree[treeNode]=(tree[treeNode*2]*modulo)%3+tree[treeNode*2+1];
	    return;
	}

}

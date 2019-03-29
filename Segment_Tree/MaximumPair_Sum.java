package Segment_Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class NodeY{
	int max;
	int secondMax;
	public NodeY(int max,int secondMax) {
		this.max=max;
		this.secondMax=secondMax;
	}
}
public class MaximumPair_Sum {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		NodeY[] tree=new NodeY[3*n]; 
		buildTree(arr,tree,0,n-1,1);
		int numQueries=Integer.parseInt(st.nextToken());
		while(numQueries--!=0) {
			char ch=st.nextToken().charAt(0);
			//br.readLine();
			switch(ch) {
			case 'Q':
				int left=Integer.parseInt(st.nextToken());
				int right=Integer.parseInt(st.nextToken());
				NodeY pairSum=Query(tree,0,n-1,1,left-1,right-1);
				System.out.println(pairSum.max+pairSum.secondMax);
				break;
			case 'U':
				int index=Integer.parseInt(st.nextToken());
				int value=Integer.parseInt(st.nextToken());
				update(arr,tree,0,n-1,1,index-1,value);
				break;
			}
		}//end of while loop../
	}
	 public static NodeY  Query(NodeY[] tree,int start,int end,int treeNode,int left ,int right) {
			if(start>right || end<left) {
				NodeY node=new NodeY(0,0);
				return node;
			}
			if(start>=left && end<=right) {
				return tree[treeNode];
			}
			int mid=(start+end)/2;
			NodeY max1=Query(tree,start,mid,treeNode*2,left,right);
			NodeY max2=Query(tree,mid+1,end,treeNode*2+1,left,right);
	    
			NodeY final_ans =new NodeY(0,0);
	    final_ans.max=Integer.max(max1.max,max2.max);
	    final_ans.secondMax=Integer.min(Integer.max(max1.max,max2.secondMax),Integer.max(max2.max,max1.secondMax));
	    
			return final_ans;
		}
		public static void update(int arr[],NodeY tree[],int start,int end,int treeNode,int idx,int value) {
			if(start==end) {
				arr[idx]=value;
				tree[treeNode]=new NodeY(arr[idx],0);
				return;
			}
			int mid=(start+end)/2;
			if(idx>mid) {
				update(arr,tree,mid+1,end,treeNode*2+1,idx,value);
			}else {
				update(arr,tree,start,mid,treeNode*2,idx,value);
			}
			int max=Integer.max(tree[treeNode*2].max, tree[treeNode*2+1].max);
			int secMax=Integer.min(Integer.max(tree[treeNode*2].max, tree[treeNode*2+1].secondMax),Integer.max(tree[treeNode*2+1].max, tree[treeNode*2].secondMax));
			NodeY node=new NodeY(max,secMax);
	        tree[treeNode]=node;
	        return;
		}
	  
	  public static void buildTree(int arr[],NodeY tree[],int start,int end,int treeNode) {
			if(start ==end) {
				NodeY node1=new NodeY(arr[start],0);
		 	tree[treeNode]=node1;
			return;
			}
			int mid=(start+end)/2;
			buildTree(arr,tree,start,mid,treeNode*2);
			buildTree(arr,tree,mid+1,end,treeNode*2+1);
			int max=Integer.max(tree[treeNode*2].max, tree[treeNode*2+1].max);
			int secMax=Integer.min(Integer.max(tree[treeNode*2].max, tree[treeNode*2+1].secondMax),Integer.max(tree[treeNode*2+1].max, tree[treeNode*2].secondMax));
			NodeY node=new NodeY(max,secMax);
	        tree[treeNode]=node;
	        return;

	}
}

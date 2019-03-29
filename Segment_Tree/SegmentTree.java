package Segment_Tree;

public class SegmentTree{
	    private int tree[];
	    private int arr[];
	  
	    public SegmentTree(int arr[]) {
	      this.arr=arr;
	      tree=new int[arr.length*2];
	     
	    }
	    public void buildTree(int s,int e,int treeNode) {
	    if(s==e) {
	    	tree[treeNode]=arr[s];
	    	return ;
	    }
	    int mid=(s+e)/2;
	    
	    buildTree(s,mid,2*treeNode);
	    
	    buildTree(mid+1,e,2*treeNode+1);
	    tree[treeNode]=tree[treeNode*2]+tree[treeNode*2+1];
	    return ;
	    }

		public static void main(String args[]) {
		int arr[]= {1,2,3,4,5};
		int tree2[]=new int[arr.length*2];
		//SegmentTree obj=new SegmentTree(arr);
		//obj.buildTree(0,arr.length-1,1);	
		
		buildTree2(arr,tree2,0,4,1);//..function
		System.out.println("sum from index "+2+","+4 +" is "+query(tree2,0,4,1,2,4));
		update(arr,tree2,0,4,1,2,10);
		
		for(int i=1;i<tree2.length;i++) {
			System.out.println(tree2[i]);
		}
		
		}
		//functional programming ..//
		public static void  buildTree2(int arr[],int tree[],int start,int end ,int treeNode) {
			if(start==end) {
				tree[treeNode]=arr[start];
				return ;
			}
			int mid=(start+end)/2;
			buildTree2(arr,tree,start,mid,treeNode*2);
			buildTree2(arr,tree,mid+1,end,treeNode*2+1);
			tree[treeNode]=tree[treeNode*2]+tree[treeNode*2+1];
			return ;
		}
		
		public static void update(int arr[],int tree[],int start,int end,int treeNode,int idx,int value) {
			if(start==end) {
				arr[idx]=value;
				tree[treeNode]=value;
				return ;
			}
			int mid=(start+end)/2;
			if(idx>mid) {
				update(arr,tree,mid+1,end,treeNode*2+1,idx,value);
			}else {
				update(arr,tree,start,mid,treeNode*2,idx,value);
			}
			tree[treeNode]=tree[treeNode*2]+tree[treeNode*2+1];
			return;
		}
		public static int query(int tree[],int start,int end,int treeNode,int left,int right) {
			
			//completly outside../
			if(start>right||end<left) {
				return 0;
			}
            //completely inside../
			if(start>=left && end<=right) {
				return tree[treeNode];
			}
			//partially inside or partially outside../
			int mid=(start+end)/2;
			int ans1=query(tree,start,mid,treeNode*2,left,right);
			int ans2=query(tree,mid+1,end,treeNode*2+1,left,right);
			return ans1+ans2;
		}
		
}

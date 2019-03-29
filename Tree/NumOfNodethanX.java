package Tree;
import java.util.*;

import Queue.QueueEmptyException;
import Queue.queueusingLL;
public class NumOfNodethanX {
	public static int treeHeight(treeNode<Integer>root) {
		int h=1;
		for(int i=0;i<root.children.size();i++) {
			int x=treeHeight(root.children.get(i));
			h++;
		}
		return h;
	}
	public static int findNoElemBgrTnX(treeNode<Integer>root,int x) {
		int c=0;
		if(root.data>x) {
			c=1;
		}
		for(int i=0;i<root.children.size();i++) {
			int xp=findNoElemBgrTnX(root.children.get(i),x);
		//	if(root.children.get(i).data>x) {
			c=c+xp;
		//	}
		}
		return c;
	}
	public static void print(treeNode<Integer>root) {
		String s=root.data+":";
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+",";
		}
		System.out.println(s);
        for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	public static int maxSumNode(treeNode<Integer>root) {
		// Write your code here
	      int sum=root.data;
	      int r=root.data;
	      for(int i=0;i<root.children.size();i++){
	        sum+=root.children.get(i).data;
	      }
	      for(int j=0;j<root.children.size();j++){
	        int c=maxSumNode(root.children.get(j));
	        if(c>sum){
	          sum=c;
             return root.children.get(j).data;
	        }
	      }
	      return sum;
		}
	
	public static void printLevelWise(treeNode<Integer>root) {//status : In progress
//		String s=root.data+"";
//		System.out.println(s);
//		String p="";
//		for(int i=0;i<root.children.size();i++) {
//			p="";
//			while(j<)
//				p=p+root.children.get(j).data;
//				
//		
//			System.out.println(p+" ");
		//}
	}
	public static treeNode<Integer>takeInput(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the root data");
		int root=s.nextInt();
		treeNode<Integer>rootnode=new treeNode<Integer>(root);
		queueusingLL<treeNode>pendingNode=new queueusingLL();
		pendingNode.enqueue(rootnode);
		while(!pendingNode.isempty()) {
			try {
				treeNode<Integer>frontnode=pendingNode.dqueue();
			    System.out.println("Enter the number children of "+frontnode.data);
			    int numChild=s.nextInt();
			    for(int i=0;i<numChild;i++) {
			    	System.out.println("Enter the "+(i+1)+" child of "+frontnode.data);
			    	int child=s.nextInt();
			    	treeNode<Integer>childNode=new treeNode<>(child);
			    	frontnode.children.add(childNode);
			    	pendingNode.enqueue(childNode);
			    }
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rootnode;
	}
	public static treeNode<Integer>NodeWithHighSum(treeNode<Integer>root){
		  int sum=root.data;
	       treeNode<Integer> ans=root;
	      for(int i=0;i<root.children.size();i++){
	        sum+=root.children.get(i).data;
	      }
	      for(int j=0;j<root.children.size();j++){
	        treeNode<Integer> xr=NodeWithHighSum(root.children.get(j));
	        int xsum=xr.data;
            for(int k=0;k<xr.children.size();k++) {
	        	xsum+=xr.children.get(k).data;//6
	        }
	        if(sum<xsum) {
	        	 ans=xr;
	        //	 return ans;
	        }
	      }
	      return ans;
	   
	}

	public static int countLeafNode(treeNode<Integer>root) {
		int c=0;
		for(int i=0;i<root.children.size();i++) {
     int p=countLeafNode(root.children.get(i));
		c=p;
		}
		c++;
		return c;
		
	}
	public static treeNode<Integer> secondMax(treeNode<Integer>root) {
		treeNode<Integer>max=root;
		treeNode<Integer>sm=null;
		for(int i=0;i<root.children.size();i++) {
			if(root.children.get(i).data>root.data) {
				max=root.children.get(i);
			}
		}
		for(int i=0;i<root.children.size();i++) {
			treeNode<Integer>sM=secondMax(root.children.get(i));
		}
		return sm;
	}
	public static treeNode<Integer> removeLeafNode(treeNode<Integer>root) {
		if(root == null){
			return null;
		}
		if(root.children.size() == 0){
			return null;
		}
		for(int i=0;i<root.children.size();i++) {
		root = removeLeafNode(root.children.get(i));
	
		}
		return root;
		
	}
	public static void main(String[] args) {
		 treeNode <Integer>root=takeInput();
		 print(root);
	     int x=3;
	    int n= findNoElemBgrTnX(root,x);
	    System.out.println(n+ " numbers are bigger than "+x);
	    int t=treeHeight(root);
	    System.out.println("heigth of the tree is "+t);
	    int p=maxSumNode(root);
	    System.out.println("the sum of a node : "+p);
	    treeNode<Integer> xR=NodeWithHighSum(root);
        System.out.println("highest sum node is : "+xR.data);
	    int s=countLeafNode(root);
	    System.out.println("There are "+s+" leaf nodes is this tree");
	    treeNode<Integer>SM=secondMax(root);
	    System.out.println("romove leaf node");
	    removeLeafNode(root);
	    print(root);
	}

}

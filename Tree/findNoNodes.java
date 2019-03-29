package Tree;
import Queue.QueueEmptyException;
import Queue.queueusingLL;
import java.util.*;
public class findNoNodes <T>{
	public static int findLarger(treeNode<Integer>root) {
		int max=root.data;
		if(root.children.size()<1) {
			return max;
		}
		for(int i=0;i<root.children.size();i++) {
			if(root.children.get(i).data>max) {
				max=root.children.get(i).data;
			}
		}
		for(int i=0;i<root.children.size();i++) {
		int rMax=findLarger(root.children.get(i));
		if(rMax>max) {
			max=rMax;
		}
		}
		return max;
	}
	public static int findsumofNodes(treeNode<Integer>root) {
	     int sum=0;
	    int i=0;
	    sum=root.data;
		for( i=0;i<root.children.size();i++) {
			//root.children.get(i).data;
			
			sum=sum+findsumofNodes(root.children.get(i));
			//sum=sum+root.data;
		}
		//sum=sum+root.children.get(i).data;
		return sum;
		
	}

	public static int findnumberOFNodes(treeNode<Integer>root) {
		int count=1;
		for(int i=0;i<root.children.size();i++) {
			count+=findnumberOFNodes(root.children.get(i));
		}
		return count;
	}
	public static void print(treeNode<Integer>root) {
		if(root==null) {
			return ;
		}
		String s=root.data+" :,";
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
		print(root.children.get(i));
		}
	}
	public static treeNode<Integer>inputlevelwise(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the root node");
		int n=s.nextInt();
	    queueusingLL<treeNode>pendingnode=new queueusingLL<>();
	    treeNode<Integer>rootnodes=new treeNode(n);
	    pendingnode.enqueue(rootnodes);
	    while(!pendingnode.isempty()) {
	    	try {
				treeNode<Integer>frontnode=pendingnode.dqueue();
			    System.out.println("Enter the No of child node of "+frontnode.data);
			    int NoChild=s.nextInt();
			    for(int i=0;i<NoChild;i++) {
			    	System.out.println("Enter the "+(i+1)+" Node of "+frontnode.data);
			    	int childnode=s.nextInt();
			    	treeNode<Integer>child=new treeNode<Integer>(childnode);
			    	frontnode.children.add(child);
			    	pendingnode.enqueue(child);
			    }
	    	} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }//end of while lloop
	    return rootnodes;
	}
	public static treeNode<Integer> removeLeafNode(treeNode<Integer>root) {
		if(root==null) {
			return null;
		}
		if(root.children.size() == 0){
			return null;
		}
		ArrayList<Integer> indexes=new ArrayList<Integer>();
		for(int i=0;i<root.children.size();i++) {
			treeNode<Integer> child=root.children.get(i);
			if(child.children.size()==0) {
				indexes.add(i);
			}
		}
		for(int i=indexes.size()-1;i>=0;i--) {
			int j=indexes.get(i);
			root.children.remove(j);
		}
		
		for(int i=0;i<root.children.size();i++) {
			treeNode<Integer> child=removeLeafNode(root.children.get(i));
			if(child==null) {
				root.children.remove(i);
			}
			
		}
		return root;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       treeNode<Integer> root=inputlevelwise();
      //print(root);
       int n=findnumberOFNodes(root);
	   System.out.println("Total nUmber of nodes are "+n);
	   int s=findsumofNodes(root);
	   System.out.println("Sum of nodes is "+s);
	   int mx=findLarger(root);
	   System.out.println("larger data is: "+mx);
	    treeNode<Integer>rootp=removeLeafNode(root);
	    print(rootp);
	    boolean b=check_cousin(root);  
	} 

}

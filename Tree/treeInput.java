package Tree;
import java.util.*;

import Queue.QueueEmptyException;
import Queue.queueusingLL;
public class treeInput {

	public static void print(treeNode<Integer>root) {
		String s=root.data+" :,";
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
		print(root.children.get(i));
		}
	}
	public static treeNode<Integer> inputlevelWise(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter root data");
		int rootdata=s.nextInt();
		queueusingLL<treeNode<Integer>>pendingNode=new queueusingLL<treeNode<Integer>>();
		treeNode <Integer>root=new treeNode<Integer>(rootdata);
		pendingNode.enqueue(root);
		while(!pendingNode.isempty()) {
			try {
				treeNode <Integer>frontnode=pendingNode.dqueue();
			    System.out.println("Enter children of "+(frontnode.data)+"");
			    int num=s.nextInt();
			    for(int i=0;i<num;i++) {
			    	System.out.println("Enter the "+(i+1)+" th child of "+frontnode.data);
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
		return root;
		
	}
	public static void main(String args[]) {
		treeNode<Integer> root=inputlevelWise();
		print(root);
	}
}

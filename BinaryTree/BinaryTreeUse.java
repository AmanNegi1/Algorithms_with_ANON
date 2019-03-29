package BinaryTree;
import java.util.*;

import Queue.QueueEmptyException;
import Queue.queueusingLL;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer>takeInput(Scanner s){//this is what i did ..my apparoch..
		System.out.println("Enter root data");
		int x=s.nextInt();
		BinaryTreeNode<Integer>root=new BinaryTreeNode(x);
		System.out.println("Enter left data");
		int left=s.nextInt();
		if(left==-1) {
			return null;
		}
		BinaryTreeNode<Integer>leftnode=new BinaryTreeNode(left);
		System.out.println("Enter Right data");
		int right=s.nextInt();
		if(right==-1) {
			return null;
		}
		BinaryTreeNode<Integer>rightnode=new BinaryTreeNode(right);
		root.left=leftnode;
		root.right=rightnode;
		takeInput(s);
		takeInput(s);
		return root;
		
		
	}
	public static BinaryTreeNode<Integer>takeInput2(Scanner s){
		
		System.out.println("Enter Root Data");
		 int root=s.nextInt();
		 if(root==-1) {
			 return null;
		 }
		 BinaryTreeNode<Integer>rootnode=new BinaryTreeNode<>(root);
		 rootnode.left=takeInput2(s);
		 rootnode.right=takeInput2(s);
	     return rootnode;
	}
	public static void print(BinaryTreeNode<Integer>root) {
		if(root==null) {
			return ;
		}
		String s=root.data+"";
		
		if(root.left!=null) {
		s+=" L: "+root.left.data;
		}
		
		
		if(root.right!=null) {
			s=s+" R: "+root.right.data;
		}
		System.out.println(s);
		print(root.left);
		print(root.right);
		return;
	}
	public static BinaryTreeNode<Integer> takeInputlevelWise() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter root data");
		int rootdata=s.nextInt();
		if(rootdata==-1) {
			return null;
		}
	   queueusingLL <BinaryTreeNode<Integer>>pendingnode=new queueusingLL<>();
	   BinaryTreeNode<Integer>rootnode1=new BinaryTreeNode(rootdata);
	   pendingnode.enqueue(rootnode1);
	   while(!pendingnode.isempty()) {
		   try {
			BinaryTreeNode<Integer> frontNode=pendingnode.dqueue();
		    System.out.println("Enter the left data of "+frontNode.data);
		    int left=s.nextInt();
		    if(left!=-1) {
		    	
		    
		    BinaryTreeNode<Integer>leftchild=new BinaryTreeNode<Integer>(left);
		    frontNode.left=leftchild;
		    pendingnode.enqueue(leftchild);
		    }
		    System.out.println("Enter the Right data of "+frontNode.data);
		    int right=s.nextInt();
		    if(right!=-1) {
		    
		    BinaryTreeNode<Integer>rightchild=new BinaryTreeNode<Integer>(right);
		    frontNode.right=rightchild;
		    pendingnode.enqueue(rightchild);
		    }
		    } catch (QueueEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   return rootnode1;
	}
	public static void printlevelwise(BinaryTreeNode<Integer>root) {
		queueusingLL<BinaryTreeNode<Integer>>node=new queueusingLL<>();
		
		node.enqueue(root);
		while(!node.isempty()) {
			try {
				BinaryTreeNode<Integer>frontnode=node.dqueue();
				String s=frontnode.data+":";
	               if(frontnode.left!=null) {
					s+="L:"+frontnode.left.data+",";	
					}else{
	                 s+="L:"+"-1,";
	               }
		
					if(frontnode.right!=null) {
				     	s+="R:"+frontnode.right.data+"";		
					}else{
	                  s+="R:"+"-1";
	                }
				  if(frontnode.left!=null) {
				     node.enqueue(frontnode.left);
				   }
	                if(frontnode.right!=null){
	                   node.enqueue(frontnode.right);
	                }
	               System.out.println(s);
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static int countNode(BinaryTreeNode<Integer>root) {
		if(root==null) {
			return 0;
		}
		int ans=1;
		if(root.left==null) {
			return 1;
		}
		if(root.right==null) {
			return 1;
		}
		ans=ans+countNode(root.left);
		ans=ans+countNode(root.right);
		return ans;
	}
	public static boolean findNode(BinaryTreeNode<Integer>root,int x) {
		
		if(root==null) {
			return false;
		}
		boolean ans=false;
		if(root.data==x) {
			ans=true;
			return ans;
		}
		if(root.left==null) {
			if(root.data==x) {
				return true;
			}else {
				ans=false;
			}
		}
		if(root.right==null) {
			if(root.data==x) {
				return true;
			}else {
				ans=false;
			}
		}
		boolean b=findNode(root.left,x);
	    boolean b1=findNode(root.right,x);
		if(b==true) {
			return b;
		}else if(b1==true) {
			return b1;
		}else {
			return false;
		}

	}
	public static void printZigZag(BinaryTreeNode<Integer>root){
		Stack <BinaryTreeNode<Integer>>s1=new Stack();
		s1.push(root);
		
		while(!s1.empty()) {
			Stack<BinaryTreeNode<Integer>>s2=new Stack();
			 String st="";  
			while(!s1.empty()) {
			BinaryTreeNode<Integer>bt=s1.pop();
            if(bt.left!=null){
	            s2.push(bt.left);
	        }
			if(bt.right!=null){
				s2.push(bt.right);
				
			   }
			st=st+bt.data+" ";
			
			}   
			   System.out.print(st);
	            if(s1.empty()){
	            	System.out.println();
	            }
	            String str="";
				while(!s2.empty()) {
					BinaryTreeNode<Integer>bt2=s2.pop();
					str+=bt2.data+" ";
	              if(bt2.right!=null){
					s1.push(bt2.right);
				//	s1.push(bt2.left);
	              }
	              if(bt2.left!=null){
	            	  s1.push(bt2.left);
					//s1.push(bt2.right);
	              }
               }
				System.out.print(str);
				if(s2.empty()) {
					System.out.println();
				}
	}
}
	public static BinaryTreeNode<Integer> buildTreeHelper(int []in,int []pre,int inS,int inE,int preS,int preE){
		
		return null;
	}
	public static BinaryTreeNode<Integer>buildAtree(int in[],int pre[]){
		return buildTreeHelper(in,pre,0,in.length-1,0,pre.length-1);
	}
	public static ArrayList<Node<BinaryTreeNode<Integer>>> levelwiseLinkedlist(BinaryTreeNode<Integer> root) {
		Node<BinaryTreeNode<Integer>> head=null,tell=null;
		ArrayList<Node<BinaryTreeNode<Integer>>>r=new ArrayList<Node<BinaryTreeNode<Integer>>>();;
		//Queue<BinaryTreeNode<Integer>>Q=new Queue<BinaryTreeNode<Integer>>()
	    queueusingLL<BinaryTreeNode<Integer>> Q = new queueusingLL<BinaryTreeNode<Integer>>();
	    Q.enqueue(root);
      	Q.enqueue(null);	
	    while(Q.size()!=0) {
	    
	    	try {
				BinaryTreeNode<Integer>bt=Q.dqueue();
			    if(bt==null) {
			    	
			    	r.add(head);
			    	head=null;
			    	tell=null;
			    	if(!Q.isempty()) {
			    		Q.enqueue(null);	
			    	}
			    	continue;
			    }
				if(bt.left!=null) {
			    Q.enqueue(bt.left);	
			    }
                if(bt.right!=null) {
			    Q.enqueue(bt.right);	
			    }
                Node<BinaryTreeNode<Integer>>newnode=new Node<BinaryTreeNode<Integer>>(bt);
                if(head==null) {
                	head=newnode;
                	tell=newnode;
                }else {
                	tell.next=newnode;
                	tell=newnode;
                }
	    	} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		return r;
		// Write you
	}
	public static int heightofT(BinaryTreeNode<Integer>root) {
		if(root==null) {
			return 0;
		}
		int lh=heightofT(root.left);
		int rh=heightofT(root.right);
		return 1+Math.max(lh, rh);
	}
	public static int diameter(BinaryTreeNode<Integer>root) {
		int op1=heightofT(root.left)+heightofT(root.right);
	    int op2=diameter(root.left);
	    int op3=diameter(root.right);
	    return Math.max(op1, Math.max(op2, op3));
	}
	public static Pair<Integer,Integer>diameterBetter(BinaryTreeNode<Integer>root){
		if(root==null) {
			Pair<Integer,Integer>output=new Pair();
			output.first=0;
			output.second=0;
		    return output;
		}
		Pair<Integer,Integer>lo=diameterBetter(root.left);
		Pair<Integer,Integer>ro=diameterBetter(root.right);
		int height=1+Math.max(lo.first, ro.first);//height of overall tree
	    int op1=lo.first+ro.first;//some of left and right tree..
	    int op2=lo.second;//diameter of left
	    int op3=ro.second;//diameter of right
		int diameter=Math.max(op1,Math.max(op2,op3));
		Pair<Integer,Integer>output=new Pair();
		output.first=height;
		output.second=diameter;
		return output;
	}
	public static int minimum(BinaryTreeNode<Integer>root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
		
	}
	public static int maximum(BinaryTreeNode<Integer>root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
		
	}
	public static boolean checkBST(BinaryTreeNode<Integer>root) {
		if(root==null) {
			return true;
		}
		int Lmax=maximum(root.left);
		int Rmin=minimum(root.right);
        if(root.data<=Lmax) {
        	return false;
        }
        if(root.data>Rmin) {
        	return false;
        }
        boolean v=checkBST(root.left);
        boolean b=checkBST(root.right);
	    return v&&b;
	}
	public static Pair<Boolean,Pair<Integer,Integer>>checkBSTBetter(BinaryTreeNode<Integer>root){
	if(root==null) {
		Pair<Boolean,Pair<Integer,Integer>>output=new Pair<Boolean,Pair<Integer,Integer>>();
		output.first=true;
		output.second=new Pair<Integer,Integer>();
	    output.second.first=Integer.MAX_VALUE;
	    output.second.second=Integer.MIN_VALUE;
	    return output;
	}
	Pair<Boolean,Pair<Integer,Integer>>Lout=checkBSTBetter(root.left);
	Pair<Boolean,Pair<Integer,Integer>>Rout=checkBSTBetter(root.right);
	int min=Math.min(root.data,Math.min(Lout.second.first, Rout.second.first));
	int max=Math.max(root.data, Math.max(Lout.second.second, Rout.second.second));
	boolean isBst=root.data>min&&root.data<=max&&Lout.first&&Rout.first;
	Pair<Boolean,Pair<Integer,Integer>>output=new Pair<Boolean,Pair<Integer,Integer>>();
	output.first=isBst;
	output.second=new Pair<Integer,Integer>();
    output.second.first=min;
    output.second.second=max;
    return output;
	}
	public static ArrayList<Integer>findPathBinaryTree(BinaryTreeNode<Integer>root,int k){
		if(root==null) {
			return null;
		}
		if(root.data==k) {
			ArrayList<Integer>output=new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer>leftroot=findPathBinaryTree(root.left,k);
		if(leftroot!=null) {
			leftroot.add(root.data);
		}
		ArrayList<Integer>rightroot=findPathBinaryTree(root.right,k);
		if(rightroot!=null) {
			rightroot.add(root.data);
			return rightroot;
		}else {
			return null;
		}
	}
	public static void convertintoarray(BinaryTreeNode<Integer>root,int i,int []arr) {
		if(root==null) {
			return ;
		}
		arr[i]=root.data;
		i++;
		convertintoarray(root.left,i,arr);
		convertintoarray(root.right,i,arr);
		
	}
	public static void pairSumBT(BinaryTreeNode<Integer>root) {
	    int arr[]=null;
		convertintoarray(root,0,arr);	
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr is"+arr[i]);
		}
	}
	public static void main(String[] args) {
	//Scanner s=new Scanner(System.in);
	//BinaryTreeNode<Integer>root=takeInput(s);//try this one too
	//BinaryTreeNode<Integer>root=takeInput2(s);
	BinaryTreeNode<Integer>root=takeInputlevelWise();
	//print(root);//prints recursively..
	printlevelwise(root);
	int r=countNode(root);
	System.out.println("Total number of node are "+r);
	boolean b=findNode(root,8);
	System.out.println(b);
	printZigZag(root);
	//int in[]= {};
	//int pre[]= {};
	//BinaryTreeNode<Integer>root1=buildAtree(in,pre);//under construction..
//	ArrayList<Node<BinaryTreeNode<Integer>>> a=levelwiseLinkedlist(root);
	boolean b1=checkBST(root);
	System.out.println(b1);
	Pair<Boolean,Pair<Integer,Integer>> tr=checkBSTBetter(root);
	System.out.println("The Bst is : "+tr.first);
	ArrayList<Integer>output=findPathBinaryTree(root,6);
	pairSumBT(root);
	
	}
	
	class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
}}

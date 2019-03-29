package LinkList;

import java.util.Scanner;

public class merge_sort {
	public static Node_Creation<Integer> merge_sort(Node_Creation<Integer> head) {
		// write your code here

		Node_Creation <Integer>temp=head,Left=null,Ltell=null,Right=null;
      int c=0;
      while(temp!=null){
        c++;
        temp=temp.next;
      }
      temp=head;
      int mid=c/2;
      int t=0;
      Left=temp;
      while(t!=mid){
    	  t++;
    	  temp=temp.next;
    	  Ltell=temp;
      if(t==mid) {
        	Ltell=temp;
        	temp=temp.next;
            Ltell.next=null;
            break;
         }
      }
       Right=temp;
       while(temp!=null){
        temp=temp.next;
     }
      
      return head;
	}
	public static Node_Creation<Integer> ListInput() {
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		Node_Creation<Integer> head=null,tell=null;
		while(d!=-1) {
			Node_Creation <Integer> newnode=new Node_Creation(d);
			if(head==null) {
				head=newnode;
				tell=newnode;
			}else {
				tell.next=newnode;
				tell=newnode;
			}
			d=s.nextInt();
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Node_Creation<Integer>head=ListInput();
     head=merge_sort(head);
	}

}

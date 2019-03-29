package LinkList;
import java.util.*;
public class returnNodeuse {

	public static void print(returnNodeIndex<Integer> head) {
      while(head!=null) {
    	  System.out.print(head.data+" ");
            head=head.next;
      }
	}
	public static returnNodeIndex<Integer> InsertNode(returnNodeIndex<Integer> head,int data,int pos) {
		returnNodeIndex <Integer>temp=head;
		returnNodeIndex <Integer> newnode=new returnNodeIndex<Integer>(data);
		int c=1;
		while(c<pos) {
			c++;
			temp=temp.next;
		}
		if(pos==0) {
		newnode.next=temp;
		return newnode;
		}else {
		newnode.next=temp.next;
		temp.next=newnode;
		return head;
		}
	}
	public static returnNodeIndex <Integer> deleteNode(returnNodeIndex <Integer> head ,int pos) {
		returnNodeIndex<Integer> temp=head;
		int r=1;
		if(pos==0) {
			head=head.next;
			return head;
		}
		while(r<pos) {
			temp=temp.next;
			r++;
		}
		temp.next=temp.next.next;
		return head;
	}
	public static void main(String args[]) {
		returnNodeIndex <Integer> head=null,tell=null;
		Scanner scan =new Scanner(System.in);
	    int data=scan.nextInt();
	    while(data!=-1) {
	    	returnNodeIndex <Integer> newnode=new returnNodeIndex<Integer>(data);
	    	if(head==null) {
	    		head=newnode;
	    		tell=newnode;
	    	}else {
	    		tell.next=newnode;
	    		tell=newnode;
	    	}
	    data=scan.nextInt();	
	    }//end of while loop
//	    System.out.println("Enter the data to be append");
//	    int p=scan.nextInt();
	   // head=InsertNode(head,-5,2);
	    head=deleteNode(head,4);
	    print(head);
	}
	
}

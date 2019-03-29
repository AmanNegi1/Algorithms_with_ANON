package Stack;
import java.util.*;
public class check_brakets_expresion<T> {
    Node_Creation <T>  head=null;
    int size;
    public  void insert(char c) {
    	String p=""+c;
    	Node_Creation <T> newnode=new Node_Creation<T>((T) p);
        newnode.next=head;
        head=newnode;
    }
    public void print() {
    	while(head!=null) {
    		head=head.next;
    	}
    }
    public boolean check_expresion(String str) {
    	if(str==null) {
    		return false;
    	}
    	int i=0;
    	while(i<str.length()) {
    	if(str.charAt(i)=='{') {
    	insert(str.charAt(i));
    	}else if(str.charAt(i)=='(') {
    	insert(str.charAt(i));	
    	}else if(str.charAt(i)=='[') {
    	insert(str.charAt(i));
    	}else if(str.charAt(i)=='}') {
    		if(head==null) {
     		   return false;
     	   }
    		if("{".equals(head.data)){
    		
    			head=head.next;
    		}else {
    		return false;
    		}
    	}else if(str.charAt(i)==')') {
    	   if(head==null) {
    		   return false;
    	   }
    		if("(".equals(head.data)){
    		head=head.next;
    		}else {
    		return false;
    		}
    	  }else if(str.charAt(i)==']'){
    		  if(head==null) {
       		   return false;
       	   }
    		  if("[".equals(head.data)){
    			
    			head=head.next;
    		}else {
    		
    			return false;
    		}
    	}
    	i++;
    	}//end of while loop..
    	if(head!=null) {
    		return false;
    	}
    	
       return true;
    }}

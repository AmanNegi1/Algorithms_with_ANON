package practive2;
import java.util.*;
public class javaPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="25";
     String s2="25";
     int i=0;
     int k=1,p1=0,p11=0,p2=0;
     p1=s.charAt(0)-'0';
     while( i<s.length()) {
    	p11=p1;
    	 
    	 if(s.length()-i>i) {
    		 
    	 p1=p1*(int)Math.pow(10,k );
    	 }
    	 if(i<s.length()-1) {
    	 p1=p1+s.charAt(i+1)-'0';
    	 }
    	  
    	 i++;
    	
     }
     p2=p1;
 
     i=0;
     p11=0;
     p1=0;
 
     p1=s.charAt(0)-'0';
     while( i<s2.length()) {
     	p11=p1;
     	 
     	 if(s2.length()-i>i) {
     		 
     	 p1=p1*(int)Math.pow(10,k );
     	 }
     	 if(i<s2.length()-1) {
     	 p1=p1+s2.charAt(i+1)-'0';
     	 }
     	  
     	 i++;
     	
      }
     System.out.println(p1*p2);

	}

}

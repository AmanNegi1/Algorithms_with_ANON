package tries;
import java.util.*;
public class TriesUse {

	public static void main(String[] args) {
       TriesClass obj=new TriesClass();
       Scanner s=new Scanner(System.in);
       String arr[]=new String[10];
       System.out.println("Enter the Number of words");
       int n=s.nextInt();
       for(int i=0;i<n;i++) {
    	   System.out.println("Enter the "+(i+1)+" String");
           arr[i]=s.next();
           obj.add(arr[i]);
       }
       System.out.println();
       System.out.println("Added Words Are -->");
       for(int i=0;i<n;i++) {
    	   System.out.print(arr[i]+" ,");
    	  
       }
       System.out.println();
       System.out.println();
       System.out.println("Enter the word You want to Search");
       String sp=s.next();
       System.out.println("Found "+obj.search(sp));
       System.out.println();
       System.out.println("Enter the word You want to Remove");
       String sp1=s.next();
       obj.remove(sp1);
       System.out.println("Word Deleted");
       //System.out.println(obj.search("amanegi"));
       System.out.println();
       System.out.println("Enter the word You want to Search");
       String sp3=s.next();
       System.out.println("Found "+obj.search(sp3));

       int p=obj.countword();
       System.out.println("Number of words are :-->"+p);
	}

}

package mixed_Problems;
import java.util.*;
import java.util.Map.Entry;
public class monk_and_cake {
     public static void main(String args[]) {
    	 Scanner s=new Scanner(System.in);
    	 int tC=s.nextInt();
    	 while(tC--!=0) {
    	  int numdiffCake=s.nextInt();
    	  int numMonkFriend=s.nextInt();
    	  int eatingCap[]=new int[numMonkFriend];
    	  for(int i=0;i<numMonkFriend;i++) {
    		  eatingCap[i]=s.nextInt();
    	  }
    	  int weight_of_ith_cake[]=new int[numdiffCake];
    	  for(int i=0;i<numdiffCake;i++) {
    		  weight_of_ith_cake[i]=s.nextInt();
    	  }
    	  int cake_arr[]=new int[numdiffCake];
    	  for(int i=0;i<cake_arr.length;i++) {
    		  cake_arr[i]=s.nextInt();
    	  }
    	  Vector<Integer> v_arr=new Vector<Integer>();
    	  for(int i=0;i<weight_of_ith_cake.length;i++) {
    		  v_arr.add(weight_of_ith_cake[i]);
    	  }
    	  for(int i=0;i<eatingCap.length;i++) {
    		  v_arr.add(eatingCap[i]);
    	  }
    	  Collections.sort(v_arr);
    	  int c=0;
    	  Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
    	  for(int i=0;i<v_arr.size();i++) {
    		 if(hm.containsKey(v_arr.get(i))) {
    			// hm.put(v_arr.get(i), c);
    		 }else {
    			 hm.put(v_arr.get(i),c+=1);
    		 }
    	  }//..
    	  
    	  int arr_0[]=new int[v_arr.get(v_arr.size()-1)];
    	  int arr_1[]=new int[v_arr.get(v_arr.size()-1)];
    	  for(int i=0;i<weight_of_ith_cake.length;i++) {
    		 int value = hm.get(weight_of_ith_cake[i]);
    		  arr_0[value]+=cake_arr[i];
    	  }
    	  for(int i=0;i<eatingCap.length;i++) {
    		  int value = hm.get(eatingCap[i]);
    		  arr_1[i]=value;
    	  }
    	 //..
    	 //what should I do from here..
    	 }//end of while loop../
     }
}

package hashMap;
import java.util.*;
public class removeDup {
    public static ArrayList<Integer> removeDupli(int arr[]) {
    	ArrayList<Integer> ar=new ArrayList<Integer>();
    	HashMap<Integer,Boolean>hm=new HashMap<Integer,Boolean>();
    	for(int i=0;i<arr.length;i++) {
    		if(hm.containsKey(arr[i])) {
    		
    			continue;
    		}else {
    		hm.put(arr[i], true);
    		ar.add(arr[i]);
    	}}
    	return ar;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,3,4,7,8,8};
    ArrayList<Integer> ar=removeDupli(arr);
	 for(int i :ar) {
		 System.out.println(i);
	 }
	}

}

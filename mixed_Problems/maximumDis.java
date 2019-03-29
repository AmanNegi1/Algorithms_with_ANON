package mixed_Problems;

import java.util.HashMap;

public class maximumDis {

	public static int maxDistance(int arr[])
	{    int max=Integer.MIN_VALUE;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
          if(hm.containsKey(arr[i])){
              int r=hm.get(arr[i]);
        	  int t=(i-r);
              if(t>max) {
        		max=t;
        	  }
            hm.put(arr[i],i);
          }else{
            hm.put(arr[i],i);
          }
        }
        
		return max;
	}
	public static void main(String[] args) {
		int arr[] = {1, 3, 1, 4, 5, 6, 4, 8, 3};
		System.out.println(maxDistance(arr));
	}

}

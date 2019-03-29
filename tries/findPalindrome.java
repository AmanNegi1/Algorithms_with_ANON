package tries;
import java.util.*;
public class findPalindrome {

	public static boolean checkPalindrome(ArrayList<String> stringA,int i) {
		if(i>=stringA.size()) {
			return false;
		}
		TriesClass obj=new TriesClass();
		TriesClass obj1=new TriesClass();
		String str=stringA.get(i);
		for(int k=0;k<stringA.size();k++) {
			obj.add(stringA.get(k));	
		}
		//obj.add(stringA.get(i));
		String r="";
		for(int j=str.length()-1;j>=0;j--) {
			r=r+str.charAt(j);
		}
		boolean b=obj.search(r);
		if(b==true) {
		return true;
		}
		return checkPalindrome(stringA,i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String > str_arr=new ArrayList<String>();
      str_arr.add("abc");
      str_arr.add("xyz");
      str_arr.add("zyx");
      boolean b=checkPalindrome(str_arr,0);
	  System.out.println(b);
	}

}

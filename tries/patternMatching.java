package tries;
import java.util.*;

public class patternMatching {

	public static boolean patternMatch(ArrayList<String> Sa,String ptrn,int i) {
		if(i>=Sa.size()) {
			return false;
		}
		TriesClass obj=new TriesClass();
		String p=Sa.get(i);
		String q=Sa.get(i);
		obj.add(p);
		for(int k=1;k<p.length();k++) {
			obj.add(p.substring(k, p.length()));
		}
		for(int k=0;k<q.length();k++) {
			String qq=Sa.get(i);
			obj.add(qq.substring(0,k));
		}
		boolean b=obj.search(ptrn);
		if(b==true) {
			return true;
		}
		return patternMatch(Sa,ptrn,i+1);
		
	}
	
	public static void main(String args[]) {
	
	ArrayList<String> sA=new ArrayList<String>();
	sA.add("universe");
	sA.add("neha");
	boolean b=patternMatch(sA,"ea",0);
	System.out.println(b);
	}
}

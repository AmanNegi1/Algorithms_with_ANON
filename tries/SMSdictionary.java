package tries;
import java.util.*;
public class SMSdictionary {
    public static void smsDic(String []str) {
		TriesClass obj=new TriesClass();
		for(int i=0;i<str.length;i++) {
			obj.add(str[i]);
		}
	}
	public static void main(String args[]) {
	String s[]= {"at","on","no","good"};	
	smsDic(s);
	}
}

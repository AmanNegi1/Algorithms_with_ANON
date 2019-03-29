package Recursion;

public class return_all_codes {

	public static String  helper(char c) {
	int p=c-'0';
	char a=(char)('a'+p-1);
	System.out.println("a="+a);
	return String.valueOf(a);			
	}
	public static String [] getcode1(String st,String out[],int si) {
	//	String temp[]=st.split(" ");
		if(st.length()==0) {
			String out2[]= {" "};
			return out2;
		}
		
for(int i=0;i<st.length();i++) {
			String p[]=new String[out.length+i];
			p[i]=helper(st.charAt(i));
			out[si]=""+out[si]+p[i];
		}
	//	String p=helper(st.charAt(0));
		//String p1=helper(st.charAt(1));
		//out[si]=""+p;
     si++;
     	 String ss=st.charAt(0)+""+st.charAt(1);
    	 String arr[]=ss.split(" ");
    	 char ch=(char)(arr[0]);
    	 String rar=helper(arr[0]);
     String ar[]=
	String pp[]=	getcode1(st.substring(2),out,si);
	//	st="1234";
		getcode1(st.substring(2),out,si+1);

		System.out.println(out[si]);
		 return out;
	}
	public static String [] getcode(String str){
		
		String out[]=new String[str.length()];
		String s[]=getcode1(str,out,0);
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
	   	return s;
	}
	public static void main(String args[]) {
		String s="12345";
		getcode(s);
	}
}

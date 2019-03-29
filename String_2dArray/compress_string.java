package String_2dArray;

public class compress_string {
public static String compress(String inputString) {
	String compStr="";	
	int t=0,i;
	for( i=0;i<inputString.length()-1;i++) {
		if(inputString.charAt(i)==inputString.charAt(i+1)){
			t++;
		}else if(inputString.charAt(i)!=inputString.charAt(i+1) &&i+1<inputString.length() ) {
			if(t==0) {

				compStr=compStr+inputString.charAt(i);
			
			}else {
				compStr=compStr+inputString.charAt(i)+(t+1);
				t=0;
			}
			
		}else {
//			compStr=compStr+inputString.charAt(i+1);
//			System.out.println(inputString.charAt(i+1));
//			t=0;
		}
	}
	if(i==inputString.length()-1) {
		compStr=compStr+inputString.charAt(i);
	}
	return compStr;
    }

public static void main(String []args) {
	String str="aabaaa";
	String st=compress(str);
	System.out.println(st);
}
}

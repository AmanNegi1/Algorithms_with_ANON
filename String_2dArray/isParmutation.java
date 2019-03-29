package String_2dArray;

public class isParmutation {
	public static boolean isPermutation(String input1, String input2) {
	int arr[]=new int[255];
	if(input1.length()==input2.length()) {
		for(int i=0;i<=input1.length()-1;i++) {
			arr[input1.charAt(i)]++;
			}
		for(int i=0;i<=input2.length()-1;i++) {
			arr[input2.charAt(i)]--;
		}
		for(int i=0;i<input1.length();i++) {
			if(arr[input1.charAt(i)]==0 && arr[input2.charAt(i)]==0) {
				
			}else {
				return false;
			}
		}
	}else {
		return false;
	}
	return true;
		
		
	}
	
	public static void main(String args[]) {
	String str1="abcd";
	String str2="acbd";
	boolean f=isPermutation(str1,str2);
	System.out.println(f);
	}
}

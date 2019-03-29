package String_2dArray;

public class print_all_substring {
	public static void printSubstrings(String str){
		
		for(int i = 0;i < str.length(); i++){
			for(int j=i;j<=str.length();j++) {
				System.out.println(str.substring(i, j));
			}
			//	
		        	
		}

		}
		
	public static void main(String[] args) {
		String s="xyz";
		printSubstrings(s);
	}
}

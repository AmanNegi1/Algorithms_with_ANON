package String_2dArray;

public class highest_occerence_char {
public static char highestOccuringCharacter(String inputString) {
		int arr[]=new int[255];
	    char c=' ';
		for(int i=0;i<inputString.length();i++) {
			if(inputString.charAt(i)==' ') {
				
			}else {
			arr[inputString.charAt(i)]++;
		}}
		
		int max=0;
		for(int i=0;i<inputString.length();i++) {
			if(arr[inputString.charAt(i)]>=max ) {
				//System.out.println(arr[inputString.charAt(i)]);
				max=arr[inputString.charAt(i)];
				//System.out.println(max);
				c=inputString.charAt(i);
			
			}
		}
		
		return c;
		
    }
	public static void main(String []args) {
		String str="Hello graphic era here is aman negi";
		char ch=highestOccuringCharacter(str);
		System.out.println(ch);
	}
}

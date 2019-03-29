package Recursion;
public class Replace_PI {
	//not for all test cases try "pip"
//	public static String replace_pi(String s,int i,String temp) {
//    	if(s.length()<=i) {
//         return temp;		
//    	}
//    	if(s.charAt(i)=='p' && s.charAt(i+1)=='i') {
//    		temp=temp+"3.14";
//    		i++;
//    	}else {
//    		temp=temp+s.charAt(i);
//    	}
//        String st=	replace_pi(s,i+1,temp);
//        return st;
//     }
	public static String replace_pi_better(String input,String temp) {
		if(input.length()<=1) {
			if(input.charAt(0)=='p' ) {
			temp=temp+input.charAt(0);
			}else  {
			//	if(temp.charAt(temp.length()-1)=='4') {
				//	temp=temp+input.charAt(0);
					//System.out.println(temp.charAt(temp.length()-1));
				//}else {
				//temp=temp+input.charAt(0);
				//}
			}
			if(input.charAt(0)!='p' && input.charAt(0)!='i') {
				temp=temp+input.charAt(0);
			}
			return temp;
		}
		if(input.charAt(0)!='p' && input.charAt(0)!='i') {
			temp=temp+input.charAt(0);
			}
//		if(temp.charAt(temp.length()-1)!='4' && input.charAt(0)=='i') {
//			temp=temp+input.charAt(0);
//			}
//		if(temp.charAt(temp.length()-1)=='4' && input.charAt(0)=='i') {
//			
//		}
        if(input.charAt(0)=='i'  && input.charAt(1)=='i') {
        	temp=temp+input.charAt(0);
        }
        if(input.charAt(0)=='p'  && input.charAt(1)=='p') {
        	temp=temp+input.charAt(0);
        }
		if(input.charAt(0)=='p'&& input.charAt(1)=='i') {
			temp=temp+"3.14";
		}
		String st=replace_pi_better(input.substring(1),temp);
	    return st;
	}
	public static void main(String args[]) {
		String str="ppippiiipp";
	//	String s=replace_pi(str,0,"");
		String s1=replace_pi_better(str,"");
		System.out.println(s1);
		//System.out.println(s);
	}
}

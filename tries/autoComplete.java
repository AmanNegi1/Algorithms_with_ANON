package tries;
import java.util.*;
public class autoComplete {

	public static void  autoCompletehas(ArrayList<String> arrL,String matchStr,int i){
		if(i>=arrL.size()) {
			return;
		}
		String str=arrL.get(i);
		TriesClass obj=new TriesClass();
		
	 autoCompletehas(arrL,matchStr,i+1);
	 for(int p=0;p<matchStr.length();p++) {
			obj.add(str.substring(0, matchStr.length()-1));
		}
	  boolean b=obj.search(matchStr);
		if(b==true) {
			System.out.println(str);
		}
	 // al.add(str);
	 return ;
	}
	public static void main(String[] args) {
     ArrayList<String> aL=new ArrayList<String>();
     
     aL.add("do");
     aL.add("dont");
     aL.add("no");
     aL.add("not");
     aL.add("note");
     aL.add("den");
     String matchingString="no";
     autoCompletehas(aL,matchingString,0);
//     for(int i=1;i<output.size();i++) {
//    	 System.out.print(output.get(i)+" ");
//     }
	}
	

}

package HR;

public class AppendAndDelete {

	public static String append_delete(String s,String t,int k){
		   int c1=1;
	        int c2=0;
	        int len=0;
	        int len2=0;
	        if(s.length()>t.length()) {
	        	len=t.length();
	        	len2=s.length();
	        }else {
	        	len=s.length();
	        	len2=t.length();
	        }
	       boolean count=false;
	        //int len=Integer.min(s.length(),t.length());
	        for(int i=0;i<len;i++){
	            if(s.charAt(i)==t.charAt(i)){
	                if(count==true)
	            	c1++;//6
	                count=true;
	           //     continue;
	            }else{
	            	count=false;
	                //c2++;//6
	            }
	        }
	        for(int p=c1;p<len;p++) {
	        	c2++;
	        }
	        int c1b=len2-c1;
	        System.out.println(c1+" "+c2+" "+c1b);
	        if((c1b+c2)==k||c1b==0) {
	        	return "Yes";
	        }else {
	        	return "No";
	        }
//	        s=s.substring(0,c1-2)+t.substring(c2+2);
//	        return s;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="zzzzz";
      String t="zzzzzzz";
      int k=4;
      String r=append_delete(s,t,k);
	   System.out.println(r);
	}

}

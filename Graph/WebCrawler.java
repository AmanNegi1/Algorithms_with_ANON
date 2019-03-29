package Graph;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class WebCrawler {
 
     private Queue<String >	 queue ;
     private List<String> discoverWebList;
     public WebCrawler(){
    	 this.queue=new LinkedList<String>();
    	 this.discoverWebList=new ArrayList<>();
     }
     public void discoverWeb(String root) {
    	 this.queue.add(root);
    	 this.discoverWebList.add(root);
    	 while(!queue.isEmpty()) {
    		 String v=this.queue.remove();
    	     String rawHtml=readUrl(v);
    	     String regExp="http://(\\w+\\.)*(\\w+)";
    	     Pattern pattern=Pattern.compile(regExp);
    	     Matcher matcher=pattern.matcher(rawHtml);
    	     
    	     while(matcher.find()) {
    	    	 
    	    	 String actualUrl=matcher.group();
    	    	 if(!discoverWebList.contains(actualUrl)) {
    	    		 discoverWebList.add(actualUrl);
    	    		 System.out.println("Website has been found "+actualUrl);
    	    		 queue.add(actualUrl);
    	    	 }
    	     }
    	 }
     }
	private String readUrl(String v) {
		String rawhtml="";
		try {
			URL url=new URL(v);
			BufferedReader in=new BufferedReader(new InputStreamReader(url.openStream()));
		    String inputLine="";
		    while((inputLine=in.readLine())!=null) {
		    	rawhtml+=inputLine;
		    }
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rawhtml;
	}
}

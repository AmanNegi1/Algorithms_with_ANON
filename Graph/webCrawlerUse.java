package Graph;

public class webCrawlerUse {
		public static void main(String args[]) {
			WebCrawler web=new WebCrawler();
			String root="http://student.gehu.ac.in/";
			web.discoverWeb(root);
		}
}

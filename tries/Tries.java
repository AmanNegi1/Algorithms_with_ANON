package tries;

public class Tries {
     char data;
     boolean isTreminating;
     Tries children[];
     int childcount;
     public Tries(char data) {
    	 this.data=data;
    	 isTreminating=false;
    	  int childcount=0;
    	 children=new Tries[26];
     }
}

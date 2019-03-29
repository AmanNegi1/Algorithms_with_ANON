package tries;

public class TriesClass {
           Tries root;
         
           public TriesClass(){
        	   root=new Tries('\0');
        	}
          public void remove(String word) {
        	  remove(root,word);
          }
          private void remove(Tries root,String word) {
        	  if(word.length()==0) {
        		  root.isTreminating=false;
        		  return;
        	   }
        	   int childIndex=word.charAt(0)-'a';
        	   Tries childNode=root.children[childIndex];
               remove(childNode,word.substring(1));
          }
          
          private int countwords(Tries root) {
        	  int r=0;
        	  if(root.isTreminating) {
        		  r++;
        	  }
        	  
        	  for(int i=0;i<26;i++) {
        		  if(root.children[i]!=null) {
        		  r=r+countwords(root.children[i]);
        	  }
        	  }
        	  return r;
          }
          
          public int countword() {
        	 return countwords(root);
          }
          
           private boolean add(Tries root, String word){
       		if(word.length() == 0){
       			if (!root.isTreminating) {
       				root.isTreminating= true;
       				return true;
       			} else {
       				return false;
       			}
       		}		
       		int childIndex = word.charAt(0) - 'a';
       		Tries child = root.children[childIndex];
       		if(child == null){
       			child = new Tries(word.charAt(0));
       			root.children[childIndex] = child;
       			root.childcount++;
       			
       		}
       		return add(child, word.substring(1));

       	}
           
           public void add(String word) {
        	   add(root,word);
           }
           
           private boolean search(Tries root,String word) {
        	   if(word.length()==0) {
        		  return root.isTreminating;
        	   }
        	   int childIndex=word.charAt(0)-'a';
        	   Tries childNode=root.children[childIndex];
        	   if(childNode==null) {
        		   return false;
        	   }
        	   return search(childNode,word.substring(1));
           }
           
           public boolean search(String word) {
        	   boolean b=search(root,word);
               return b;
           } 
	
}

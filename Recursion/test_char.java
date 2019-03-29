package Recursion;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

public class test_char {

	public static String[] permutate(String input) {
		if(input.length()==0){
			String s[]= {""};
            return s;
          }
		
          String a[]=permutate(input.substring(1));
          String s[]= new String[a.length+1];
          String s2[]=new String[s.length];       
          for(int i = 0; i<input.length(); i++){
//        		  s[j] = input.substring(0, j)+a[0] + input.substring(j,input.length());
//        		  s2[j]=s[j].substring(0, s[j].length()); 
        	  permutate(perm + input.charAt(i), input.substring(0, i) + input.substring(i + 1, input.length()));

        	  Read more: https://javarevisited.blogspot.com/2015/08/how-to-find-all-permutations-of-string-java-example.html#ixzz5Mw5K6n1W
          }
 			 // System.out.println(s[j]); 
      System.out.println(s2[0]);
                   
      return s2;
	}
	public static void main(String args[]) {
		String s="bc";
		String sp[]=permutate(s);
		for(int i=0;i<sp.length;i++) {
			System.out.println(sp[i]);
		
	
	}}}



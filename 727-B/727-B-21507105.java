/* Author LAVLESH */

import java.util.*;
import java.io.*;

public class solution {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st=new StringTokenizer("");
	
	  static public String next() {
	        while (st == null || !st.hasMoreTokens()) {
	            try {
	                st = new StringTokenizer(br.readLine());
	            } catch (IOException e) {
	                throw new RuntimeException(e);
	            }
	        }
	        return st.nextToken();
	    }
	
	  public static void main(String[]args)throws IOException{
		  PrintWriter op =new PrintWriter(System.out);
		  String s=br.readLine();
		  String[]a=s.split("[a-zA-Z]+");
		  long dollar=0;
		  int cents=0;
		  
		  for(int i=1;i<a.length;i++){
			  String t;
		
			  if(a[i].matches("[\\w\\.]*\\.\\d{2}")){
				  t=a[i].substring(0,a[i].length()-2).replaceAll("\\.","");
				  dollar+=Long.parseLong(t);
				  t=a[i].substring(a[i].length()-2);
				  cents+=Integer.parseInt(t);
			  }
		
			  else{
				  t=a[i].replaceAll("\\.","");
				  dollar+=Long.parseLong(t);
			  }
		  }
		
		 if(cents>99){
			 dollar+=Math.floor(cents/100);
			 cents=cents%100;
		 }
		
		 if(dollar==0){
			 op.print(0);
		 }
		
		 else{
			 String ans=String.valueOf(dollar);
			 int b=(ans.length()%3)==0?3:(ans.length()%3);
		
			 for(int i=0;i<b;i++)
				 op.print(ans.charAt(i));
			
			 int x=0;
		
			 for(int i=b;i<ans.length();i++){
				 if(x%3==0)op.print(".");x++;
				 op.print(ans.charAt(i));
			 }
		 }
		 if(cents>0){
		
			 if(cents<10)
				 op.print(".0"+cents);
		
			 else op.print("."+cents);
		 }
		
	    op.close();
		}
	}
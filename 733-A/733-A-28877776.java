/* Author LAVLESH */
//package practice;
import java.util.*;
import java.io.*;

public class main {
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
  String s = next();
  int count=0,max = 1;
  
  String []t = s.split("");
  for(int i=0;i<t.length;i++){
	  count++;
	  if(i==(t.length-1)&&!t[i].matches("[AEIOUY]"))count++;
	  if (t[i].matches("[AEIOUY]")){
		 
		  if(count>max){
			  max=count;
		  }
		  count = 0;
	  }
   }
  if(count>max){
	  max=count;
  }
  op.print(max);
  op.close();
	}
}
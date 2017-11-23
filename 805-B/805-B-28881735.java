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
  int n=Integer.parseInt(next());
  char s='a';int count =0;
  for(int i=0;i<n;i++){
	 
	 if(count%4==2)s='b';
	 else if(count%4==0)s='a';
	 op.print(s);
	 count++;
  }
  op.close();
	}
}
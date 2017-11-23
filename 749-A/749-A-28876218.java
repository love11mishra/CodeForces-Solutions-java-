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
  int n = Integer.parseInt(next());
  int x = n/2;
  if(n%2 == 0){
	  op.println(x);
	  op.print("2");
	  for(int i=0;i<x-1;i++)
		  op.print(" 2");	  
  }
  else if(n==3){
	  op.println("1\n3");
	 }
  else{
	  op.println(x);
	  op.print("2");
	  for(int i=0;i<x-2;i++)
		  op.print(" 2");
	  op.print(" 3");
  }
  op.close();
	}
}
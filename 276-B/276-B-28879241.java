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
  int []a = new int[26];
  String s = next();
  for(int i=0;i<s.length();i++){
	  a[s.charAt(i)-'a']++;
  }
  int k=0;
  for(int i=0;i<26;i++){
	  if(a[i]%2 == 1)k++;
  }
  if(k<2||k%2==1)op.println("First");
  else op.println("Second");
  op.close();
	}
}
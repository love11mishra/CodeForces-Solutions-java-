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
  int [] a= new int[n];
  for(int i=0;i<n;i++){
	  a[i]=Integer.parseInt(next());
  }
  Arrays.sort(a);
  boolean flag=false;
  for(int i=0;i<n-2;i++){
	 if(a[i]+a[i+1]>a[i+2]){flag=true;break;} 
  }
  if(flag)op.println("YES");
  else op.println("NO");
  op.close();
	}
}
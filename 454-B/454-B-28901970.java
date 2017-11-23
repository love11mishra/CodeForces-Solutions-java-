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

	/*  static int[] nextArray(int n,int x,int y){
		int []a=new int[n];
		for(int i=x;i<y;i++)
			a[i]=Integer.parseInt(next());
		return a;
	}*/
	 public static void main(String[]args)throws IOException{
   PrintWriter op =new PrintWriter(System.out);
   int n=Integer.parseInt(next());
   int s=0,b=0;
   int []a=new int[n];
   for(int i=0;i<n;i++){
	   a[i]=Integer.parseInt(next());
	   if(i>0&&a[i-1]>a[i]){
		   s++;
		   b=i;
	   }
   }
   if(s==0) op.println("0");
   else if(s==1&&a[n-1]<=a[0]) op.println(n-b);
   else op.println("-1");
  op.close();
	}
}
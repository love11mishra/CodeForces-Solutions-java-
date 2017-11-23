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
   int []c=new int[100001];
   for(int i=0;i<n;i++)
	   c[Integer.parseInt(next())]++;
   for(int i=1;i<100001;i++)
       c[i]+=c[i-1];
   int q=Integer.parseInt(next());
   while(q-->0){
	   int num=Integer.parseInt(next());
	   if(num>c.length)op.println(n);
	   else op.println(c[num]);
   }
  op.close();
	}
}
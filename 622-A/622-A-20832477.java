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
  PrintWriter op =new PrintWriter(new BufferedOutputStream(System.out));
   long n=Long.parseLong(next());
   long i=1;
   long x=0;
   while(x<=n){
	   x=(i*(i+1))/2;
	   i++;
   }
   i-=2;x=(i*(i+1))/2;
   if(x==n)op.println(i+n-x);
   else op.println(n-x);
	 	 op.close();
	}
}
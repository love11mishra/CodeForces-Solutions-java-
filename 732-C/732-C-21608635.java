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

    static long max(long a,long b){return a>b?a:b;}  
	
	
	  public static void main(String[]args)throws IOException{
		  PrintWriter op =new PrintWriter(System.out);
		long a=Long.parseLong(next());
		long b=Long.parseLong(next());
		long c=Long.parseLong(next());
		long x=max(a,max(b,c))-1;
		op.println(max(0,x-a)+max(0,x-b)+max(0,x-c));
		 op.close();
		}
	}
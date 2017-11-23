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
		
		 long x = Long.parseLong(next());
		 long y = Long.parseLong(next());
		 long n = Long.parseLong(next());
		 long [] a = {x-y,x,y,y-x,-x,-y};
		 long m = (long)1e9+7;
		 op.println(((a[(int)n%6]%m)+m)%m);
		 op.close();
		}
	}
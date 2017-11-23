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
		StringBuilder sb=new StringBuilder("");
		  int n=Integer.parseInt(next());
		while(n-->0){
		  long l=Long.parseLong(next());
		  long r=Long.parseLong(next());
		for( long i=1 ; (l|i) <= r ; i= (i<<1) ){
			l|=i;
		}
		sb.append(l+"\n");
		}
		op.print(sb);
		 op.close();
		}
	}
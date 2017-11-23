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
		int k=Integer.parseInt(next());
		int r=Integer.parseInt(next());
		for(int i=1;i<=9;i++)
			if((k*i)%10 == r || (k*i)%10 == 0)
		        {
				   op.println(i);break;
		        }
		 op.close();
		}
	}
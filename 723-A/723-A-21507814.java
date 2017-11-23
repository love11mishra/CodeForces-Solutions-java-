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

    static int max(int a,int b){return a>b?a:b;}  
	static int min(int a,int b){return a>=b?b:a;}  

	  public static void main(String[]args)throws IOException{
		  PrintWriter op =new PrintWriter(System.out);
		 int a=Integer.parseInt(next());
		 int b=Integer.parseInt(next());
		 int c=Integer.parseInt(next());
		 int x=(a+b+c)/3;
		 int max=max(a,max(b,c));
		 int min=min(a,min(b,c));
		 int ans=Math.abs(max-x)+Math.abs(min-x);
	     op.println(ans);
		 op.close();
		}
	}
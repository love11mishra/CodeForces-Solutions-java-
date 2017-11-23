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
	 String s=next();
	 s=s.replaceAll("--","2");// op.println(s);
	 s=s.replaceAll("-.","1");// op.println(s);
	 s=s.replaceAll("\\.","0");
	 op.println(s);
	  op.close();
	}
}
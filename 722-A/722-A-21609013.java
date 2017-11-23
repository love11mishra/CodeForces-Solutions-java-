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
		int a=Integer.parseInt(next());
		String s[]=next().split(":");
		int h=Integer.parseInt(s[0]);
		int m=Integer.parseInt(s[1]);
		if(a==24){
			if(h>23)op.print("0"+h%10+":");
			else op.print(s[0]+":");
			if(m>59)op.print("0"+m%10);
			else op.print(s[1]);
		}
		else{
			if(h>12&&h%10!=0)op.print("0"+h%10+":");
			else if(h>12&&h%10==0)op.print("1"+h%10+":");
			else if(h==0)op.print("01:");
			else op.print(s[0]+":");
			if(m>59)op.print("0"+m%10);
			else op.print(s[1]);
		}
		
		 op.close();
		}
	}
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
		
		 int n=Integer.parseInt(next());
		 int m=Integer.parseInt(next());
		 int tmp=m;
		 
		 while(tmp-->0){
			 int k=Integer.parseInt(next());
			 boolean flag=true;
			 int[]a=new int[n+1];
			 for(int i=0;i<k;i++){
				 	int x=Integer.parseInt(next());
				 	if(a[(int)Math.abs(x)]==0){
				 		a[(int)Math.abs(x)]=x;
				 	}
				 	else if(a[(int)Math.abs(x)]+x==0){
				 		flag=false;
				 	}
			 }
			 if(flag){
				 op.println("YES"); op.close();
				 return; 
			 }
		 }
		 op.println("NO");
		 
		 op.close();
		}
	}
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
  
	static int min(int a,int b){return a>=b?b:a;}  


	  
	  public static void main(String[]args)throws IOException{
		 PrintWriter op =new PrintWriter(System.out);
		
		 int n=Integer.parseInt(next());
		 String[]sar=new String[n];
		 String[]sar1=new String[n];
		 for(int i=0;i<n;i++)
			 {
			  sar[i]=next();
			  sar1[i]=sar[i]+sar[i];
			 }
		 int ans=Integer.MAX_VALUE;
		 for(int i=0;i<n;i++){
			 int count=0;
			 for(int j=0;j<n;j++){
				if(sar1[j].contains(sar[i])){
				 if(i!=j){
					count+=sar1[j].indexOf(sar[i]);
				}
			  }
				else {
					op.println("-1");op.close();return;
				}
			 }
			 ans=min(ans,count);
		 }
		 op.println(ans);
		 op.close();
		}
	}
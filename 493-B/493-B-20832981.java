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
  PrintWriter op =new PrintWriter(new BufferedOutputStream(System.out));
   int n=Integer.parseInt(next());
   int[]a=new int[n];
   int[]b=new int[n];int x=0,y=0,last=0;
   for(int i=0;i<n;i++){
	   int xx=Integer.parseInt(next());
	   if(xx>0)a[x++]=xx;
	   else b[y++]=-xx;
	   if(i==n-1)last=xx;
   }int c1=x,c2=y;
   long s1=0,s2=0;x=y=0;
   while(x<n&&a[x]!=0){s1+=a[x];x++;}
   while(y<n&&b[y]!=0){s2+=b[y];y++;}
   if(s1-s2!=0){System.out.println(s1>s2?"first":"second");return;}
  
   else{
	   for(int i=0;i<min(c1,c2);i++){
		   if(a[i]-b[i]!=0)
		   {System.out.println(a[i]>b[i]?"first":"second");return;}
	   }
	if(c1-c2!=0) {System.out.println(c1>c2?"first":"second"); return;}
   }
   
   op.println(last>0?"first":"second");
	 	 op.close();
	}
}
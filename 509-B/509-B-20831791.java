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

	  static int max=0,min=100000;
	static int[] nextArray(int n,int x,int y){
		int []a=new int[n];
		for(int i=x;i<y;i++)
			{a[i]=Integer.parseInt(next());
			if(a[i]>max)max=a[i];
			if(a[i]<min)min=a[i];
			}
		return a;
	}

 
 public static void main(String[]args)throws IOException{
  PrintWriter op =new PrintWriter(new BufferedOutputStream(System.out));
   int n=Integer.parseInt(next());
   int k=Integer.parseInt(next());
   int []a=nextArray(n,0,n);
   if(max-min>k){
	   System.out.println("NO");return;
   }
  op.println("YES");
   for(int i=0;i<n;i++){
	   for(int j=0;j<a[i];j++)
		   op.print((j%k+1)+" ");
	   op.println();
   }
	 	 op.close();
	}
}
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

	static int[] nextArray(int n,int x,int y){
		int []a=new int[n];
		for(int i=x;i<y;i++)
			a[i]=Integer.parseInt(next());
		return a;
	}
	static void ArrayPrint(int[]a){
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	
	  public static void main(String[]args)throws IOException{
		  PrintWriter op =new PrintWriter(System.out);
		int n=Integer.parseInt(next());
		int k=Integer.parseInt(next());
		int []a=nextArray(n,0,n);
		int count=0;
		for(int i=1;i<n;i++){
			count+=(k-a[i]-a[i-1])>0?(k-a[i]-a[i-1]):0;
			if(a[i]+a[i-1]<k)a[i]=k-a[i-1];
		}
		op.println(count);op.flush();
		ArrayPrint(a);
		 op.close();
		}
	}
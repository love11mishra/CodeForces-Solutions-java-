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

	  public static void main(String[]args)throws IOException{
		  PrintWriter op =new PrintWriter(System.out);
		int n=Integer.parseInt(next());
		int[]a=nextArray(n,0,n);
		String[]s=new String[n];
		for(int i=0;i<n;i++)
			s[i]=br.readLine();
		for(int i=0;i<n;i++){
			int count=0;
			for(int j=0;j<s[i].length();j++){
				if(s[i].substring(j,j+1).matches("[aeiouy]"))count++;
			}
			
			//op.println(count);
			if(count!=a[i])
			{
				System.out.println("NO");return;
			}
		}
		op.println("YES");
		 op.close();
		}
	}
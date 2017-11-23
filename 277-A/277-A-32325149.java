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
	
	  static boolean []visited;
	  static int m,n;
	  static int[][]arr;
	  static int visit(int r){
		  if(visited[r])return 0;
		  visited[r]=true;
		  for(int j=0;j<m;j++){
			  if(arr[r][j]==1){
				  for(int l=0;l<n;l++){
					  if(arr[l][j]==1){
						  visit(l);
					  }
				  }
			  }
		  }
		  return 1;
	  }
	  
	  public static void main(String[]args)throws IOException{
		 PrintWriter op =new PrintWriter(System.out);
		 n = Integer.parseInt(next());
		 m = Integer.parseInt(next());
		 arr = new int[n][m];
		 visited = new boolean[n];
		 boolean bool = false;

		 for(int i=0;i<n;i++){
			 int p = Integer.parseInt(next());
			 for(int j=0;j<p;j++){
				 int q = Integer.parseInt(next())-1;  
				 arr[i][q]=1;
				 bool=true;
			 }
		 }
		 int count=0;
		  for(int i=0;i<n;i++){
			  count+=visit(i);
		  }
		  if(bool)count--;
		 op.println(count);
		 op.close();
		}
	}
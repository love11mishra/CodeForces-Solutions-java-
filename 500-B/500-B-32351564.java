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

	  static int[][]grid;
	  static int n;
	  static void floyd(){
		  for(int i=0;i<n;i++){
			  for(int j=0;j<n;j++){
				  for(int k=0;k<n;k++){
					  if(grid[j][i]==1&&grid[i][k]==1)grid[j][k]=1;
				  }
			  }
		  }
	  }
	  public static void main(String[]args)throws IOException{
		 PrintWriter op =new PrintWriter(System.out);
		 n = Integer.parseInt(next());
		 int[]arr = new int[n];
		 grid = new int[n][n];
		 for(int i=0;i<n;i++)
			 arr[i] = Integer.parseInt(next());
		 for(int i=0;i<n;i++){
			 String s = next();
			 for(int j=0;j<n;j++){
				 grid[i][j]=Integer.parseInt(""+s.charAt(j));
			 }
		 }
		floyd();
		 for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(grid[i][j]==1&&arr[j]<arr[i]){
					int t=arr[j];
					arr[j]=arr[i];
					arr[i]=t;
				}
			}
			 
		 }
		 for(int i=0;i<n-1;i++)
			 op.print(arr[i]+" ");
		 op.print(arr[n-1]);
		 

		 		 op.close();
	  }
	}
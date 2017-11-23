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
	
	  static boolean [][]visited;
	  static int m,n,k,total=0,count=0;
	  static char[][]arr;
	  static void dfs(int r, int c){
		  if(r<0||r>=n||c<0||c>=m||arr[r][c]=='#'||visited[r][c])return;
		  if(arr[r][c]=='.'){count++;visited[r][c]=true;}
		  if(count>total-k&&arr[r][c]=='.'){
			  arr[r][c]='X';
		  }
		  
		  dfs(r,c+1);
		  dfs(r+1,c);
		  dfs(r,c-1);
		  dfs(r-1,c);
	  }
	  
	  public static void main(String[]args)throws IOException{
		 PrintWriter op =new PrintWriter(System.out);
		 n = Integer.parseInt(next());
		 m = Integer.parseInt(next());
		 k = Integer.parseInt(next());
		 arr = new char[n][m];
		 visited = new boolean[n][m];
		 int x=-1,y=-1;
		 for(int i=0;i<n;i++){
			 String s = next();
			 for(int j =0;j<m;j++){
				 arr[i][j]=s.charAt(j);
				 if(arr[i][j]=='.'){
					 total++;
					 if(x==-1){
						 x=i;y=j;
					 }
				 }
				
			 }
		 }
		 dfs(x,y);
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<m;j++)
				 op.print(arr[i][j]);
			 op.println();
		 }
		 
		 op.close();
		}
	}
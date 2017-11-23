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

    static int max(int a,int b){return a>b?a:b;}  
	
	static boolean[]visited;
	static ArrayList<Integer>[]adj;
	static ArrayList<Integer>check;
	
	static void dfs(int i){
	  if(visited[i])return;
	  check.add(i);
	  visited[i]=true;
	  for(int j:adj[i]){
		  dfs(j);
	  }
     }
	public static void main(String[]args)throws IOException{
		  PrintWriter op =new PrintWriter(System.out);
		  int n=Integer.parseInt(next());
		  int m=Integer.parseInt(next());
		  int k=Integer.parseInt(next());
		  int[]sc=new int[n];
		  int[]cols=new int[k];
		 
		  visited=new boolean[n];
		  adj=new ArrayList[n];
		 
		  for(int i=0;i<n;i++){
			  sc[i]=Integer.parseInt(next())-1;
			  adj[i]=new ArrayList<Integer>();
		  }
		 
		  for(int i=0;i<m;i++){
			  int l=Integer.parseInt(next())-1;
			  int r=Integer.parseInt(next())-1;
			  adj[l].add(r);
			  adj[r].add(l);
		  }
	
		int ans=0;
		 
		  for(int i=0;i<n;i++){
			if(!visited[i]){
				check=new ArrayList<Integer>();
				dfs(i);
				int maxc=0;
			for(int j:check){
				cols[sc[j]]++;
				maxc=max(maxc,cols[sc[j]]);
			}
		
			for(int j:check){
				cols[sc[j]]=0;
			}
			
			ans+=check.size()-maxc;
		}
	}
		
	    op.println(ans);
	    op.close();
		}
	}
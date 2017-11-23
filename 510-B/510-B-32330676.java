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
	/*static boolean isPalindrome(char[]a){
		for(int i=0,j=a.length-1;i<a.length;i++,j--)
			if(a[i]!=a[j])return false;
		return true;	
		
	}*/
    // static long gcd(long a,long b){return b==0?a:gcd(b,a%b);}  
   	
	/*  public static int lcm(int a,int b, int c){
        return lcm(lcm(a,b),c);
    }*/
    
   /* public static long lcm(long a, long b){
        return a*b/gcd(a,b);
    }*/
    //static int max(int a,int b){return a>b?a:b;}  
	//static int min(int a,int b){return a>=b?b:a;}  
	//static int mod=(int)1e9+7;
	
	/*static boolean isprime[]=new boolean[100015];
	  static void sieve(){
		Arrays.fill(isprime,true);
		boolean visited[]=new boolean[100015];
		isprime[0]=false;
		isprime[1]=false;
		for(int i=2;i*i<=100015;i++){
			visited[i]=true;
			for(int j=i*i;j<100015;j+=i){
				if(!visited[j]){
					visited[j]=true;
					isprime[j]=false;
				}
			}
		}
	}*/
	/*static int[] nextArray(int n,int x,int y){
		int []a=new int[n];
		for(int i=x;i<y;i++)
			a[i]=Integer.parseInt(next());
		return a;
	}*/
	/*static void ArrayPrint(int[]a){
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}*/
	/*static long modPow(long b,long p,long mod){
		long lead=1;
		while(p!=0){
			if((p&1)!=0){
				lead=lead*b%mod;
			}
			b=(b*b)%mod;
			p>>=1;
		}
		return lead;
	}*/
	  static int m,n;
	  static char[][]arr;
	  static boolean visited[][];
	  static boolean findCycle=false;
	  static int []dx = {1,-1,0,0};
	  static int []dy = {0,0,-1,1};
	  static void dfs(int i,int j,int fromI,int fromJ,char col){
		  if(i<0||i>=n||j<0||j>=m||arr[i][j]!=col)return;
		  
		  if(visited[i][j]){
			  findCycle = true;
			  return;
		  }
		  visited[i][j]=true;
		  
		  for(int p=0;p<4;p++){
			  int nextI = i+dx[p];
			  int nextJ = j+dy[p];
			  if(nextI==fromI&&nextJ==fromJ)continue;
			  dfs(nextI,nextJ,i,j,col);
			  
		  }
	  }
	 
	  public static void main(String[]args)throws IOException{
		 PrintWriter op =new PrintWriter(System.out);
		 n = Integer.parseInt(next());
		 m = Integer.parseInt(next());
		 arr = new char[n][m];
		 visited = new boolean[n][m];
		 for(int i=0;i<n;i++){
			 String s = next();
			 for(int j=0;j<m;j++)
				 arr[i][j]=s.charAt(j);
		 }
		 for(int i=0;i<n;i++)
			 for(int j=0;j<m;j++){
				if(!visited[i][j]){
					dfs(i,j,-1,-1,arr[i][j]);
				}
			 }
		 if(findCycle)op.println("Yes");
		 else op.println("No");
		 op.close();
		}
	}
/*class pair implements Comparable<pair>{
	int indx,freq;
	public pair(int i){
		indx=i;freq=0;
	}
	public int compareTo(pair that){
		return (this.freq-that.freq);
	}
}*/
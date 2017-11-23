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
   //static int gcd(int a,int b){return b==0?a:gcd(b,a%b);}  
   	
	/*  public static int lcm(int a,int b, int c){
        return lcm(lcm(a,b),c);
    }
    
    public static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }*/
    //static long max(long a,long b){return a>b?a:b;}  
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
 
 public static void main(String[]args)throws IOException{
  PrintWriter op =new PrintWriter(new BufferedOutputStream(System.out));
   int n=Integer.parseInt(next());
   int m=Integer.parseInt(next());
  char[][]a=new char[n][m];
 int[][]row=new int[n][m];
 int col[][]=new int[n][m];
 
  for(int i=0;i<n;i++)
	  a[i]=next().toCharArray();
  for(int i=0;i<n;i++)
  { for(int j=1;j<m;j++){
		  row[i][j]=row[i][j-1];
		  if(a[i][j]=='.'&&a[i][j-1]=='.')row[i][j]++;//op.print(row[i][j]+" ");
	  }//op.println();
  }
  for(int i=0;i<m;i++)
	  for(int j=1;j<n;j++){
		  col[j][i]=col[j-1][i];
		  if(a[j][i]=='.'&&a[j-1][i]=='.')col[j][i]++;
	  }
  int q=Integer.parseInt(next());
  while(q-->0){
	  int r1=Integer.parseInt(next())-1;
	  int c1=Integer.parseInt(next())-1;
	  int r2=Integer.parseInt(next())-1;
	  int c2=Integer.parseInt(next())-1;
	  int count=0;
	  for(int r=r1;r<=r2;r++)count+=row[r][c2]-row[r][c1];//op.println(count+"/");
	  for(int c=c1;c<=c2;c++)count+=col[r2][c]-col[r1][c];
	  op.println(count);
  }
	 	 op.close();
	}
}
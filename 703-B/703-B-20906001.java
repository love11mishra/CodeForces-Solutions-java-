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
	  
	static int[] nextArray(int n,int x,int y){
		int []a=new int[n];
		for(int i=x;i<y;i++)
			a[i]=Integer.parseInt(next());
			return a;
	}
	/*static void ArrayPrint(int[]a){
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}*/
 
 public static void main(String[]args)throws IOException{
  PrintWriter op =new PrintWriter(new BufferedOutputStream(System.out));
   int n=Integer.parseInt(next());
   int k=Integer.parseInt(next());
   int []c=nextArray(n,0,n);
   int []b=nextArray(k,0,k);
   boolean[]a=new boolean[n];
   for(int i=0;i<k;i++){
	   a[b[i]-1]=true;
   }
   long sum=0,ans=0;
   for(int i=0;i<n;i++)sum+=c[i];
   for(int i=0;i<k;i++){
	   ans+=c[b[i]-1]*(sum-c[b[i]-1]);
	   sum-=c[b[i]-1];
   }
  //op.println(ans);
   for(int i=0;i<n;i++){
	   if(!a[i]&&!a[(i+1)%n])ans+=c[i]*c[(i+1)%n];
   }
	op.println(ans); 
   op.close();
	}
}

class roads{
	int a,b,c;
	public roads(int a,int b,int[]c){
		this.a=a;this.b=b;this.c=c[a]*c[b];
	}
}
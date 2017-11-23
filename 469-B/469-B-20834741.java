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
   int p=Integer.parseInt(next());
   int q=Integer.parseInt(next());
   int l=Integer.parseInt(next());
   int r=Integer.parseInt(next());
   int [][]a=new int[p][2];
   int[][]b=new int[q][2];
   for(int i=0;i<p;i++){
	   a[i][0]=Integer.parseInt(next());
	   a[i][1]=Integer.parseInt(next());
	   }
   for(int i=0;i<q;i++){
	   b[i][0]=Integer.parseInt(next());
	   b[i][1]=Integer.parseInt(next());
	   }
   int count=0; boolean f=false;
   for(int k=l;k<=r;k++)
   {f=false;
   for(int j=0;j<q;j++){
	   
	   for(int i=0;i<p;i++){
		  if((b[j][0]+k>=a[i][0]&&b[j][0]+k<=a[i][1])||(b[j][1]+k>=a[i][0]&&b[j][1]+k<=a[i][1])||(b[j][0]+k<a[i][0]&&b[j][1]+k>a[i][1]))
		  {f=true;break;}
		}
	   if(f)break;
   }
   if(f)count++;
   }
   op.println(count);
   
	 	 op.close();
	}
}
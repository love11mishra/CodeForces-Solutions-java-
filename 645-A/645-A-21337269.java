/* Author LAVLESH */
import java.util.*;
import java.io.*;
import java.math.BigInteger;
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
  //  static int gcd(int a,int b){return b==0?a:gcd(b,a%b);}  
   	
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
        PrintWriter op =new PrintWriter(System.out);
	    StringBuilder sb=new StringBuilder();
	    String s=(next()+sb.append(next()).reverse());
	    sb=new StringBuilder(s);s=sb.append(s).toString();
	    String s1=(next()+sb.append(next()).reverse());
	    StringBuilder sb1=new StringBuilder();
	    StringBuilder sb2=new StringBuilder();
	    for(int i=0;i<4;i++){
	    	if(s1.charAt(i)!='X')sb1.append(s1.charAt(i));
	    }
	   // op.println(sb1);
	    int x=0;
	    while(s.charAt(x)!=sb1.charAt(0))x++;
	    //op.println(sb2.length());
	    while(sb2.length()!=3){
	    	if(s.charAt(x)!='X')sb2.append(s.charAt(x));
	    	x++;
	    }
	    //op.println(sb2);
	    if(sb1.toString().equals(sb2.toString()))op.println("YES");
	    else op.println("NO");
         op.close();
	}
}
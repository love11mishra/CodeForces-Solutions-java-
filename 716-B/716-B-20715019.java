/* Author LAVLESH */
import java.util.*;
import java.io.*;

public class B {
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
	String s=next();
  char[] ch=s.toCharArray();
	
	if(s.length()<26){
		System.out.println("-1");return;
	}
  for(int i=0;i<ch.length-25;i++){
		boolean []a=new boolean[26];
		int ct=0,q=0;
		for(int j=i;j<=i+25;j++){
			 if(ch[j]=='?')q++;
			 else if(!a[(int)(ch[j]-'A')])
				{ct++;a[(int)(ch[j]-'A')]=true;}
			
		}
		if(ct+q==26){
			
				int l=-1;
				for(int j=i;j<=i+25;j++){
					if(ch[j]=='?'){
						for(int p=l+1;p<26;p++){
							if(!a[p])
							{
								ch[j]=(char)(p+'A');
								l=p;
								p=26;
							}
						}
					}
				}
				for(int j=0;j<s.length();j++)
					{if(ch[j]=='?')op.print('A');
					else op.print(ch[j]);
					}
				op.flush();return;
		}
		
	}
	op.println("-1");
			op.close();
		}
}
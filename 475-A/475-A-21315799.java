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
  char[][]bus=new char[6][27];
  for(int i=0;i<6;i++)Arrays.fill(bus[i],' ');
  bus[0][0]='+';bus[5][0]='+';bus[0][25]='+';bus[5][25]='+';
  for(int i=1;i<25;i++){
	  bus[0][i]='-';
	  bus[5][i]='-';
  }
  for(int i=1;i<5;i++){
	  bus[i][0]='|';bus[i][25]='|';
	  bus[i][24]='.'; bus[i][23]='|';
  }
  bus[1][26]=')';bus[4][26]=')';
  bus[1][24]='D'; bus[3][23]='.';
 for(int i=1;i<5;i++)
	 for(int j=1;j<23;j++){
		 if(j%2==1)bus[i][j]='#';
		 else bus[i][j]='.';
	}
 for(int i=2;i<23;i++)bus[3][i]='.';
 int n=Integer.parseInt(next());
 int x=n-4;
 if(n<=4)
 for(int i=1;i<23;i++){
	 for(int j=1;j<5;j++){
		 if(n>0&&i%2==1){bus[j][i]='O';n--;}
		 if(n<=0)break;
	 }
	 if(n<=0)break;
 }
 else{
	 for(int i=1;i<23;i++){
		 for(int j=1;j<5;j++){
			 if(n>x&&i%2==1){bus[j][i]='O';n--;}
			 if(n<=x)break;
		 }
		 if(n<=x)break;
	 }
	 for(int i=3;i<23;i++){
		 for(int j=1;j<5;j++){
			 if(n>0&&i%2==1&&j!=3){bus[j][i]='O';n--;}
			 if(n<=0)break;
		 }
		 if(n<=0)break;
	 } 
 }
 int i,j;
 for( i=0;i<6;i++)
 {
 for(j=0;j<26;j++)
 {   
	 op.print(bus[i][j]);
 }
 if((i==1&&j==26)||(i==4&&j==26))op.print(bus[i][j]);
 op.println();
 }
  op.close();
	}
}
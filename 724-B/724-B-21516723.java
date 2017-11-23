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

	static int[][]swapcols(int[][]a,int c1,int c2){
		int[][]ret=new int[a.length][];
		for(int i=0;i<ret.length;i++){
			ret[i]=a[i].clone();
			int temp=ret[i][c1];
			ret[i][c1]=ret[i][c2];
			ret[i][c2]=temp;
		}
		return ret;
	}
	static int misplaced(int[]a){
		int count=0;
		for(int i=0;i<a.length;i++)
			count+= a[i]==(i+1)?0:1;
		return count;
	}
	public static void main(String[]args)throws IOException{
		  PrintWriter op =new PrintWriter(System.out);
		int n=Integer.parseInt(next());
		int m=Integer.parseInt(next());
		int [][]a=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				a[i][j]=Integer.parseInt(next());
		}
		for(int c1=0;c1<m;c1++){
			for(int c2=c1;c2<m;c2++){
				int[][]b=swapcols(a,c1,c2);
				boolean ok=true;
				for(int i=0;i<n;i++)
					ok &= misplaced(b[i])<=2;
				if(ok){
					System.out.println("YES");
					return;
				}
			}
		}
		op.println("NO");
		 op.close();
		}
	}
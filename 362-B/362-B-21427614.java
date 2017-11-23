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

	  public static void main(String[]args)throws IOException{
        PrintWriter op =new PrintWriter(System.out);
	    int n=Integer.parseInt(next());
	    int m=Integer.parseInt(next());
	    if(m==0){System.out.println("YES");return;}
	    int[]a=new int[m];
	    for(int i=0;i<m;i++)
	    	a[i]=Integer.parseInt(next());
	    Arrays.sort(a);
	    if(a[0]==1||a[m-1]==n){System.out.println("NO");return;}
	    for(int j=0;j<m-2;j++){
	    	if(a[j]+1==a[j+1]&&a[j+2]==a[j+1]+1){
	    		System.out.println("NO");return;
	    	}
	    }
	    op.println("YES");
	    op.close();
	}
}
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
		 int[]a=new int[n];
		 pair[]p=new pair[m];
	     for(int i=0;i<m;i++)
	    	 p[i]=new pair(i);
	     int x=n/m,last=n%m>0?1:0;
	     for(int i=0;i<n;i++){
	    	 a[i]=Integer.parseInt(next())-1;
	         if(a[i]<m)p[a[i]].freq++;
	     }
	     int change=0;StringBuilder sb=new StringBuilder();
	     for(int i=0,c=0;i<n;i++){
	    	 int aa=a[i];
	    	 while(c<m && p[c].freq>=x)
	    		 c++;
	    	 if(c<m && (aa>=m||p[aa].freq>x)){
	    		 sb.append((c+1)+" ");
	    		 p[c].freq++;
	    		 if(aa<m)p[aa].freq--;
	    		 change++;
	    	 }
	    	 else sb.append((aa+1)+" ");
	    	
	     }
	     op.println(x+" "+change);
	     op.println(sb);
		 op.close();
		}
	}
class pair implements Comparable<pair>{
	int indx,freq;
	public pair(int i){
		indx=i;freq=0;
	}
	public int compareTo(pair that){
		return (this.freq-that.freq);
	}
}
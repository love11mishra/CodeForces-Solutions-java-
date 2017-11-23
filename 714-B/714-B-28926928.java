/* Author LAVLESH */
//package practice;
import java.util.*;
import java.io.*;

public class main {
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

	/*  static int[] nextArray(int n,int x,int y){
		int []a=new int[n];
		for(int i=x;i<y;i++)
			a[i]=Integer.parseInt(next());
		return a;
	}*/
	  
   public static void main(String[]args)throws IOException{
    PrintWriter op =new PrintWriter(System.out);
    int n=Integer.parseInt(next());
    Set<Integer> s = new HashSet<Integer>();
    for(int i=0;i<n;i++){
    	s.add(Integer.parseInt(next()));
    }
    if(s.size()>3) op.println("NO");
    else{
    	Integer []a=Arrays.copyOf(s.toArray(), s.toArray().length, Integer[].class);
    	Arrays.sort(a);
    	if(a.length==3&&(a[2]-a[1])==a[1]-a[0])
    		op.println("YES");
    	else if((a.length<=2))
    		op.println("YES");
    	else op.println("NO");
    }
   op.close();
	}
}
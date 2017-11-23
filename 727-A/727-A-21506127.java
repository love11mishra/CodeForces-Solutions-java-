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
		  int a=Integer.parseInt(next());
		  int b=Integer.parseInt(next());
		  ArrayList<Integer>q=new ArrayList<Integer>();
		  while(b>=a){
			  q.add(b);
			 if(b!=a)
			  { if(b%10!=1&&(b%10)%2==1){
				  System.out.println("NO");return;
			  }
			  else if((b%10)%2==0)b/=2;
			  else b/=10;
			  }
			 else break;
		  }
		  Object[]as=q.toArray();
		  Arrays.sort(as);
			 if(a==b){ op.println("YES");
			  op.println(as.length);
			  for(int i=0;i<as.length;i++){
				  op.print(as[i]+" ");
			  }
			 }
			 else op.println("NO");
		  
	    op.close();
		}
	}
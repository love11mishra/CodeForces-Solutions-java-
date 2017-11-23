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

    static int max(int a,int b){return a>b?a:b;}  

	  public static void main(String[]args)throws IOException{
		  PrintWriter op =new PrintWriter(System.out);
		  int n=Integer.parseInt(next());
		  String s=br.readLine();
	   	  ArrayList<String>ar=new ArrayList<String>();
		  int ans1=0,ans2=0;
		  
		  for(int i=0;i<n;i++){
			 char c=s.charAt(i);
		 
		 	 if(c=='('){
				int x=i+1;
				 while(s.charAt(i)!=')')i++;
				 ar.add(s.substring(x,i));
			 }
		
		 }
		
		  String[]sar=s.split("\\([\\w\\_]*\\)");
		 
		  for(String st:ar){
			  String[]st1=st.split("_");
		
			  for(int i=0;i<st1.length;i++)
				  if(st1[i].length()>=1)ans2++;
		  }
		  
		  
		  for(int i=0;i<sar.length;i++){
			  String []sar1=sar[i].split("_");
		
			  for(int j=0;j<sar1.length;j++)
				  ans1=max(ans1,sar1[j].length());
		  }
		
		  op.println(ans1+" "+ans2);
	    
	    op.close();
		}
	}
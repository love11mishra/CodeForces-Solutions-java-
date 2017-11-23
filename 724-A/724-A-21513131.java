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
		 HashMap<String,Integer>hm=new HashMap<String,Integer>();
		 int i=0;
		 hm.put("monday",i++);
		 hm.put("tuesday",i++);
		 hm.put("wednesday",i++);
		 hm.put("thursday",i++);
		 hm.put("friday",i++);
		 hm.put("saturday",i++);
		 hm.put("sunday",i++);
		 String f=next();
		 String s=next();
		 int x=(hm.get(s)-hm.get(f))>=0?(hm.get(s)-hm.get(f)):7+(hm.get(s)-hm.get(f));
		 if(31%7==x||30%7==x||28%7==x)
			 op.println("YES");
		 else op.println("NO");
		 op.close();
		}
	}
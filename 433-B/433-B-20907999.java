/* Author LAVLESH */
import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] c = new int[n];
		Integer[] b = new Integer[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0;i<n;i++){
			c[i] = Integer.parseInt(st.nextToken());
			b[i] = c[i];
		}
		Arrays.parallelSort(b);
		long[] d = new long[n+1];
		long[] a = new long[n+1];
		for(int i = 0;i<n;i++){
			d[i+1]+=c[i];
			a[i+1]+=b[i];
			d[i+1]+=d[i];
			a[i+1]+=a[i];
		}
		
		int q = Integer.parseInt(br.readLine());
		PrintWriter out = new PrintWriter(System.out);
		for(int i = 0;i<q;i++){
			st = new StringTokenizer(br.readLine());
			int type = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			if(type == 1){
				out.println(d[r]-d[l-1]);
			}
			else{
				out.println(a[r]-a[l-1]);
			}
		}
		out.close();
	}
}
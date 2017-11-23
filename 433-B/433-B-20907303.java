import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());
        
        st=new StringTokenizer(br.readLine());
        int m=Integer.parseInt(br.readLine());
        Integer a[]=new Integer[n+1];
        a[0]=0;
        long b1[]=new long[n+1];
        long b2[]=new long[n+1];
        for(int i=1;i<=n;i++)
        {
            a[i]=Integer.parseInt(st.nextToken());
            b1[i]=b1[i-1]+a[i];
        }
        Arrays.sort(a);
        for(int i=1;i<=n;i++)
            b2[i]=a[i]+b2[i-1];
        for(int i=0;i<m;i++)
        {
            st=new StringTokenizer(br.readLine());
            int ca=Integer.parseInt(st.nextToken());
            int t1=Integer.parseInt(st.nextToken());
            int t2=Integer.parseInt(st.nextToken());
            if(ca==1)
            {
                long t=b1[t2]-b1[t1-1];
                System.out.println(t);
            }
            if(ca==2)
            {
                long t=b2[t2]-b2[t1-1];
                System.out.println(t);
            }
        }
    }
}
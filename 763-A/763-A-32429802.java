import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Lavlesh
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Reader in = new Reader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Reader in, PrintWriter out) {
            int n = Integer.parseInt(in.next());
            int a[] = new int[n];
            int[] b = new int[n];
            int[] col = new int[n + 1];
            int[] deg = new int[n + 1];
            for (int i = 1; i <= n - 1; i++) {
                a[i] = Integer.parseInt(in.next());
                b[i] = Integer.parseInt(in.next());
            }
            for (int i = 1; i <= n; i++) {
                col[i] = Integer.parseInt(in.next());
            }
            int count = 0;
            for (int i = 1; i < n; i++) {
                if (col[a[i]] != col[b[i]]) {
                    count++;
                    deg[a[i]]++;
                    deg[b[i]]++;
                }
            }
            boolean found = false;
            for (int i = 1; i <= n; i++) {
                if (deg[i] == count) {
                    found = true;
                    out.println("YES");
                    out.println(i);
                    break;
                }
            }
            if (!found) out.println("NO");
        }

    }

    static class Reader {
        static BufferedReader br;
        static StringTokenizer st;

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

        public Reader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            st = new StringTokenizer("");
        }

    }
}
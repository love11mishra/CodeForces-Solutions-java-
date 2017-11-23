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
            String s1 = in.next();
            String s2 = in.next();
            int n1 = s2.charAt(0) - s1.charAt(0);
            int n2 = s2.charAt(1) - s1.charAt(1);
            int tot = Math.max(Math.abs(n1), Math.abs(n2));
            out.println(tot);
            for (int i = 0; i < tot; i++) {
                String str = "";
                if (n1 > 0) {
                    str += 'R';
                    n1--;
                }
                if (n1 < 0) {
                    str += 'L';
                    n1++;
                }
                if (n2 > 0) {
                    str += 'U';
                    n2--;
                }
                if (n2 < 0) {
                    str += 'D';
                    n2++;
                }
                out.println(str);

            }
        }

    }

    static class Reader {
        BufferedReader br;
        StringTokenizer st;

        public String next() {
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
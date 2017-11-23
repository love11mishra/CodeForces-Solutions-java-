import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        int n;
        ArrayList<Integer>[] list;

        private double dfs(int v, int par) {
            double sum = 0;
            for (int x : list[v]) {
                if (x != par)
                    sum += dfs(x, v) + 1;
            }
            if (par == -1)
                return sum != 0 ? sum / (list[v].size()) : 0;
            else
                return sum != 0 ? sum / (list[v].size() - 1) : 0;

        }

        public void solve(int testNumber, Reader in, PrintWriter out) {
            n = Integer.parseInt(in.next());
            list = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                list[i] = new ArrayList<Integer>();
            }
            for (int i = 1; i < n; i++) {
                int x = Integer.parseInt(in.next()) - 1;
                int y = Integer.parseInt(in.next()) - 1;
                list[x].add(y);
                list[y].add(x);
            }
            System.out.printf("%.9f", dfs(0, -1));
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
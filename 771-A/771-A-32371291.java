import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public boolean[] visited;
        ArrayList<ArrayList<Integer>> adj;
        double vc;
        double ec;

        public void dfs(int i) {
            if (visited[i]) return;
            visited[i] = true;
            vc++;
            for (int x : adj.get(i)) {
                dfs(x);
                ec++;
            }
        }

        public void solve(int testNumber, Reader in, PrintWriter out) {
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            visited = new boolean[n];
            adj = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<Integer>());
            }
            for (int i = 0; i < m; i++) {
                int x = Integer.parseInt(in.next()) - 1;
                int y = Integer.parseInt(in.next()) - 1;
                adj.get(x).add(y);
                adj.get(y).add(x);
            }
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                //out.println(adj.get(i).size());
                if (visited[i] || adj.get(i).size() == 0) continue;
                ec = 0;
                vc = 0;

                dfs(i);
                ec /= 2;
                //out.println(ec+" "+vc);
                if (ec != (vc * (vc - 1) / 2)) {
                    flag = false;
                }
            }
            if (flag) out.println("YES");
            else out.println("NO");
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
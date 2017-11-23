import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Vector;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
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
        ArrayList<ArrayList<Integer>> list;
        boolean impossible;
        boolean[] visited = new boolean[26];
        boolean[] onstack = new boolean[26];
        Stack<Integer> stack = new Stack<Integer>();
        int n;

        public int min(int i, int j) {
            return i < j ? i : j;
        }

        public void tsort(int i) {

            visited[i] = true;
            onstack[i] = true;
            for (int x : list.get(i)) {
                if (onstack[x]) {
                    impossible = true;
                    return;
                }
                if (!visited[x]) tsort(x);
            }
            onstack[i] = false;
            stack.push(i);
        }

        public void solve(int testNumber, Reader in, PrintWriter out) {
            list = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < 26; i++)
                list.add(new ArrayList<Integer>());
            n = Integer.parseInt(in.next());
            impossible = false;
            String s = in.next();
            for (int i = 1; i < n; i++) {
                String s1 = in.next();
                int min = min(s.length(), s1.length());
                if (s.startsWith(s1)) {
                    impossible = true;
                } else {
                    for (int j = 0; j < min; j++) {
                        if (s1.charAt(j) != s.charAt(j)) {
                            list.get(s.charAt(j) - 'a').add(s1.charAt(j) - 'a');
                            j = min;
                        }

                    }
                }

                s = s1;
            }
            for (int i = 0; i < 26; i++) {
                if (!visited[i])
                    tsort(i);
            }
            if (impossible) out.println("Impossible");
            else {
                while (!stack.isEmpty())
                    out.print((char) (stack.pop() + 'a'));
            }
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
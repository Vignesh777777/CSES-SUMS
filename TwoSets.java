import java.io.*;
import java.util.*;

public class TwoSets{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        long n = Long.parseLong(br.readLine());
        long sum = (n * (n + 1)) / 2;

        if (sum % 2 != 0) {
            pw.println("NO");
        } else {
            pw.println("YES");
            long tsum = sum / 2;
            long c = 0;
            ArrayList<Long> a1 = new ArrayList<>();
            ArrayList<Long> a2 = new ArrayList<>();

            for (long i = n; i >= 1; i--) {
                if (c + i <= tsum) {
                    a1.add(i);
                    c += i;
                } else {
                    a2.add(i);
                }
            }

            pw.println(a1.size());
            for (int i = 0; i < a1.size(); i++) {
                pw.print(a1.get(i) + " ");
            }
            pw.println();

            pw.println(a2.size());
            for (int i = 0; i < a2.size(); i++) {
                pw.print(a2.get(i) + " ");
            }
            pw.println();
        }

        pw.flush();
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class NumberSpiral {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int testCases = Integer.parseInt(br.readLine());
        while (testCases-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            long ans;
            if (x >= y) {
                if (x % 2 == 0) {
                    ans = x * x - y + 1;
                } else {
                    ans = (x - 1) * (x - 1) + y;
                }
            } else {
                if (y % 2 == 0) {
                    ans = (y - 1) * (y - 1) + x;
                } else {
                    ans = y * y - x + 1;
                }
            }
            pw.println(ans);
        }
        pw.flush();
    }
}
import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class DistinctSubarrays {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long count = 0;
        int l = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (set.contains(arr[right])) {
                set.remove(arr[l]);
                l++;
            }
            set.add(arr[right]);
            count += (long) (right - l + 1);
        }

        pw.println(count);
        pw.flush();
    }
}
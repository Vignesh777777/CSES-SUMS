import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class MaximumSubarraySum {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long sum = 0;
        long ans = Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            long a = Long.parseLong(st.nextToken());
            sum+=a;
            ans = Math.max(ans,sum);
            if(sum<0) {
                sum = 0;
            }
        }
        pw.println(ans);
        pw.flush();
    }
}

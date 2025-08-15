import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StickLengths {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long[] a = new long[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(a);
        long median = a[n/2];
        long sum = 0;
        for(int i=0;i<n;i++){
            if(i!=n/2){
                sum+=Math.abs(median-a[i]);
            }
        }
        pw.println(sum);
        pw.flush();
    }
}

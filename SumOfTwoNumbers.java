import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SumOfTwoNumbers {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long x = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        HashMap<Long,Integer> map= new HashMap<>();
        boolean f1 = false;
        for(int i=0;i<n;i++) {
            long a = Long.parseLong(st.nextToken());
            if (map.containsKey(x - a)) {
                System.out.println((map.get(x - a) + 1) + " " + (i + 1));
                f1 = true;
                break;
            }
            map.put(a, i);
        }
            if(!f1){
                System.out.println("IMPOSSIBLE");
        }

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class ConcertTickets {
    public static void main(String[] args) throws IOException{
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int m = fr.nextInt();
        ArrayList<Long> h = new ArrayList<>();
        long[] p = new long[m];
        for(int i=0;i<n;i++){
            h.add(fr.nextLong());
        }
        for(int i=0;i<m;i++){
            p[i] = fr.nextLong();
        }
        Collections.sort(h);
        int r=n-1;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<m;i++){
            if(!set.contains(h.indexOf(p[i])) && h.contains(p[i])){
                System.out.println(p[i]);
                set.add(h.indexOf(p[i]));
                continue;
            }else{
                if(h.get(r)>p[i]){
                    r--;
                    if(r==-1){
                        System.out.println("-1");
                        r = n-1;
                        continue;
                    }
                    i--;
                }else{
                    if(!set.contains(r)) {
                        System.out.println(h.get(r));
                        set.add(r);
                        r = n-1;
                        continue;
                    }else{
                        r--;
                        if(r==-1){
                            System.out.println("-1");
                            r = n-1;
                            continue;
                        }
                    }
                }
            }
        }

    }
     static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}

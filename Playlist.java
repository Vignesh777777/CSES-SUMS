import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Playlist {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long ans = 0;
        int l = 0;
        HashMap<Long,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            long a = Long.parseLong(st.nextToken());
            if(map.containsKey(a)){
                l = Math.max(l,map.get(a)+1);
            }
            map.put(a,i);
            ans = Math.max(ans,i-l+1);
        }
        pw.println(ans);
        pw.flush();
    }
}

import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class CollectingNumbers {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        TreeMap<Integer,Integer> map = new TreeMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            map.put(Integer.parseInt(st.nextToken()),i);
        }
        int ans = n;
        for(int i=1;i<n;i++){
            if(map.get(i)<map.get(i+1)){
                ans--;
            }
        }
        pw.println(ans);
        pw.flush();
    }
}

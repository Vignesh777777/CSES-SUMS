import java.io.*;
import java.util.HashSet;

public class DistinctNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        HashSet<Long> set = new HashSet<>();
        for(String s : nums){
            set.add(Long.parseLong(s));
        }
        System.out.println(set.size());
    }
}

import java.util.Scanner;

public class DiceCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n+1];
        long sum = 1;
        long mod = 1000000007;
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            dp[i] = sum%mod;
            sum+=dp[i];
            if(i>=6){
                sum-=dp[i-6];
            }
            sum = Math.floorMod(sum,mod);
        }
        System.out.println(dp[n]);
    }
}

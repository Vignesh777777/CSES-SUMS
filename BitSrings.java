import java.util.Scanner;

public class BitSrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long MOD = 1000000007;
        long base = 2;
        long ans = 1;
        while(n>0){
            if(n%2==1){
                ans = (ans*base)%MOD;
            }
            base = (base*base)%MOD;
            n = n/2;
        }
        System.out.println(ans);
    }
}

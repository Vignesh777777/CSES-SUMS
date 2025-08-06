import java.util.Scanner;

public class TrailingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long base = 5;
        long ans = 0;
        while(base<=n){
            ans+=(n/base);
            base = base*5;
        }
        System.out.println(ans);
    }
}

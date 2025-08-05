import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n - 1];
        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
        }
        long sum1 = (long) n * (n + 1) / 2;
        System.out.println(sum1 - sum);
    }
}

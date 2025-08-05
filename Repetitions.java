import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l=0,r=0;
        int max = 0;
        while(r<s.length()){
            if(s.charAt(r)==s.charAt(l)){
                max = Math.max(max,r-l+1);
            }else{
                l=r;
            }
            r++;
        }
        System.out.println(max);
    }
}

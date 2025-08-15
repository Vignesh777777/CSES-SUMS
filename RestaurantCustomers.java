import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class RestaurantCustomers {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        TreeMap<Long,Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            map.put(Long.parseLong(st.nextToken()),0);
            map.put(Long.parseLong(st.nextToken()),1);
        }
        long c = 0;
        long ans = Long.MIN_VALUE;
        for(Long k : map.keySet()){
            if(map.get(k)==0){
                c++;
            }else{
                c--;
            }
            ans = Math.max(ans,c);
        }
        System.out.println(ans);
    }
}

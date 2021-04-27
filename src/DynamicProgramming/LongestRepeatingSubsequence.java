package DynamicProgramming;

import java.util.Arrays;

public class LongestRepeatingSubsequence {

    static int[][] mem;

    public static void main(String[] args) {
        String s = "aabebcdd";
        //System.out.println(lrs(s, s, s.length(), s.length()));
        mem = new int[s.length() + 1][s.length() + 1];
        for(int i = 0;i<mem.length;i++){
            Arrays.fill(mem[i], - 1);
        }
        lrsMem(s, s, s.length(), s.length());
        System.out.println(mem[s.length() - 1][s.length() - 1]);
    }
    private static int lrs(String s1, String s2, int n, int m){
        if(n == 0 || m == 0){
            return 0;
        }
        if(s1.charAt(n - 1) == s2.charAt(m - 1)){
            if(n != m){
                return 1 + lrs(s1, s2, n - 1, m - 1);
            }
        }
        return Math.max(lrs(s1, s2, n - 1, m), lrs(s1, s2, n, m - 1));
    }
    private static int lrsMem(String s1, String s2, int n, int m){
        if(n == 0 || m == 0){
            return 0;
        }
        if(mem[n - 1][m - 1] != -1){
            return mem[n - 1][m - 1];
        }
        if(s1.charAt(n - 1) == s2.charAt(m - 1)){
            if(n != m){
                mem[n - 1][m - 1] = 1 + lrs(s1, s2, n - 1, m - 1);
                return mem[n - 1][m - 1];
            }
        }
        mem[n - 1][m - 1] = Math.max(lrs(s1, s2, n - 1, m), lrs(s1, s2, n, m - 1));
        return mem[n - 1][m - 1];
    }
}

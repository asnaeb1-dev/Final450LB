package DynamicProgramming;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(lps(str, str, str.length(), str.length()));
    }
    private static int lps(String s1, String s2, int n, int m){
        int[][] table = new int[n + 1][m + 1];
        for(int i = 1;i<n ;i++){
            for(int j = 1;j<m;j++){
                if(s1.charAt(i ) == s2.charAt(j )){
                    table[i][j] = 1 + table[i - 1][j - 1];
                }else{
                    table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
                }
            }
        }
        return table[n][m];
    }
}

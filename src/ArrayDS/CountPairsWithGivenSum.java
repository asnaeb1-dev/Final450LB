package ArrayDS;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        System.out.println(getPairsCount(arr, arr.length, 6));
    }
    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }
        int c = 0;
        for(int i : arr){
            if(map.containsKey(k - i)){
                c+=map.get(i);
            }
        }
        return c;
    }
}

package ArrayDS;

import java.util.LinkedHashMap;
import java.util.Map;

public class CheckIfAnArraySubsetOfAnother {
    public static void main(String[] args) {
        long[] a = {11, 1, 13, 21, 3, 7};
        long[] b = {11, 3, 7, 1};
        System.out.println(isSubset(a, b, a.length, b.length));
    }
    public static String isSubset( long a1[], long a2[], long n, long m) {
        LinkedHashMap<Long, Long> map1 = new LinkedHashMap<>();
        for(long i : a1){
            if(map1.containsKey(i)){
                map1.put(i, map1.get(i) + 1);
            }else{
                map1.put(i, 1L);
            }
        }

        for(long i : a2){
            if(map1.containsKey(a2) && map1.get(i) != 0){
                map1.put(i, map1.get(i) - 1);
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}

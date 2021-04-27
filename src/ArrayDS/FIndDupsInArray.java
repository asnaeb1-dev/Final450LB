package ArrayDS;

import java.util.LinkedHashMap;
import java.util.Map;

public class FIndDupsInArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4};
        System.out.println(findDup(a));
    }
    private static int findDup(int[] a){
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i]) + 1);
            }else{
                map.put(a[i], 1);
            }
        }
        int max = 0, max_el = -1;
        for(Map.Entry key : map.entrySet()){
            int x =(int) key.getValue();
            if(x > max){
                max = x;
                max_el = (int) key.getKey();
            }
        }
        return max_el;
    }
}

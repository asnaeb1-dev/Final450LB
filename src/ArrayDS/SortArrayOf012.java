package ArrayDS;

import java.util.Arrays;
//sort an array of 0, 1, and 2s
public class SortArrayOf012 {
    public static void main(String[] args) {
        int[] a = {2, 0, 1, 1, 1, 1, 2, 2, 2, 0, 0, 0, 0, 2, 1, 1,1 ,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    private static void sort(int[] a){
        int c0 = 0, c1 = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i] == 0){
                c0++;
            }else if(a[i] == 1){
                c1++;
            }
        }
        int k = 0;
        while(c0 != 0){
            a[k] = 0;
            c0--;
            k++;
        }
        while(c1 != 0){
            a[k] = 1;
            c1--;
            k++;
        }
        while(k != a.length){
            a[k] = 2;
            k++;
        }
    }
}

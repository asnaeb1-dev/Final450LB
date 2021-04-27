package ArrayDS;

import java.util.Arrays;

public class KthMinMax {
    public static void main(String[] args) {
        int[] a = {3, 5, 2, 7, 9, 1, 0, 8, 16};
        System.out.println(Arrays.toString(findKth(a, 4)));
    }
    private static int[] findKth(int[] a, int k){
        Arrays.sort(a);
        int[] res = new int[2];
        res[0] = a[k - 1];
        res[1] = a[a.length - k - 1];
        return res;
    }
}

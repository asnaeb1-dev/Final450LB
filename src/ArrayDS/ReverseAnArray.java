package ArrayDS;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 6};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    //time complexity -> O(n)
    //space complexity -> O(1)
    private static void reverse(int[] a){
        for(int i = 0;i<a.length / 2;i++){
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - 1 - i] = temp;
        }
    }
}

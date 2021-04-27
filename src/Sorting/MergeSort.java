package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {2, 4, 1, 3, 5};
        MergeSort m = new MergeSort();
        m.mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    void mergeSort(int[] a, int l, int r){
        if(l < r){
            int mid = l + (r - l)/2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            merge(a, l, r, mid);
        }
    }
    void merge(int[] a, int l, int r, int m){
        int n1 = m - l + 1, n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0;i<n1;i++){
            left[i] = a[l + i];
        }
        for(int i = 0;i<n2;i++){
            right[i] = a[m + 1 + i];
        }
        int i = 0, j = 0, k = l;
        while(i != n1 && j != n2){
            if(left[i] <= right[j]){
                a[k] = left[i];
                i++;

            }else {
                a[k] = right[j];
                j++;
            }
            k++;
        }
        while(i != n1){
            a[k] = left[i];
            k++;
            i++;
        }
        while(j != n2){
            a[k] = right[j];
            j++;
            k++;
        }
    }
}

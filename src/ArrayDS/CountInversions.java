package ArrayDS;

import Sorting.MergeSort;

public class CountInversions {
    public static void main(String[] args) {
        int[] a = {2, 4, 1, 3, 5};
        //System.out.println(count(a, a.length));
        CountInversions c = new CountInversions();
        int cx = c.mergeSort(a, 0, a.length - 1);
        System.out.println(cx);
    }
    //Time - O(n^2)
    //Space - O(1)
    private static int count(int[] a, int n){
        int c = 0;
       for(int i = 0;i<n - 1;i++){
           for(int j = i;j<n;j++){
               if(a[i] > a[j]){
                   c++;
               }
           }
       }
        return c;
    }

    private int mergeSort(int[] a, int l, int r){
        int res = 0;
        if(l < r){
            int mid = l + (r - l)/2;
            res+=mergeSort(a, l, mid);
            res+=mergeSort(a, mid + 1, r);
            res+=merge(a, l, r, mid);
        }
        return res;
    }
    private int merge(int[] a, int l, int r, int m){
        int n1 = m - l + 1, n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int res = 0;
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
                //V>IMP!
                // the significance of this line : this line tells us that the element on the right arr is less than the element on the left arr at the given index
                // An inversion is detected. Naturally we do res + 1; but here we need to take into consideration that the left arr is already sorted and all the
                // other elements after this will also suffer from the same inversion. hence we add all the inversions at the same time by doing (n1 - i)
                res+=(n1 - i);
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
        return res;
    }
}

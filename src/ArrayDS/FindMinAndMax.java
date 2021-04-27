package ArrayDS;

public class FindMinAndMax {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 6, 1, 0, -98};
        findMinMax(a);
    }
    private static void findMinMax(int[] a){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0;i<a.length;i++){
            max = Math.max(a[i], max);
            min = Math.min(a[i], min);
        }
        System.out.println("Maximum value- " + max + " Minimum Value- "+ min);
    }
}

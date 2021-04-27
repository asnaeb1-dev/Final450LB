package ArrayDS;

/**KADANES
 * Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
 *
 *
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * arr[] = {1,2,3,-2,5}
 * Output:
 * 9
 * Explanation:
 * Max subarray sum is 9
 * of elements (1, 2, 3, -2, 5) which
 * is a contiguous subarray.
 * Example 2:
 *
 * Input:
 * N = 4
 * arr[] = {-1,-2,-3,-4}
 * Output:
 * -1
 * Explanation:
 * Max subarray sum is -1
 * of element (-1)
 */
public class MaxiumumSubArraySum {
    public static void main(String[] args) {

    }
    private static int max(int[] arr, int n){
        int M = arr[0];
        int maxEnding = arr[0];
        for(int i = 1;i<n;i++){
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            M = Math.max(M, maxEnding);
        }
        return M;
    }
}

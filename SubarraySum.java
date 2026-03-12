public class SubarraySum {

    public static void subarraySum(int[] n) {
int maxsum= Integer.MIN_VALUE;
int minsum= Integer.MAX_VALUE;
        for (int i = 0; i < n.length; i++) {
            int sum = 0;
            for (int j = i; j < n.length; j++) {
                sum += n[j];
                if (sum > maxsum) {
                    maxsum = sum;
                }
                if (sum < minsum) {
                    minsum = sum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxsum);
        System.out.println("Minimum Subarray Sum: " + minsum);
    }

    public static void main(String[] args) {
        int[] n = {2, -1, 3};
        subarraySum(n);
    }
}
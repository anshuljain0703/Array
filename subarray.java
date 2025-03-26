public class subarray {

    // Method to calculate prefix sums
    public static int[] prefixsum(int[] a) {
        int[] ps = new int[a.length];
        ps[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            ps[i] = ps[i - 1] + a[i];
        }
        return ps;
    }

    // Method to calculate suffix sums
    public static int[] suffixsum(int[] a) {
        int n = a.length;
        int[] ss = new int[n];
        ss[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ss[i] = ss[i + 1] + a[i];
        }
        return ss;
    }

    // Method to check if any prefix sum equals any suffix sum
    static boolean isEqualSum(int[] a) {
        int[] ps = prefixsum(a); // Compute prefix sums
        int[] ss = suffixsum(a); // Compute suffix sums

        for (int i = 0; i < ps.length; i++) {
            for (int j = 0; j < ss.length - 1; j++) { // Avoid out-of-bounds for ss[j+1]
                if (ps[i] == ss[j + 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 3, 4, 5, 6};

        if (isEqualSum(a)) {
            System.out.println("There exists a prefix sum equal to a suffix sum.");
        } else {
            System.out.println("No prefix sum equals a suffix sum.");
        }
    }
}

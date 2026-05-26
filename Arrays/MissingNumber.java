public class MissingNumber {

    static int missingNum(int arr[], int n) {

        long total = (long) n * (n + 1) / 2;

        long sum = 0;

        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        return (int) (total - sum);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5};
        int n = 5;

        int ans = missingNum(arr, n);

        System.out.println("Missing Number: " + ans);
    }
}
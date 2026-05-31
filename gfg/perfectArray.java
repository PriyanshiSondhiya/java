public class perfectArray {

    static boolean checkPerfect(int[] arr) {
        int n = arr.length;
        int i = 1;

        // Increasing part
        while (i < n && arr[i] > arr[i - 1]) {
            i++;
        }

        // Equal part
        while (i < n && arr[i] == arr[i - 1]) {
            i++;
        }

        // Decreasing part
        while (i < n && arr[i] < arr[i - 1]) {
            i++;
        }

        return i == n;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 8, 8, 3, 2};

        if (checkPerfect(arr)) {
            System.out.println("Perfect Array");
        } else {
            System.out.println("Not Perfect Array");
        }
    }
}
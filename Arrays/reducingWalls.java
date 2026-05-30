public class reducingWalls {

    public static int reducingWalls(int[] arr, int k) {
        int operations = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > k) {
                operations += (arr[i] - 1) / k;
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 6, 8};
        int k = 5;

        System.out.println(reducingWalls(arr, k));
    }
}
import java.util.*;

public class countElements {

    public static int countElements(int[] arr) {
        int count = 1;
        int maxi = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxi) {
                count++;
                maxi = arr[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 28, 50, 13};

        System.out.println(countElements(arr));
    }
}
import java.util.*;

public class Main {

    public static boolean canPlace(int[] stalls, int cows, int dist) {
        int count = 1;
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= dist) {
                count++;
                lastPos = stalls[i];
            }
            if (count == cows) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // 🔥 Hardcoded input
        int[] stalls = {1, 2, 8, 4, 9};
        int cows = 3;

        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlace(stalls, cows, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Maximum minimum distance: " + ans);
    }
}
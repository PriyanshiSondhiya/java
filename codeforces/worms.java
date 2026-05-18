import java.util.*;

public class worms {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int pile[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            pile[i] = sc.nextInt();
        }

        int prefix[] = new int[n + 1];

        prefix[1] = pile[1];

        for (int i = 2; i <= n; i++) {
            prefix[i] = prefix[i - 1] + pile[i];
        }

        int m = sc.nextInt();

        for (int i = 1; i <= m; i++) {

            int q = sc.nextInt();

            int low = 1;
            int high = n;
            int ans = -1;

            while (low <= high) {

                int mid = (low + high) / 2;

                if (prefix[mid] >= q) {
                    ans = mid;
                    high = mid - 1; // left side me aur chota answer dhundo
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(ans);
        }
    }
}
import java.util.Scanner;

public class replaceZeroWithFive {

    static int convertfive(int num) {

        if (num == 0) {
            return 5;
        }

        int n = 0;

        while (num > 0) {
            int lastDig = num % 10;

            if (lastDig == 0) {
                lastDig = 5;
            }

            n = n * 10 + lastDig;
            num /= 10;
        }

        int rev = 0;

        while (n > 0) {
            int lastDig = n % 10;
            rev = rev * 10 + lastDig;
            n /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(convertfive(num));

        sc.close();
    }
}
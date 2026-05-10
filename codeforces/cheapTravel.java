import java.util.*;

public class cheapTravel {
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int op1 = a * n ;
    int rides = (m + n - 1)/ m;
    int op2 = rides * b;

    int full = n/m;
    int rem = n%m;
    int op3 = (full * b ) + (rem * a);

    System.out.println(Math.min (Math.min(op1,op2),op3));
    
  }
}

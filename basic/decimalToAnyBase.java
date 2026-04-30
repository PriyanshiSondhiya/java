public class decimalToAnyBase {
  public static void main (String args[]){
    int num = 634;
    int ans = 0;


    int pow = 1;

    while(num>0){
        int rem = num % 8;
        num = num/8;

        ans += rem * pow;
        pow = pow * 10;
    }

    System.out.println(ans);
  }
}

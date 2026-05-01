public class anyBaseToDecimal {
  public static void main (String args[]){
    int n = 1001001000;
    int ans = 0;
    int pow = 1;

    while(n >0){
      int rem = n % 10;
      n = n/10;
      ans += rem * pow;
      pow=pow * 2;
    }
    System.out.println(ans);
  }
}

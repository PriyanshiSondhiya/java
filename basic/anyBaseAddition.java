public class anyBaseAddition {
  public static void main (String args[]){
    int n1 = 236, n2 = 754;
    int ans = 0, c = 0, pow = 1;

    while(n1>0 || n2>0 || c>0){
      int d1 = n1%10;
      int d2 = n2%10;
      n1 = n1/10;
      n2 = n2/10;
      int d = d1 + d2 + c;
      c = d / 8;
      d = d% 8;

      ans += d*pow;
      pow *= 10;
    }
    System.out.println(ans);
  }
}

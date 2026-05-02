public class anyBaseToAnyBase {
  public static void main (String args[]){
    int n = 1000;
    int fromBase = 2;
    int toBase = 8;
    int pow = 1;
    int ans = 0;
   //any base to decimal
    while(n > 0){
      int rem = n % 10;
      n = n/ 10;

      ans+= rem * pow;
      pow *= fromBase;
    }

    //System.out.println(ans);
    //decimal to any base
    int ans2 =0;
    int pow2 = 1;
    int n2 = ans;


    while(n2>0){
      int rem = n2 % toBase;
      n2 = n2/ toBase;

      ans2 += rem * pow2;
      pow2 *= 10;
    }
    System.out.println(ans2);
  }
}

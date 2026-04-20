import java.util.*;

public class hcf {
  public static int print1 (int a, int b){
    int gcd = 1;
    for(int i = 1; i<=Math.min(a, b); i++){
      if( a% i == 0 && b % i == 0){
        gcd = i;
      }
    }
    return gcd;
  }

  public static int print2 (int a, int b){
  int gcd = 1;
    for(int i = Math.min(a, b); i>=1; i--){
      if(a% i == 0 && b%i ==0){
        gcd = i;
        break;
      }
    }
    return gcd;
  }

  public static int print3(int a, int b){
    while( a> 0 && b > 0){
      if( a> b) a = a% b; else b = b%a;
    }
    if(a == 0)return b;
    else return a;
  }

  public static int lcm(int a, int b, int gcd){
    int lcm = (a * b) / gcd;
    return lcm;
  }

  public static void main (String args[]){
  System.out.println(print1(9, 12));
  System.out.println(print2(9, 12));
  System.out.println(print3(9, 12));
  System.out.println(lcm(9, 12, 3 ));
  }
}

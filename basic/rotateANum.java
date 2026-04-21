import java.util.*;

public class rotateANum {
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int temp = n;

    int nod = 0;
    while(temp != 0){
      temp = temp/10;
      nod++;
    }
    //rotation num bohot bda hua to like 552 ->agr nod 5 hua to 5 times roate hokr wo apni original position pr wapas aa jayega bache k%nod times rotation honge fr;
    k = k % nod;

    if(k<0){
      k = k + nod;
    }

    int kPow = (int)Math.pow(10, k);
    int mult = (int)Math.pow(10, nod-k);

    int q = n/kPow;
    int r = n%kPow;

    int res = r * mult + q;
    System.out.println(res);


  }
  
}

import java.util.*;
public class interestingDrinks {
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int shop[] = new int[n];
    for(int i=0; i<n; i++){
      shop[i] = sc.nextInt();
    }
    
    Arrays.sort(shop);
    int q = sc.nextInt();

    while(q-- > 0){
      int coins = sc.nextInt();

      int left = 0, right = n-1, ans = 0;
      while(left <= right){
        int mid = left + (right - left)/2;

        if(shop[mid] <= coins){
          ans = mid + 1;
          left = mid + 1;
        }
        else{
          right = mid - 1;
        }

       
      }
       System.out.println(ans);
    }
  }
}

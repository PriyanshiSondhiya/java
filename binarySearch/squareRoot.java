// public class squareRoot {
//   public static void main (String args[]){
//     int n = 28;
//     int res = 1;
//     for(int i=1; i<=n; i++){
//       if(i*i <= n){
//         res = i;
//       }
//       else{
//         break;
//       }
//     }

//     System.out.println(res);
//   }
// }


public class squareRoot {
  public static void main (String args[]){
    int n = 25;
    int res = -1;
    int st = 1, end = n;

    while(st <= end){
      int mid = st + (end - st)/ 2;

    //  if( mid * mid <= n){
    if(mid <= n/mid){
      res = mid;
      st = mid + 1;
      
     }
     else{
      end = mid -1;
     }
    }
    System.out.println(end);
  }
}
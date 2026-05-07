// import java.util.*;

// public class twins {
//   public static void main (String args[]){
//     Scanner sc = new Scanner (System.in);

//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i=0; i<n; i++){
//       arr[i] = sc.nextInt();
//     }

//     Arrays.sort(arr);

//     int s1 = 0;
//     int s2 = 0;
//     int coin = 0;
//     int m =arr.length/2;;
//     while(m >=0){
//        //m = arr.length/2;
//       s1 = 0;
//       s2 = 0;
//       for(int i=0; i<m; i++)s1+= arr[i];
//       for(int i=m; i<n; i++)s2+= arr[i];

//       if(s1 == s2)m = m-1;
//       else if (s1 > s2) m = m-1;
//       else{
//          coin = n - m ;
//          break;
//       }

//     }
//     System.out.println(coin);
//   } 
// }

import java.util.*;

public class twins {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);
    int mySum = 0;
    int total = 0;
    for(int i=0; i<arr.length; i++){
      total += arr[i];
    }
    int count = 0;

    for(int i=arr.length-1; i>=0; i--){
      mySum += arr[i];
      total -= arr[i];
      count++;

      if(mySum > total){
        break;
      }
    }
    System.out.println(count);
  }
}
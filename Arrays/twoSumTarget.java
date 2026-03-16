public class twoSumTarget {
  public static void main (String args[]){

    int arr1[] = {1, 2, 3, 4, 5, 6};
    int target = 9;
    int left = 0;
    int right = arr1.length-1;

    while(left<right){
      int sum = arr1[left] + arr1[right];
      if(target == sum){
        System.out.println(arr1[left] + " " + arr1[right]);
        break;
      }
      if(sum > target){
        right--;
      }else{
        left++;
      }
    }
  }
}

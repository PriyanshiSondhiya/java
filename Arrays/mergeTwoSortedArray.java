import java.util.*;

public class mergeTwoSortedArray {
  //brute
  public static int[] nums (int nums1[], int m, int nums2[], int n){
    int temp[] = new int[m+n];
    int k = 0;
    for(int i=0; i<m; i++){
        temp[k++] = nums1[i];
    }

    for(int i=0; i<n; i++){
      temp[k++] = nums2[i];
    }

    Arrays.sort(temp);

    // for(int i=0; i<m+n; i++){
    //   nums1[i] = temp[i];
    // }
    return temp;
  }
  
  //better (2 pointers)
  public static int[] nums2 (int nums1[], int m, int nums2[], int n){
   int temp[] = new int[m+n];
   int i=0, j=0, k=0;

   while(i<m && j<n){
    if(nums1[i] < nums2[j]){
      temp[k++] = nums1[i++];
    }
    else{
      temp[k++] = nums2[j++];
    }

    while(i<m) temp[k++] = nums1[i++];
    while(j<n) temp[k++] = nums2[j++];
   }
   return temp;
  }

  //optimal
  //  public void merge(int[] nums1, int m, int[] nums2, int n) {
  //       int i = m-1, j=  n-1, k = m+n-1;

  //       while(i>=0 && j>=0){
  //           if(nums1[i] > nums2[j]){
  //               nums1[k--] = nums1[i--];
  //           }else{
  //               nums1[k--] = nums2[j--];
  //           }
  //       }
  //       while(j>=0) nums1[k--] = nums2[j--];
  //   }
   
  public static void main (String args[]){
    int nums1[] = {2, 2, 3};
    int nums2[] = {4, 5 ,6};

  System.out.println(Arrays.toString(nums2(nums1, 3, nums2, 3)));
  //nums3(nums1, 6, nums2, 3);
  }
}

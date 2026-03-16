public class prefixSum {
  public static void main (String args[]){
    int arr[]= {2, 4, 6, 8, 10};
    int prefix[] = new int [arr.length];
    prefix[0] = arr[0];

    for(int i=1; i<arr.length; i++){
      prefix[i] = arr[i]+ prefix[i-1];
    }

    for(int j=0; j<arr.length; j++){
      System.out.println(prefix[j]);
    }
  }
}

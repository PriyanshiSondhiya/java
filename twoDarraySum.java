public class twoDarraySum {
    public static void main(String[] args) {
        int[][] arr={ {1,2,3,4,5}, {2,3,4,5,6},{2,3,4,5,6} };
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
           //System.out.print(sum);       Har row ka sum
          // System.out.println();
        }
        System.out.println(sum);    //overall sum
    }
    
}

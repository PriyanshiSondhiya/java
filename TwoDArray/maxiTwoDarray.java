package array.TwoDArray;
public class maxiTwoDarray {
    public static void main(String[] args) {
        int[][] arr={ {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15} };
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length; j++){
                if(arr[i][j] > arr[0][0]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
    
}

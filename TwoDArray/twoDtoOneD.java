package array.TwoDArray;
public class twoDtoOneD {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15} };
        int total=0;
        for(int i=0;i<arr.length;i++){
            total=total+arr[i].length;
            
        }
        System.out.println(total);




        int C[] =new int[total];
        int i<=0;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                C[k]=arr[i][j];
                k++;
            }
        }
    }
    
}

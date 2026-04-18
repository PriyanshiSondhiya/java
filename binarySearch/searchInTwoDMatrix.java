public class searchInTwoDMatrix {
  public static void main (String args[]){
    int arr[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 45}, {32, 33, 39, 50}};
    int row = 4, col = 4;
    int key = 29;

    int i =0, j = col-1;

    while(i>=0 && i<row && j>=0 && j<col){
      if(arr[i][j] == key){
        System.out.println("found");
        break;
      }
      else if (arr[i][j] > key){
        j--;
      }
      else{
        i++;
      }
    }


  }
}

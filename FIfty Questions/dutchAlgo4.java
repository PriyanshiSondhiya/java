public class dutchAlgo4 {

    static void sort012(int arr[], int arr_size){
          int low=0;
        int high=arr_size-1;
        int mid=0, temp=0;

        while(mid<=high){

            if(arr[mid]==0){
               
                temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }

            else if(arr[mid]==1){
                mid++;
            }

            else{
                temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;

            }
        }

    }


    static void printArray(int arr[], int arr_size){
       for(int i=0; i< arr_size; i++){
        System.out.print(arr[i]+" ");
       }
    }
    public static void main(String args[]){

  int arr[]={0,1,1,0,1,2,1,2,0,0,0};
int arr_size=arr.length;

sort012(arr,arr_size);
printArray(arr,arr_size);

       //******brute force :- any sorting algo;*******


    //   *********better approach*******
    //    int arr[]={0,1,2,0,1,1,2,2,0,1};
    //    int count0=0, count1=0, count2=0;

    //    for(int i=0; i<arr.length; i++){
    //     if(arr[i]==0){
    //         count0++;
    //     }
    //     else if(arr[i] == 1 ){
    //         count1++;
    //     }
    //     else{
    //         count2++;
    //     }
        
    //    }


    //    for(int i=0; i<count0; i++){
    //     arr[i]=0;
    //    }
    //    for(int i=count0; i<count0+count1; i++){
    //     arr[i]=1;
    //    }
    //    for(int i=count0 + count1; i<arr.length; i++){
    //     arr[i]=2;
    //    }

    //    for(int k=0; k<arr.length; k++ ){
    //     System.out.print(arr[k]+ " ");
    //    }

   
    


    }

}
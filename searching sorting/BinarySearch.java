public class BinarySearch {

    static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }

        for(int num: arr){
            System.out.print(num+ " ");
        }
       
    }

    static int binarySearch (int arr[], int target){
        int st =0,end=arr.length-1;
        int mid =(st=end/2);


        while(st<=end){
            if(mid == target){
            return mid;
            }

            else if(target>arr[mid]){
                st=mid+1;
            }
            
            else if(target<arr[mid]){
                end=mid-1;
            }

        }
        return -1;
     }
    public static void main(String args[]){
   int arr[]={8,7,8,7,5};
    System.out.println(binarySearch(arr,8));
    System.out.println("jejeje");
     bubbleSort(arr);


    }


    
}

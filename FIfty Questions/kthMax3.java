import java.util.*;

public class kthMax3 {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);

    int arr[]={4,2,3,1,5};//123345
    int temp;
    int k=sc.nextInt();
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr.length; j++){
            if(arr[i] > arr[j]){
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
        }
    }
  
    System.out.println( "kth largest" + arr[k-1]);//54321


    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr.length; j++){
            if(arr[i] < arr[j]){
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
        }
    }
  
     System.out.print( "kth smallest" + arr[k-1]);

    }
}


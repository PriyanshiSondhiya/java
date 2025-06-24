package array;

public class uniqueElementInArr{
public static void main(String args[]){
    int arr1[]={1,3,2 };
    int arr2[]={3,4,5};


    //arr1 elements not in arr2
    for(int i=0; i<arr1.length; i++){
        boolean found=false;
        for(int j=0; j<arr2.length; j++){
            if(arr1[i]== arr2[j]){
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(arr1[i]+" ");
        }
    }


    //arr2 elements not in arr1
    for(int i=0; i<arr2.length; i++){
        boolean found2=false;
        for(int j=0; j<arr1.length; j++){
            if(arr2[i] == arr1[j]){
                found2=true;
                break;
            }
        }
         if(!found2){
            System.out.println(arr2[i] + " ");
        }
    }
}
}
 
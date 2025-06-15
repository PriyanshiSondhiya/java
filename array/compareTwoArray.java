package array;

// public class compareTwoArray {
//     public static void main(String ars[]){
//         int arr1[]={1,2,3};
//          int arr2[]={1,2,3};

//          boolean isEqual= java.util.Arrays.equals(arr1,arr2);

//          if(isEqual){
//             System.out.println("Equal");
//          }
//          else{
//             System.out.println("Not Equal");
//          }
//     }
    
// }


public class compareTwoArray {
    public static void main(String ars[]){
         int arr1[]={2,2,3};
         int arr2[]={1,2,3};
     
        boolean equal=true;
         for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                equal = false;
                break;
            }
         }
        if(equal==true){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        

    }
}
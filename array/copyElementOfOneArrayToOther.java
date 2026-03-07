package array;
import java.util.*;
public class copyElementOfOneArrayToOther {
   public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter size of Array");
   int n=sc.nextInt();

   int arr[]= new int[n];
   int arr2[]= new int[arr.length];
   
   for(int i=0; i<arr.length; i++){
        arr[i]=sc.nextInt();
   }


   for(int i=0; i<arr.length; i++){
    arr2[i]=arr[i];
   }

   for(int val:arr2){
    System.out.println(val +" ");
   }

   } 
}

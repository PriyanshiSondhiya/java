package array;
// import java.util.*;
// public class MergeTwoArray {
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);

//         System.out.println("Enter size of array");
//         int n=sc.nextInt();

//         int arr1[]=new int[n];
//         int arr2[]=new int[n];
//         int merge[]=new int[arr1.length + arr2.length];

//         for(int i=0; i<arr1.length; i++){
//            arr1[i]=sc.nextInt();
//         }

//         System.out.println("second array");
//         for(int i=0; i<arr2.length; i++){
//             arr2[i]=sc.nextInt();
//         }

//        for(int i=0; i<arr1.length; i++){
//         merge[i]=arr1[i];
//        }

//        for(int i=arr1.length; i<arr1.length + arr2.length; i++){
//         merge[i]=arr2[i - arr1.length];
//        }

//        System.out.println("merged");
//        for(int i=0; i<merge.length; i++){
//         System.out.print(merge[i] + " ");
       
//        }
//     }
// }





import java.util.*;
public class MergeTwoArray {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter size of array");
        int n=sc.nextInt();

        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int merge[]=new int[arr1.length + arr2.length];

        for(int i=0; i<arr1.length; i++){
           arr1[i]=sc.nextInt();
        }

        System.out.println("second array");
        for(int i=0; i<arr2.length; i++){
            arr2[i]=sc.nextInt();
        }

       for(int i=0; i<arr1.length; i++){
        merge[i]=arr1[i];
       }

       for(int i=0; i<arr2.length; i++){
        merge[i+arr1.length]=arr2[i];
       }

       System.out.println("merged");
       for(int i=0; i<merge.length; i++){
        System.out.print(merge[i] + " ");
       
       }
    }
}

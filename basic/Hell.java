package basic;
import java.util.Scanner;

public class Hell{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum=0;

        System.out.println("Enter size of the array");
        int n=sc.nextInt();

        System.out.println("Enetr array elelments");
        int[] arr= new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        for(int j=0; j<arr.length; j++){
            sum=sum+arr[j];
        }
        System.out.print(sum);
    }
    
    
}


package number_problems;
import java.util.*;
public class two {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int firstRange=sc.nextInt();
        int secondRange=sc.nextInt();

        for(int i=firstRange; i<=secondRange; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        

    }
}

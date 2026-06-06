import java.util.*;

class countSmaller {
    public static int countOfElements(int x, List<Integer> arr) {
        // code here
        int count = 0;
        for(int i : arr){
            if(i <= x)count++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }

        System.out.println(countOfElements(x, arr));
    }
}

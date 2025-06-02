

//         ArrayList<String> arr= new ArrayList<>();
//         arr.add("Rohit");
//         arr.add("Mohit");
//         arr.add("Rahul");
//         arr.add(1,"Jain");
//         arr.set(1,"bjp");
//         //arr.clear();
//         arr.remove(1);
//          System.out.println(arr);
//     }
// }


// import java.util.*;
// public class arraylist{
//     public static void main(String args[]){
//         ArrayList<String> arr=new ArrayList<>();
//         arr.add("a");
//         arr.add("b");
//         arr.add("A");
//         arr.add("B");
//         arr.add("b");
//         Collections.sort(arr);
//         System.out.println(arr);
//     }
// }


import java.util.*;
public class arraylist{
    public static void main(String args[]){
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(-4);
        arr.add(6);
        arr.add(0);
        arr.add(-7);
        arr.add(3);
        arr.add(4);
        arr.add(-8);
        Collections.sort(arr);
        System.out.println(arr);
        int n=arr.size();
        int sum=(arr.get(n-1)+ arr.get(n-2));
        System.out.println(sum);
       

    }
}
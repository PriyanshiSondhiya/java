// import java.util.*;
// public class collectionFramework {
//     public static void main(String args[]){
//        // int arr[]=new int[5];
//        ArrayList <String> arr= new ArrayList<>();

//        arr.add("hello");
//        arr.add("namaste");
//        arr.add("hiiii");
//        arr.set(1,"byeeee");
//        arr.remove(0);
//        System.out.println(arr);

//     }
// }



// import java.util.*;
// public class collectionFramework{
//     public static void main(String args[]){
//         LinkedList<Integer> arr= new LinkedList<>();
//         arr.add(4);
//         arr.add(1);
//         arr.add(10);
//         arr.set(1,5);
//         arr.remove(2);
//         arr.addFirst(0);
//         System.out.println(arr);
//     }
// }


// import java.util.*;
// public class collectionFramework{
//     public static void main(String args[]){
//         LinkedList<Integer> arr= new LinkedList<>();
//         for(int i=0; i<1000; i++){
//             arr.add(i);
//         }

//         for(int i=99; i<1000; i++){
//             if(i>=100 && i<200){
//                 System.out.println(i+" ");
//             }
//         }
//     }
// }



// import java.util.*;
// public class collectionFramework{
//     public static void main(String args[]){
//         int arr[]={1,2,3,4,4,5,6,6,7,8};
//         HashSet<String> set=new HashSet<>();
//         set.add("CA");
//         set.add("Ba");
//         set.add("Ar");
//         System.out.println(set);

//     }
// }



// import java.util.*;
// public class collectionFramework{
//     public static void main(String args[]){
//         HashSet<Integer> set= new HashSet<>();

//         int arr[]={1,2,2,3,4,4,5,6,6,7};
//         for(int i=0; i< arr.length ; i++){
//            if(set.contains(i)){
//             System.out.println(arr[i]);
//            }
//            else{
//             System.out.println();
//            }
//         }
//     }
// } 



//****HashMap****
// import java.util.*;
// public class collectionFramework{
//     public static void main(String args[]){
//         HashMap <String,Integer> map =new HashMap<>();
//         map.put("Id0", 0);
//         map.put("Id1", 1);
//         map.put("Id1", 1);
//         System.out.println(map.get("Id0"));
//         System.out.println(map.getOrDefault("Id0",0));

//         map.forEach((key,value) ->{
//             System.out.println(key + value);
//         });

//         int arr[]={3,21,34,4,4,56,667};

//     }
// }



//****Questions: Calculate frequency of each word****
// import java.util.*;
// public class collectionFramework{
//     public static void main(String args[]){
//         String str = "programming";
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(char ch : str.toCharArray()){
//             map.put(ch ,map.getOrDefault(ch,0)+1);
//         }

//         System.out.println(map);



        
//     }
// }



// import java.util.*;
// public class collectionFramework{
//     public static void main(String args[]){
//     String str="java is programming programming is java";
//     String[] newStr= str.split(" ");
//     HashMap<String , Integer> map =new HashMap<>();
//     for(String ch : newStr){
//         map.put(ch, map.getOrDefault(ch,0)+1);
//     }
//     System.out.println(map);
//     }
// }



// import java.util.*;
// public class collectionFramework{
//     public static void main(String args[]){
//     String str="programming";
//     String[] newStr= str.split(" ");
//     HashMap<String , Integer> map =new HashMap<>();
//     for(char ch=0; ch<str.length(); ch++){
//         map.put(ch, map.getOrDefault(ch,0)+1);
//         if(map.getOrDefault(ch, 0) ==1){
//             System.out.println(map);
//             break;
//         }
//     }
    
//     }
// }


// //for(char ch : str.toCharArray())

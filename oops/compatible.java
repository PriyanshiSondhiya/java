

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class Student{
    int age;
    String name;
    int rollNo;

    public Student(int age, String name, int rollNo){
        this.age=age;
        this.name=name;
        this.rollNo=rollNo;
    }

    public String toString(){
        return age + " " + name + " " + rollNo;
    }
 }

 class SortByName implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
 }

 class SortByAge implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.age-s2.age;
    }
 }

public class compatible {
   public static void main(String args[]){
    ArrayList<Student> list= new ArrayList<>();
    list.add(new Student(10, "rohit", 40));
    list.add(new Student(11, "mohit", 42));
    list.add(new Student(22, "rahu", 41));
    list.add(new Student(21, "rohit", 43));
    Collections.sort(list,new SortByName());
    for(Student s: list){
        System.out.println("name" + s);
    }

    Collections.sort(list,new SortByAge());
   for(Student s2: list){
    System.out.println("age" + s2);
   }
   } 
}

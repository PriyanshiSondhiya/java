package oops;
class Student{
    String firstName ="rahul";
    int age=11;

    //constructor
    Student(String s, int a){
        firstName = s;
        age = a;

        System.out.println(firstName + " " + age);
    }
    void name(){
        System.out.println(firstName + "  " + age);
    }
}




public class constructor {
    public static void main(String args[]){
        Student obj = new Student("rahul", 15);
        Student obj1 = new Student("Pratham", 16);
    }
}

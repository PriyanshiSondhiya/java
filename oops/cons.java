package oops;
class Student{
    String firstName="rahul";
    int age= 15;

    Student(String firstName , int age){
        this.firstName= firstName;
        this.age=age;

        System.out.println(firstName + " " + age);
    }
}

public class cons {
   public static void main(String args[]) {
    Student obj = new Student("roshan", 16);
    Student obj1 = new Student("rohit", 18);

    System.out.println(obj.firstName);
    System.out.println(obj1.firstName);
   }
}

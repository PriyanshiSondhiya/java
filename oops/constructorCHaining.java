package oops;
class Student{
    Student(){
        System.out.println("hello");
    }

    Student(String firstName){
        this();
        System.out.println(firstName);

    }

    Student(String firstName, int age){
        this(firstName);
        System.out.println(firstName+ " " + age);
    }
}


public class constructorCHaining {
    public static void main(String args[]){
        Student obj = new Student("rahul", 16);

    }
}


import java.util.Arraylist;
import java.util.Collections;



class Student{
    int age;
    String name;
}

 public Student implements Compare<Student>{
        public Student(int age, String name){
            this.name=name;
        }

Student(int age, String name){
    
}

public class comparable {
    public static void main(String args[]){
      ArrayList<Student> list= new ArrayList<>();
      list.add(new Student(12, "mohit"));
      list.add(new Student(16, "rohit"));
      list.add(new Student(18, "shohit"));
      list.add(new Student(20, "rahul"));

      Collections.sort(list);
      for(Student s: list){
        System.out.println(s.toString());
      }

    }
    
    }
}

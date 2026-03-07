package oops;
class Student{
     String name="name";
void sum(int a, int b){
    System.out.println(a+b);
}
    }

    class Teacher{
        void salary(int s){
            System.out.println(s);
        }
    }

    class Area{
        void areaRec(int l, int b){
            System.out.print(l*b);
        }
    }

    class prime{
        void primeNo(int n){
            for(int i=2; i<n; i++){
                if(n%i==0){
                    System.out.print("not prime");
                    break;
                }
            }
        }
    }

    public class classesAndObj{
    public static void main(String args[]){
     Student obj=new Student();
     Student obj1=new Student();
     obj.sum(5,5);
     Area ar= new Area();
    ar.areaRec(5,5);
    }
}
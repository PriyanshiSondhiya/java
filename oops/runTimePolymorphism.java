package oops;
class Books{
    int nOfPages(int n){
        System.out.println(n);
    }
}

class Hindi extends Books{
    int nOfchp(int c){
        System.out.println(c);
    }
}

public class runTimePolymorphism {
    public static void main(String args[]){
    Books Book = new Hindi();
    Book.nOfchp(12);
    }
}

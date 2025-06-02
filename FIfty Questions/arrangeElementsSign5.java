public class arrangeElementsSign5 {
    public static void main(String args[]){
        int a[]={2,-5,4,-6,4,-9};

        for(int i=0; i<a.length; i++){
          for(int j=0; j<a.length; j++){
             if(a[i]< a[j]){
             int temp=a[j];
             a[j]=a[i];
             a[i]=temp;
           }

          }
        }
     

        for(int k=0; k<a.length; k++){
            System.out.print(a[k]+ " ");
        }
    }
}

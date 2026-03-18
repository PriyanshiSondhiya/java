public class findIntersection {
  static class Node {
    int data;
    Node next;

    public Node (int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node getionintersection (Node headA, Node headB){
    Node p1 = headA;
    Node p2 = headB;
    while(p1 != p2){
      
      p1 = (p1 == null) ? headB : p1.next;
      p2 = (p2 == null) ? headA : p2.next;
    }
    return p1;
  }

  public static void main (String args[]){
   Node headA = new Node(1);
   headA.next = new Node(2);
   headA.next.next = new Node(3);

   Node headB = new Node(4);
    headB.next = new Node(5);
   headB.next.next = new Node(6);

   Node result = getionintersection(headA, headB);

   if(result != null){
      System.out.println(result.data);
   }else{
    System.out.println(" No Intersection");
   }
   
    
  }

}

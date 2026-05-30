class Node1{
    int data ;
    Node1 prev ;
    Node1 next ;
    

    public Node1(int data){
        this.data = data ;
        this.prev = null ;
        this.next = null ;
    }

}
public class _3_Doubly_Linked_List {
    public static void main(String [] args){
        
        Node1 obj1 = new Node1(1) ;
        Node1 obj2 = new Node1(2) ;
        Node1 obj3 = new Node1(3) ;
        
        obj1.prev = null ;
        obj1.next = obj2 ;
        obj2.prev = obj1 ;
        obj2.next = obj3 ;
        obj3.prev = obj2 ;
        obj3.next = null ;
        
        Node1 head = obj1 ;
        System.out.println("Doubly Linked List be: ") ;
        
        while(head!=null){
            System.out.print(head.data + " ") ;
            head = head.next ;
            
        }
        

    }
    
}

// package _2_Linked_List._6_Doubly_Linked_List.Deletion_In_Double_Linked_List;

class Node2{
    Node2 prev ;
    int data ;
    Node2 next ;

    public Node2(int data){
        this.prev = null ;
        this.data = data ;
        this.next = null ;
    }
}

public class _2_Deletion_From_End {
    Node2 head ;
    public void insert_Node(int data){
        Node2 newNode = new Node2(data) ;

        if(head==null){
            head = newNode ;
            return ;
        }

        Node2 temp = head ;
        
        while(temp.next != null){
            temp = temp.next ;
        }
        temp.next = newNode ;
        newNode.prev = temp ;
    
}

public void display_Node(){
    if(head==null){
        System.out.println("Doubly Linked List be empty.") ;
        return ;
    }

    Node2 temp = head ;
    while(temp != null){
        System.out.print(temp.data + " -> ") ;
        temp = temp.next ;

    }
    System.out.println("null") ;
}

public void deletion_From_End(){
    if(head==null){
        System.out.println("Doubly Linekd List be empty") ;
        return ;
    }
    else if(head.next==null){
        head = null ;
        return ;
    }

    Node2 prevNode = null ;
    Node2 currentNode = head ;

    while(currentNode.next!=null){
        prevNode = currentNode ; 
        currentNode = currentNode.next ;
    }
    prevNode.next = null ;
    currentNode.prev = null ;



}
    public static void main(String [] args){
        System.out.println("Program to delete element from end of Doubly Linked List") ;

        _2_Deletion_From_End list = new _2_Deletion_From_End() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);

        System.out.println("Doubly Linked List be: ") ;
        list.display_Node();

        System.out.println("Doubly Linked List after removing element from end be : ") ;
        list.deletion_From_End() ;
        list.display_Node();



        
    }
    
}

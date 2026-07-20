class Node2{
    int data  ;
    Node2 prev ;
    Node2 next ;

    public Node2(int data){
        this.data = data ;
        prev = null ;
        next = null ;
    }


}
public class _2_Deletion_From_End {

    Node2 head ;
    Node2 tail ;

    public void insert_Node(int data){
        Node2 newNode = new Node2(data)  ;

        if(head == null){
            head = newNode ;
            tail = newNode ;
            head.prev = tail ;
            tail.next = head ;
            return ;
        }

        tail.next = newNode ;
        newNode.prev = tail ;
        newNode.next = head ;
        tail = newNode ;
        head.prev = tail ;

    }
        public void display_Linked_List(){
        if(head == null){
            System.out.println("Doubly Circular Linked List be empty") ;
            return ;
        }

        Node2 temp = head ;
        System.out.println("Doubly Circular Linked List be: ") ;

        do{
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }while(temp!=head)  ;
    }

    public void deletion_From_End(_2_Deletion_From_End list){
        if(head==null){
            System.out.println("Empty Doubly Circular Linked List, cannot delete element.") ;
            return ;
        }
        else if(head==tail){
            head = null ;
            tail = null ;
            head.prev = null ;
            tail.next = null ;
            return ;
        }

        Node2 temp = tail.prev ;

        tail = null ;
        tail = temp ;
        tail.next = head ;
        head.prev = tail ;

        System.out.println() ;
        System.out.println("Deleting Element From End of Doubly Circular Linked List: ") ;
        list.display_Linked_List();

    }

    public static void main(String [] args){
        System.out.println("Deleting Node From The End Of Doubly Circulat Linked List.") ;

        _2_Deletion_From_End list = new _2_Deletion_From_End() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);
        list.insert_Node(5);

        list.display_Linked_List();

        list.deletion_From_End(list);
    }
    
}

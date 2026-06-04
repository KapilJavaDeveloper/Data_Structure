// package _2_Linked_List.Single_Linked_List.Deletion_In_Single_Linked_List;

class Node2{
    int data ;
    Node2 next ;

    public Node2(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _2_Deletion_At_The_End {
    Node2 head ;

    public void insert_Elements(int data){

        Node2 newNode = new Node2(data) ;

        
        if(head==null){
            head = newNode ;
            return ;
        }

        Node2 temp = head  ;

        while(temp.next!=null){
            temp = temp.next ;
        }
        temp.next = newNode ;

    }

    void display(){
        if(head==null){
            System.out.println("Linked List be empty") ;
            return ;
        }

        Node2 temp = head ;

        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;

        }
        System.out.println("null") ;
    }

    void remove_At_End(){
        if(head==null){
            System.out.println("Linked List be empty.") ;
            return ;
        }
        Node2 temp = head ;
        Node2 prev= null ;

        while(temp.next!=null){
            prev = temp ;
            temp = temp.next ;
        }
        prev.next = null ;



    }
    public static void main(String [] args){
        System.out.println("Deletion At the end of Linked List") ;

        _2_Deletion_At_The_End list = new _2_Deletion_At_The_End() ;

        list.insert_Elements(1) ;
        list.insert_Elements(2) ;
        list.insert_Elements(3) ;
        list.insert_Elements(4) ;
        list.insert_Elements(5) ;

        System.out.println("Original Linked List be: ") ;
        list.display() ;


        System.out.println("Linked List after deleting element from end: ") ;
        list.remove_At_End() ;
        list.display() ;

    }
    
}

// package _2_Linked_List.Single_Linked_List.Insertion_In_Single_Linked_List;


class Node{
    int data;
    Node next ;

    public Node(int data){
        this.data = data ;
        this.next = null ;
    }
}


public class _2_Insertion_At_The_End {

    Node head ;

    public void insert_Node_At_End(int data){
        Node newNode = new Node(data) ;

        if(head==null){
            head=newNode ;
            return ;
        }

        Node temp = head ;

        while(temp.next!=null){
            temp = temp.next ;
        }
        temp.next = newNode ;
    }

    public void display(){
        if(head==null){
            System.out.println("Linked List be empty: ") ;
            return ;
        }

        Node temp = head ;

        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;
    }


    public static void main(String[] args){
        System.out.println("Insertion At The End of the Linked List") ;

        _2_Insertion_At_The_End list = new _2_Insertion_At_The_End() ;

        list.insert_Node_At_End(1) ;
        list.insert_Node_At_End(2) ;
        list.insert_Node_At_End(3) ;
        list.insert_Node_At_End(4) ;

        System.out.println("Linked List be: ") ;
        list.display() ;

        
    }
    
}
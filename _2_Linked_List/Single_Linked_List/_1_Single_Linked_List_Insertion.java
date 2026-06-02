// package _2_Linked_List.Single_Linked_List;

class Node{
    int data ;
    Node next ;

    public Node(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _1_Single_Linked_List_Insertion {

    Node head ;

    void insert_Into_Linked_List(int data){

        Node newNode = new Node(data) ;

        if(head==null){
            head = newNode ;
            return ;
        }

        Node temp = head ;

        while(temp.next !=null){
            temp = temp.next ;
        }
        temp.next = newNode ;


    }

    public void display_Linked_List(){

        if(head==null){
            System.out.println("Linked List be empty") ;
            return ;
        }

        System.out.println("Linked List be: ") ;

        Node temp = head ;


        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;
    }
    public static void main(String [] args){
        System.out.println("Single Linked List") ;

        _1_Single_Linked_List_Insertion list = new _1_Single_Linked_List_Insertion() ;

        list.insert_Into_Linked_List(1) ;
        list.insert_Into_Linked_List(20) ;
        list.insert_Into_Linked_List(30) ;
        list.insert_Into_Linked_List(40) ;
        list.insert_Into_Linked_List(5) ;

        list.display_Linked_List() ;


    }
    
}

// package _2_Linked_List.Single_Linked_List.Insertion_In_Single_Linked_List;

class Node{
    int data ;
    Node next ;

    public Node(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _1_Insertion_At_Begining {

    Node head ;
    
    void insertion_At_The_Beginning(int data){
        Node newNode = new Node(data) ;


        if(head==null){
            head = newNode ;
            return ;
        }

        Node temp = head ;

        head = newNode ;

        head.next = temp ;


    }



    public void insert(int data){

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

    void display(){
        
        if(head==null){
            System.out.println("Linked List be empty") ;
            return ;
        }
        
        Node temp= head ;

        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;



    }
    public static void main(String[] args){
        System.out.println("Insertion at the Beginning of the Linked List Program.") ;

        _1_Insertion_At_Begining list = new _1_Insertion_At_Begining() ;

        list.insert(2) ;
        list.insert(3) ;
        list.insert(4) ;
        list.insert(5) ;

        System.out.println("Linked List be: ") ;
        list.display() ;

        list.insertion_At_The_Beginning(1) ;
        System.out.println("Linked List after inserting element at the beginning: ") ;
        list.display() ;


    }
    
}
// package _2_Linked_List.Single_Linked_List.Deletion_In_Single_Linked_List;

class Node1{
    int data ;
    Node1 next ;

    public Node1(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _1_Deletion_At_The_Begining {

    Node1 head ;

    void insert_Elements(int data){

        Node1 newNode = new Node1(data) ;

        if(head==null){
            head = newNode ;
            return ;
        }

        Node1 temp = head ;

        while(temp.next!=null){
            temp = temp.next ;
        }
        temp.next = newNode ;

    }

    void display(){

        if(head==null){
            System.out.println("Linked List be empty.") ;
            return ;
        }

        Node1 temp = head ;

        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;

    }

    void deleting_At_The_Begining(){
      

        if(head==null){
            System.out.println("Linked List be empty.") ;
            return ;
        }

       head = head.next ;

    }
    public static void main(String[] args){

        _1_Deletion_At_The_Begining list = new _1_Deletion_At_The_Begining() ;

        list.insert_Elements(1) ;
        list.insert_Elements(2) ;
        list.insert_Elements(3) ;
        list.insert_Elements(4) ;
        list.insert_Elements(5) ;

        System.out.println("Original Linked List be: ") ;
        list.display() ;

        System.out.println("Linked List after deleting Node at the begining -") ;
        list.deleting_At_The_Begining() ;
        list.display() ;


    }
    
}
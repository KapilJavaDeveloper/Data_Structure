class Node5{
    int data ;
    Node5 next ;

    public Node5(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _5_Insertion_At_Specific_Position {

    Node5 head ;
    Node5 tail ;

    public void insert_Node(int data){
        Node5 newNode = new Node5(data) ;

        if(head == null){
            head = newNode ;
            tail = newNode ;
            return ;
        }

        tail.next = newNode ;
        tail = newNode ;
        tail.next = head ;
        
    }

    public void display_Node(){
        if(head==null){
            System.out.println("Circular Linekd List be empty.") ;
            return ;
        }

        Node5 temp = head ;

        do{
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }while(temp!=head) ;


    }

    public void insert_At_Specific_Position(int position , int element){

        if(position <=0){
            System.out.println("Invalid Position ") ;
            return ;
        }

        Node5 newNode = new Node5(element) ;

        Node5 currentNode = head ;
        Node5 prevNode = head ;

        int i= 1;

        do{
            prevNode = currentNode ;
            currentNode = currentNode.next ;
            i++ ;

        }while(i<position && currentNode!=head) ;

        if(i==position && currentNode!=head){
            prevNode.next = newNode ;
            newNode.next = currentNode ;
        }
        else if(i== position && currentNode == head){
            prevNode.next = newNode ;
            newNode.next = head ;
        }
        else if(i<position && currentNode == head){
            System.out.println("Invalid position") ;
        }
  

    }
    public static void main(String [] args){
        System.out.println("Inserting Node at Specific Position in Circular Linked List.") ;

        _5_Insertion_At_Specific_Position list = new _5_Insertion_At_Specific_Position() ;

        list.insert_Node(10);
        list.insert_Node(20);
        list.insert_Node(30);
        list.insert_Node(40);

        System.out.println("Circular Linked List be: ") ;
        list.display_Node();

        int position = 3;
        int element = 56 ;

        System.out.println() ;

        System.out.println("Inserting Node at Position "+ position + " of Circular Linked List : ") ;

        list.insert_At_Specific_Position(position, element);
        list.display_Node();


    }
    
}

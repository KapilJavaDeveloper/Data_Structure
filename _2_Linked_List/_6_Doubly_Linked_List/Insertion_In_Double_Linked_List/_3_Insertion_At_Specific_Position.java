class Node3{
    Node3 prev ;
    int data ;
    Node3 next ;

    public Node3(int data){
        this.prev = null ;
        this.data = data ;
        this.next = null ;

    }
}

public class _3_Insertion_At_Specific_Position {

        Node3 head ;

        public void insert_Node(int data){

        Node3 newNode = new Node3(data) ;

        if(head == null){
            head = newNode ;
            return ;
        }

        Node3 temp = head ;

        while(temp.next != null){
            temp = temp.next ;
        }
        temp.next = newNode ;
        newNode.prev = temp ;


    }

        public void display(){
        if(head == null){
            System.out.println("Double Linked List be empty.") ;
            return ;
        }

        Node3 temp = head;

        while(temp !=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;

    }

    public  void insert_At_Specific_Position(int data , int position){
        Node3 newNode = new Node3(data) ;
        if(head==null && position>1){
            System.out.println("Invalid position") ;
            return ;
        }
        else if(position ==1 && head==null){
            head = newNode ;
            return ;
        }
        else if(position==1){

            head.prev = newNode ;
            newNode.next = head ;
            head = newNode ;
            return ;  
        }

        Node3 prevNode = head ;
        Node3 currentNode = head ;
        int i= 1 ;

        for(i=1 ; i<position && currentNode!=null ; i++){
            prevNode = currentNode ;
            currentNode = currentNode.next ;
        }

        if( currentNode==null && i==position ){
            newNode.prev = prevNode ;
            prevNode.next = newNode ;
        }
    
        else if(currentNode==null){
            System.out.println("Position Not valid") ;
        }

        else{
            prevNode.next = newNode ;
            newNode.prev = prevNode ;
            newNode.next = currentNode ;
            currentNode.prev = newNode ;
        
        }




    }

    public static void main(String [] args){

        _3_Insertion_At_Specific_Position list = new _3_Insertion_At_Specific_Position();

        list.insert_Node(1) ;
        list.insert_Node(2) ;
        list.insert_Node(3) ;
        list.insert_Node(4) ; 

        System.out.println("Double Linked List be: ") ;
        list.display() ;

        int data = 50 ;
        int position = 4 ;

        System.out.println("Double Linked list after insertion a Node at position "+ position) ;
        list.insert_At_Specific_Position(data, position) ;
        list.display() ;


    }
    
}

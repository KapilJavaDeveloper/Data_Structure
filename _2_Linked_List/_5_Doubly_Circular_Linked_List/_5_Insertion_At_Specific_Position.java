class Node5{
    int data ;
    Node5 prev ;
    Node5 next ;

    public Node5(int data){
        this.data = data ;
        this.prev = null ;
        this.next = null ;
    } 
}
public class _5_Insertion_At_Specific_Position {

    Node5 head ;
    Node5 tail ;

    public void insert_Node(int data){
        Node5 newNode = new Node5(data) ;

        if(head==null){
            head = newNode ;
            tail = newNode ;
            head.prev = tail ;
            tail.next = head ;
            return ;
        }

        tail.next = newNode ;
        newNode.prev = tail ;
        tail = newNode ;
        tail.next = head ;
        head.prev = tail ;

    }

    public void display_Node(){
        if(head == null){
            System.out.println("Double Circular linked List be empty.") ;
            return ;
        }

        Node5 temp = head ;
        

        do{
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }while(temp!=head)  ;
        
        System.out.println()  ;

    }
    public void insert_Node_At_Specific_Position(int data , int position){
        Node5 newNode = new Node5(data)  ;

        if(head==null && position > 1){
            System.out.println("Invalid Poistion") ;
            return ;

        }
        else if(position < 1){
            System.out.println("Invalid Poistion") ;
            return ;
        }
        else if(position == 1){
            newNode.next = head ;
            head.prev = newNode ;
            newNode.prev = tail ;
            tail.next = newNode ;
            head = newNode ;
            return ;
        }

        Node5 prevNode = head;
        Node5 currentNode = head.next ;
        Node5 nextNode = currentNode.next ;

        int index = 2 ;

        for(index=2 ; index<position && currentNode!=head  ; index++){
            prevNode = currentNode ;
            currentNode = currentNode.next ;
            nextNode = nextNode.next ;
        }
       
        if(index == position){
            prevNode.next = newNode ;
            newNode.prev = prevNode ;
            newNode.next = currentNode ;
            currentNode.prev = newNode ;

        }
        else if(position == index+1 && currentNode == tail && currentNode!=head ){
            tail.next=newNode ;
            newNode.prev = tail ;
            newNode.next = head ;
            head.prev = newNode ;
            tail = newNode ;

        }
        else if(index < position ){
            System.out.println("Invalid Position") ;
        }

        System.out.println("index be : "+ index ) ;
        System.out.println("position be: " + position)  ;

    }
    public static void main(String [] args){
        System.out.println("5. Program to insert Node at Specific position.") ;

              

        _5_Insertion_At_Specific_Position list = new _5_Insertion_At_Specific_Position()  ;


        list.insert_Node(1);
        // list.insert_Node(2);
        // list.insert_Node(3);
        // list.insert_Node(4);  

        System.out.println("Double Circular Linked List be: ") ;
        list.display_Node();
        
        int data = 78 ;
        int position = 2 ;
        
        list.insert_Node_At_Specific_Position(data , position) ;
        list.display_Node();


    }
    
}

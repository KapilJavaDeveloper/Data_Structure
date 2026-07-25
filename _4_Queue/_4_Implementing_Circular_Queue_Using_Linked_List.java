class Node4{
    int data ;
    Node4 next ;

    public Node4(int data){
        this.data = data ;
        this.next = null ;
    }

}
public class _4_Implementing_Circular_Queue_Using_Linked_List{


    Node2 front ;
    Node2 rear;

    public void enque(int data){
        Node2 newNode = new Node2(data)  ;

        if(front==null && rear==null){
            front = newNode ;
            rear = newNode ;
            rear.next = front ;
            System.out.println("Queue after inserting Element " + rear.data + " to Queue.") ;
            display_Queue()  ;
            return ;
        }
        
        rear.next = newNode ;
        rear = newNode ;
        rear.next = front ;
        System.out.println("Queue after inserting Element " + rear.data + " to Queue.") ;
        display_Queue()  ;
   
    }
    public void deque(){
        if(front== null && rear == null){
            System.out.println("Queue is Empty, Underflow Condition.") ;
            return ;
        }
        else if(front==rear){
            System.out.println("Queue after removing element "+ front.data + " from Queue.") ; 
            front = rear = null ;
            display_Queue();
            return ;
        }
        
        System.out.println("Queue after removing Element "+ front.data + " from Queue.") ; 
        Node2 temp = front.next;
        front = null ;
        front = temp ;
        temp = null ;
        rear.next = front ;
        display_Queue();

    }

    public void display_Queue(){
        if(front == null && rear==null){
            System.out.println("Queue be empty.") ;
            return ;
        }

        Node2 temp = front ;
        System.out.print("Queue be: ") ;

        do{
            System.out.print(temp.data + " ") ;
            temp = temp.next ;
        }while(temp!=front)  ;
        System.out.println() ;
    }
    public static void main(String [] args){
        System.out.println("4 Program to implement circular queue using linked list.") ;

        _4_Implementing_Circular_Queue_Using_Linked_List list = new _4_Implementing_Circular_Queue_Using_Linked_List()  ;

        list.enque(1);
        list.enque(2);
        list.enque(3);
        list.enque(4);

        list.deque();


    }
}
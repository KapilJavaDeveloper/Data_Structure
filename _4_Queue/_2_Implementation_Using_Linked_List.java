class Node2{
    int data ;
    Node2 next ;;

    public Node2(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _2_Implementation_Using_Linked_List {

    static Node2 front ;
    static Node2 rear ;


    public static void enqueue(int data){
        Node2 newNode = new Node2(data)  ;

        if(front==null && rear==null){
            front = newNode ;
            rear= newNode ;
            System.out.println("Element "+ newNode.data + " added to Queue.") ;
            return ;
        }

        rear.next = newNode ;
        rear = newNode ;

       

        System.out.println("Element "+ rear.data + " added to Queue.") ;

     
    }

    public static void display_Queue(){
        if(front==null && rear==null){
            System.out.println("Queue is Empty.")  ;
            return ;
        }

        Node2 temp = front ;
        System.out.print("Queue be: ") ;

        while(temp!=null){
            System.out.print(temp.data + " ") ;
            temp = temp.next ;
        }
        System.out.println() ;

    }

    public static void deque(){
        if(front==null && rear==null){
            System.out.println("Queue is Empty, Underflow condition") ;
            return ;
        }
        else if(front.next==null){
            System.out.println("Element "+ front.data + " removed from queue.") ;
            System.out.println("Queue after deletion element.") ;
            
            front = null ;
            rear = null ; 
            display_Queue();
            return ;
        }

        System.out.println("Element "+ front.data + " removed from queue ") ;
        Node2 temp  = front.next ;
        front = null ;
        front = temp ;
        temp = null ;
        System.out.println("Queue after deletion from Queue: ") ;
        display_Queue()  ;

    }

    public static void peek(){
        if(front==null && rear==null){
            System.out.println("Queue is Empty.") ;
            return ;
        }

        System.out.println("Peek Element of Queue be: " + front.data) ;
    }
    public static void main(String [] args){
        System.out.println("2 Program to Implement Queue Using Linked List.") ;  

        enqueue(1) ;
        enqueue(2) ;

        display_Queue() ;

        deque() ;
        deque() ;

        

    }
    
}

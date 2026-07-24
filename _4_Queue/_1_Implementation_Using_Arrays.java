
public class _1_Implementation_Using_Arrays{

    static int size = 9 ;
    static int front = -1 ;
    static int rear = -1 ;
    static int[] queue = new int[size] ;

    public static void enque(int data){
        if(rear> size-1){
            System.out.println("Queue is full , Overflow condition.") ;
            return ;
        }
        else if(rear==-1 && front==-1){
            rear++ ;
            front++ ;
            queue[rear]  = data ;
            System.out.println("Element "+ data + " inserted in queue.")  ;
            return ;
        }
        rear++ ;
        queue[rear] = data ;
        System.out.println("Element "+ data + " inserted in queue.")  ;
        
    }

    public static void display_Queue(){
        if(front ==-1 && rear==-1){
            System.out.println("Queue is Empty.") ;
            return ;
        }
        System.out.print("Queue be: ") ;

        for(int i=front ; i<=rear ; i++){
            System.out.print(queue[i] + " ") ;

        }
        System.out.println()  ;
    }

    public static void deque(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is Empty, Underflow condition.") ;
            return ;
        }
        else if(front==rear){
            System.out.println("Element "+ queue[front] + " is removed from queue.") ;
            front=rear=-1 ;
            System.out.println("Queue after deletion Element.") ;
            display_Queue()   ;
            return ;
        }
        System.out.println("Element "+ queue[front] + " is removed from queue.") ;
        front++ ;

        System.out.println("Queue after deletion Element.") ;
        display_Queue()   ;

    }

    public static void isFull(){
        if(rear==size-1){
            System.out.println("Queue is Full.") ;
            return ;
        }
        System.out.println("Queue is not full.") ;
    }
    public static void peek(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is Empty.") ;
            return ;
        }

        System.out.println("Peek element of queue be: " + queue[front]) ;

    }

    public static void main(String [] args){
        System.out.println("1 Program Implementing Queue Using Arrays.") ;


        enque(1) ;
        enque(2) ;
        enque(3) ;
        enque(4) ;

        display_Queue();

        deque()  ;

        isFull()  ;

        peek()  ;
    }
}
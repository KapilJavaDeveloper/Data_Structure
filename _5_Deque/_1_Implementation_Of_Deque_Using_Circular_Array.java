// package _5_Deque;

public class _1_Implementation_Of_Deque_Using_Circular_Array {

    int size = 8 ;
    int[] queue = new int [size]  ;
    int front = -1 ;
    int rear = -1 ;

    public void enque_Front(int data){
        if(front == -1 && rear == -1){
            front++ ;
            rear++ ;
            queue[front] = data ;
            System.out.println("Queue after inserting "+ queue[front] + " from Front" )  ;
            display_Queue()  ;
            return ;

        }
        else if(rear+1 == front || (front==0 && rear==size-1) ){
            System.out.println("Queue is Full, OberFlow Condition.") ;
            return ;
        }
        if(front==0){
            front=size-1 ;
            queue[front] = data ;
            System.out.println("Queue after inserting "+ queue[front] + " from Front")  ;
            display_Queue()  ;
            return ;
        }

        front-- ;
        queue[front] = data ;

        System.out.println("Queue after inserting "+ queue[front]  + " from Front")  ;
        display_Queue()  ;

    }

    public void enque_Rear(int data){
        if(front == -1 && rear == -1){
            front++ ;
            rear++ ;
            queue[rear]  = data ;

            System.out.println("Queue after inserting "+ queue[rear] + " from Rear") ;
            display_Queue() ;
            return ;
        }
        else if(rear+1 == front || (front==0 && rear == size-1) ){
            System.out.println("Queue is Full , OberFlow Condition.")  ;
            return ;
        }

        if(rear == size-1){
            rear = 0 ;
            queue[rear]  = data ;

            System.out.println("Queue after inserting "+ queue[rear] + " from Rear") ;
            display_Queue() ;
            return ;
        }

        rear++ ;
        queue[rear]  = data ;


        System.out.println("Queue after inserting "+ queue[rear] + " from Rear") ;
        display_Queue() ;
        
    }

    public void display_Queue(){
        if(front == -1 && rear == -1){
            System.out.println("Queue is Empty.")  ;
            return ;
        }
        int temp = front ;

        System.out.print("Queue be: ") ;
        while(temp!=rear){
            System.out.print(queue[temp] + " ") ;
            temp = (temp+1) % size ;
        }
        System.out.println(queue[temp])  ;
    }

    public void deque_Front(){
        if(front == -1 && rear == -1){
            System.out.println("Queue is Empty, UnderFlow Condition.") ;
            return ;
        }
        else if(front==rear){
            System.out.println("Queue after removing "+ queue[front] + " at Front") ;
            front = -1 ;
            rear = -1 ;
            display_Queue() ;
            return ;
        }
        else if(front == size-1){
            System.out.println("Queue after removing "+ queue[front] + " at Front") ;
            front = 0 ;
            display_Queue() ;
            return ;

        }
        System.out.println("Queue after removing "+ queue[front] + " at Front") ;
        front++ ;
        display_Queue()  ;
        
    }

    public void deque_Rear(){
        if(front == -1 && rear == -1){
            System.out.println("Queue is Empty , UnderFlow Condition")  ;
            return ;
        }
        else if(front==rear){
            System.out.println("Queue after removing element "+ queue[rear] + " at Rear") ;
            front=rear = -1 ;
            display_Queue() ;
            return ;
        }
        else if(rear == 0){
            System.out.println("Queue after removing element "+ queue[rear] + " at Rear") ;
            rear = size -1 ;
            display_Queue()  ;
            return ;
        }
        
        System.out.println("Queue after removing element "+ queue[rear] + " at Rear") ;
        rear-- ;
        display_Queue()  ;

    }



    public static void main(String [] args){
        System.out.println("1 Program Implementing Deque Using Circular Array.")  ;

        _1_Implementation_Of_Deque_Using_Circular_Array obj = new _1_Implementation_Of_Deque_Using_Circular_Array()  ;

        obj.enque_Front(2);
        obj.enque_Front(5);
        obj.enque_Rear(-1);
        obj.enque_Rear(0);
        obj.enque_Front(7);
        obj.enque_Front(4);

        obj.deque_Front();
        
        
        
        obj.deque_Rear()  ;
        obj.deque_Front() ; 

    }
    
}

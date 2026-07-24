public class _3_Implementing_Circular_Queue_Using_Arrays {

     int size = 8 ;
     int[] queue = new int[size]  ;
     int front = -1 ;
     int rear = -1 ;

    public  void enqueu(int data){
        if(front==-1 && rear==-1){
            front++ ;
            rear++ ;
            queue[rear] = data ;
            System.out.println("Element "+ queue[rear] + " is added to Queue.") ;
            return ;
        }
        else  if((rear+1) % size == front){
            System.out.println("Queue is Full.") ;
            return ;
        }
        
        rear = (rear+1) % size  ;
        queue[rear]  = data ;
        System.out.println("Element "+ queue[rear] + " is added to Queue.") ;


    }

    public void deque(_3_Implementing_Circular_Queue_Using_Arrays obj ){
        if(front==-1 && rear==-1){
            System.out.println("Queue is Empty., UnderFlow condition") ;
            return ;
        }
        else if(front == rear){
            System.out.println("Deque element be: " + queue[front]) ;
            front=rear=-1 ;
            return ;
        }
        System.out.println("Deque Element be: " + queue[front]) ;
        front = (front+1) % size ;
        System.out.println("Queue after deletion be: " )  ;
        obj.display_Queue() ;



    }

    public void display_Queue(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is Empty.") ;
            return ;
        }

        
        System.out.println("Queue be: ") ;
        int temp = front ;

       while(temp!=rear){
        // front  = (front+1)%size ;
        System.out.print(queue[temp] + " ") ;
        temp  = (temp+1)%size ;
       }
       System.out.print(queue[rear] ) ;
       System.out.println()  ;  
    }

    public void peek(){
        if(front== -1 && rear==-1){
            System.out.println("Queue is Empty") ;
            return ;

        }
        System.out.println("Peek Element in Queue be: " + queue[front])  ;
    }

    public static void main(String [] args){
        System.out.println("Implementing Circular Queue Using Arrays.")  ;

        _3_Implementing_Circular_Queue_Using_Arrays obj = new _3_Implementing_Circular_Queue_Using_Arrays() ;

        obj.enqueu(1) ;
        obj.enqueu(2) ;
        obj.enqueu(3) ;
        obj.enqueu(4) ;

        obj.display_Queue();
        
        obj.deque(obj);

        obj.peek();


    }
    
}

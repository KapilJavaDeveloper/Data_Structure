import java.util.Stack ;
public class _5_Implement_Queue_Using_Stack{

    Stack<Integer> stack1 = new Stack<>()  ;
    Stack<Integer> queue = new Stack<>()  ;

    public void enque(int data){
        if(queue.isEmpty()){
            queue.push(data)  ;
            System.out.println("Queue after adding "+ data + " to the Queue.") ;
            display_Queue()  ;
            return ;
        }

        while(!queue.isEmpty()){
            stack1.push(queue.pop())  ;
        }
        stack1.push(data)  ;

        while(!stack1.isEmpty()){
            queue.push(stack1.pop()) ;
        }

        System.out.println("Queue after adding "+ data + " to the Queue.") ;

        display_Queue()  ;
    


    }

    public void display_Queue(){
        if(queue.isEmpty()){
            System.out.println("Queue is Empty.") ;
            return ;
        }

        System.out.print("Queue be: ") ;

        while(!queue.isEmpty()){
            System.out.print(stack1.push(queue.pop()) + " ") ;
        }
        while(!stack1.isEmpty()){
            queue.push(stack1.pop()) ;
        }
        System.out.println()  ;
    }

    public void deque(){
        if(queue.isEmpty()){
            System.out.println("Queue is Empty, UnderFlow Condition.") ;  
            return ;
        }
        System.out.println("Queue after removing "+ queue.pop() ) ;

        display_Queue() ;
        
    }

    public void peek(){
        if(queue.isEmpty()){
            System.out.println("Queue is Empty.") ;
            return ;
        }
        System.out.println("Peek element of Queue be: " + queue.peek()) ;

    }

    public static void main(String [] args){
        System.out.println("5 Program to Implement Queue Using Stack.") ;

        _5_Implement_Queue_Using_Stack obj = new _5_Implement_Queue_Using_Stack()  ;

        obj.enque(1);
        obj.enque(2);
        obj.enque(3);

        obj.deque()  ;

        obj.peek();

        obj.display_Queue()  ;
    }
}
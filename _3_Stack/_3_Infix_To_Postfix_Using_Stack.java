import java.util.Stack ;

public class _3_Infix_To_Postfix_Using_Stack {

    public static boolean is_Operand(char c){
        return Character.isLetterOrDigit(c) ;
    }

    public static int precidence(char c){
        switch(c){
               case '+':
                return 1 ;
                
            case '-':
                return 1 ;
                
            case '*' :
                return 2 ;
                
            case '/' :
                return 2 ;
                
            case '^' :
                return 3 ;
                
            case '(' :
                return 0 ;
                


        }

        return -1 ;

    }

    public static String infix_To_Postfix(String str){

        Stack<Character> stack = new Stack<Character>()  ;
        
        StringBuilder result =  new StringBuilder();
        

        for(int i=0 ; i<str.length(); i++){
            char c = str.charAt(i)  ;
            System.out.println("charcater be: " + c);
            
            if(is_Operand(c)){
                result.append(c) ;
                System.out.println("charcater be: " + c);
            }
            else if(c=='(' ){
                    stack.push(c) ;
                }
            else if(c==')'){
                while(stack.peek() !='(' && !stack.isEmpty()){
                    result.append(stack.pop()) ;
                }
                stack.pop() ;
            }
            else {
        
                while(!stack.isEmpty() && precidence(stack.peek()) >= precidence(c)){
                    result.append(stack.pop()) ;
                }
            
                stack.push(c) ;

            }

            
        }

        while(!stack.isEmpty()){
            result.append(stack.pop()) ;  
        }
        return result.toString()  ;

        
    }
    public static void main(String [] args){
        System.out.println("3 Program Infix To Postfix UsingStack.") ;

        String infix = "K+L-M*N+(O^P)*W/U/V*T+Q"  ;
        System.out.println("infix be: " + infix) ;

        System.out.println(infix_To_Postfix(infix) ); 
    }
    
}




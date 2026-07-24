import java.util.Stack ;
public class _4_Postfix_To_Infix {


    static Stack<String> stack = new Stack<String>()  ;

    public static boolean is_Letter_Or_Digit(char c){
        return Character.isLetterOrDigit(c) ;

    }

    public static void postfix_To_Infix(String postfix){

        for(int i=0 ; i<postfix.length()  ; i++){
            char c = postfix.charAt(i)  ;
            if(is_Letter_Or_Digit(c)){
                stack.push(String.valueOf(c)) ;
            }
            else if(!stack.isEmpty()){
                String A = stack.pop()  ;
                String B = stack.pop() ;


                stack.push("("+B + c + A + ")") ;

            }
        }

        System.out.println("Infix Expression be: " + stack.pop()) ;

    }
    public static void main(String [] args){
        System.out.println("4 Program to convert Postfix to Infix")  ;

        String postfix = "ab+ef/*"  ;

        System.out.println("Postfix Expression be: " + postfix)  ;

        postfix_To_Infix(postfix)  ;
    }
    
}
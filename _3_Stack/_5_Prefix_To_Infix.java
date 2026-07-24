import java.util.Stack ;
public class _5_Prefix_To_Infix{

    static Stack<String> stack = new Stack<String>()  ;

    public static boolean is_Letter_Or_Digit(char c){
        return Character.isLetterOrDigit(c)  ;
    }

    public static void prefix_To_Infix(String infix){
        
        for(int i=infix.length()-1 ; i>=0 ; i--){
            char c= infix.charAt(i) ;

            if(is_Letter_Or_Digit(c)){
                stack.push(String.valueOf(c)) ;
            }
            else if(!stack.isEmpty()){
                String A = stack.pop()  ;
                String B = stack.pop()  ;

                stack.push("(" + A + c + B + ")" ) ;
            }
        }

        System.out.println("Infix be: "+ stack.pop()) ;
    }
    public static void main(String [] args){
        System.out.println("5. Program to Convert Prefix to Infix. ")  ;

        String prefix = "*+ab/ef"  ;

        System.out.println("Prefix Expression be: " + prefix)  ;

        prefix_To_Infix(prefix)  ;



    }
}
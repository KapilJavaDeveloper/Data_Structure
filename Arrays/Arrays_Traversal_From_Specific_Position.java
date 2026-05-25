import java.util.Scanner ;
public class Arrays_Traversal_From_Specific_Position{
    public static void main(String [] args){

        int[] arr = new int [] {1,2,3,4,5,6,7,8, 0, 0}  ;

        Scanner sc = new Scanner(System.in)  ;
        System.out.println("Enter a position from where you want to traverse array: ") ;
        int start = sc.nextInt()  ;

        int size = 8 ;

        if(start>size || start > arr.length || start<=0){
            System.out.println("Enter valid number to traverse a array") ;
        }
        else{
            System.out.println("Array be: ") ;
            for(int i=start-1 ; i<size ; i++){
                System.out.print(arr[i] + " ") ;
            }
        }



    }
}
import java.util.Scanner ;


public class Arrays_Insertion_At_Specific_Position{
    public static void main(String [] args){
        System.out.println("Arrays Insertion at specific position") ;

        int[] arr = new int[5]  ;

        arr[0]  = 1 ;
        arr[1] = 2 ;
        int size = 2 ;

        System.out.println("Arrays be: ") ;


        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ") ;
        }

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number you want to insert in an array: ") ;
        int num = sc.nextInt() ;

        Scanner sc2 = new Scanner(System.in) ;
        System.out.print("Enter the position where you want to insert a number: ") ;
        int pos = sc2.nextInt() ;

        if(pos> arr.length || pos>(size+1) || pos<1 ){
            System.out.println("Invalid position") ;
        }
        else{
            for(int i= size-1 ; i>=pos-1; i--){
                arr[i+1] = arr[i] ;

            }
            arr[pos-1] = num ;
            size++ ;
        }

        System.out.println("Array be: ") ;

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ") ;
        }


        

    }
}
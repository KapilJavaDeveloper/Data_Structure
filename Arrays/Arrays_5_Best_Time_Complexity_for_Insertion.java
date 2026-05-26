import java.util.Scanner ;
public class Arrays_5_Best_Time_Complexity_for_Insertion {
    public static void main(String [] args){
        int[] arr = new int[5] ; 

        arr[0] = 1 ;
        arr[1] = 2 ;

        System.out.println("Array be: ") ;
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ") ;
        }
        System.out.println() ;

        int size = 2 ;
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number you want to insert: ") ;
        int num = sc.nextInt() ;

        System.out.println() ;

        System.out.print("Enter the position where you want to insert an element: ") ;
        int pos = sc.nextInt() ;

        sc.close() ;

        

        if(size>=arr.length || pos>arr.length || pos>(size+1)){
            System.out.println("Invalid position") ;
        }
        else{
            arr[size] = arr[pos-1] ;
            arr[pos-1] = num ;
            size++ ;

        }

        System.out.println() ;
        System.out.println("Array after insertion be: ") ;

        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ") ;
        }

        


    }
    
}

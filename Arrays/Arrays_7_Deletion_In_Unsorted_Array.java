import java.util.Scanner ;
public class Arrays_7_Deletion_In_Unsorted_Array {
    public static void main(String [] args){
        System.out.println("Unsorted Array Deletion") ;

        int[] arr = new int[40] ;

        arr[0] = 5 ;
        arr[1] = 4 ;
        arr[2] = 3 ;
        arr[3] = 10 ;
        arr[4] = 2 ;

       int size = 5 ;

       System.out.println("Array be: ") ;
       for(int i=0 ; i<size ; i++){
        System.out.print(arr[i] + " ") ;
       }

       Scanner sc = new Scanner(System.in) ;
       System.out.println() ;
       System.out.print("Enter the position from where you want to delete the element: ");
       int pos = sc.nextInt() ;
       System.out.println() ;

       if(pos>size || pos<0){
        System.out.println("Invalid position") ;
        System.exit(0) ;
       }
       else{
        arr[pos-1] = arr[size-1] ;
        arr[size-1] = 0; 
        size-- ;
       }

       System.out.println("Array after deletion of element be: ") ;
       for(int i=0 ; i<size ; i++){
        System.out.print(arr[i] + " ") ;
       }





        

    }
    
}

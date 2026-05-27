import java.util.Scanner ;
public class Arrays_6_Deletion_In_Sorted_Array{
    public static void main(String [] args){
        System.out.println("Deletion in an array") ;

        int[] arr = new int[50]  ;

        arr[0] = 1 ;
        arr[1] = 2 ;
        arr[2] = 3 ;
        arr[3] = 4 ;

        int size = 4 ;
        System.out.println("Array be: ");
        for(int i=0 ; i<size ; i++){
            System.out.print(arr[i] + " ") ;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println() ;
        System.out.println("From Which position you want to delete the data: ") ;
        int pos = sc.nextInt() ;

      
        if(pos >size || pos> arr.length || pos<=0){
            System.out.println("Invalid position") ;
            System.exit(0) ;
        }
        else{
            for(int i=pos-1 ; i<size-1 ; i++){
                arr[i] = arr[i+1] ;
            }
            arr[size-1] = 0 ;
            size-- ;
        
        
        }

        System.out.println("Array after deletion of element be: ") ;

        for(int i=0 ; i<size ; i++){
            System.out.print(arr[i] + " ") ;
        }



    }
}
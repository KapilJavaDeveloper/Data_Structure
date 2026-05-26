public class Arrays_4_Insertion_At_End {
    public static void main(String [] args){
        int[] arr = new int [5] ;
        arr[0] = 1 ;
        arr[1] = 2 ;
        int size = 2 ;

        int num = 90 ;

        System.out.println("Array be: ") ;
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ") ;
        }

        if(size>=arr.length){
            System.out.println("Array overflow") ;
        }
        else{
            arr[size] = num ;
            size++ ;
        }

        System.out.println() ;

        System.out.println("Array after inserting element at the end be: ") ;

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ") ;
        }
        
    }
    
}

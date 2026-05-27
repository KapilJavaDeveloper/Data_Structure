public class Arrays_3_Insertion_At_Beginning {
    public static void main(String [] args){
        System.out.println("Insertion at Beginning in an Array") ;

        int[] arr = new int[5] ;
        arr[0] = 1 ;
        arr[1] = 2 ;
        arr[2] = 2 ;
        arr[3] = 2 ;
        int size = 4 ;
        int num = 12 ;

        System.out.println("Array be: ") ;

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ") ;
        }

        if(size==arr.length){
            System.out.println("Array is full") ;
        }
        else{
            for(int i=size-1 ; i>=0 ; i--){
                arr[i+1] = arr[i] ; 
            }
            arr[0] = num ;
        }

        System.out.println() ;

        System.out.println("Array after insertion at the beginning be: ") ;
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ") ;

        }


    }
    
}

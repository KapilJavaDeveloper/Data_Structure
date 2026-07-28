import java.util.Arrays ;
public class _2_Insertion_Sort {
    public static void main(String [] args){
        System.out.println("2 Program for Insertion Sort.")  ;

        int[] array = {5,4,10,1,6,2}  ;

        System.out.println("Array be: "  + Arrays.toString(array))  ;

        for(int i=1 ; i< array.length ; i++){
            int temp = array[i]  ;

            int j = i-1 ;

            while(j>=0 && array[j] > temp){
                array[j+1]  = array[j]  ;
                j-- ;
            }
            array[j+1] = temp ;  
        }

        System.out.println("Sorted Array by insertion sort be: "  + Arrays.toString(array)) ;

    }
    
}

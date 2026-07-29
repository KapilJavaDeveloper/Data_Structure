import java.util.Arrays ;
public class _4_Quick_Sort {

    public static int  partition(int[] array , int lower_Bound , int upper_Bound){
        int start = lower_Bound ;
        int end = upper_Bound ;

        int pivot = array[lower_Bound]  ;

        while(start < end){

            
            while(start <= upper_Bound && array[start] <= pivot){
                start++ ;
                
            }
            while(array[end] > pivot){
                end-- ;
            }
            
            if(start < end){
                
                int temp = array[start]  ;
                
                array[start]  = array[end]  ;
                array[end]  = temp ;
                  
                
            }

        }

        int temp = array[lower_Bound] ; ;
        array[lower_Bound]  = array[end]  ;
        array[end]  = temp ;

        return end ;

    }

    public static void quick_Sort(int[] array , int lower_Bound , int upper_Bound){

        if(lower_Bound < upper_Bound){
            int loc = partition(array , lower_Bound , upper_Bound)  ;
            quick_Sort(array ,lower_Bound, loc-1 )  ;
            quick_Sort(array , loc+1 , upper_Bound)  ;
        }

    }
    public static void main(String []  args){
        System.out.println("4 Program Quick Sort")   ;

        int[] arr = {7, 6, 10 , 5 , 9 , 2 , 1 , 15, 7}  ;

        System.out.println("Original Array be: " + Arrays.toString(arr)) ;
        quick_Sort(arr, 0, arr.length-1);
        System.out.println("Sorted Array be: " + Arrays.toString(arr)) ;




    }
    
}

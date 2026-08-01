import java.util.Arrays ; 
public class _5_Merge_Sort {

    public static void merge(int[] array , int lower_Bound , int mid , int upper_Bound){

        int i = lower_Bound ;
        int j = mid+1 ;
        int k = lower_Bound ;

        int[] result = new int[array.length]  ;

        while(i<=mid && j<=upper_Bound){
            if(array[i] < array[j]){
                result[k]  = array[i]  ;
                i++ ;
            }
            else{
                result[k] = array[j]  ;
                j++ ;
            }

            k++ ;
        }

        while(i<=mid){
            result[k] = array[i] ;
            k++ ;
            i++ ;
        }
        while(j<=upper_Bound){
            result[k] = array[j]  ;
            k++ ;
            j++ ;
        }

        for(int element=lower_Bound ; element<=upper_Bound ; element++){
            array[element]  = result[element]  ;
        }

    }

    public static void merge_Sort(int[] array , int lower_Bound , int upper_Bound){

        

        if(lower_Bound < upper_Bound){
            int mid = (lower_Bound + upper_Bound)/2 ;
            merge_Sort(array , lower_Bound , mid)  ;
            merge_Sort(array ,mid+1 , upper_Bound )  ;
            merge(array , lower_Bound , mid , upper_Bound  )  ;
        }

    
    }
    public static void main(String [] args){
        System.out.println("5 Program for Merge Sort.")  ;


        int[] array = {15, 5, 24, 8, 1, 3, 16 , 10 , 20}  ;

        System.out.println("Array be: " + Arrays.toString(array))  ;

        merge_Sort(array , 0 , array.length-1 ) ;

        System.out.println("Sorted Array be: " + Arrays.toString(array))  ;

    }
    
}
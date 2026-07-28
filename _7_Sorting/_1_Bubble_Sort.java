import java.util.Arrays ;
public class _1_Bubble_Sort{
    public static void main(String [] args){

        System.out.println("1 Program To sort the array by Bubble sort.")  ;

        int[] array = new int[] {15 , 16 , 6, 8 , 5}  ;

        System.out.println("Original Array be: "+ Arrays.toString(array))  ;

        for(int i=0 ; i<array.length-1 ; i++){
            boolean swapping = false ;
            for(int j =0 ; j<array.length-1-i ; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j]  ;
                    array[j]  = array[j+1]  ;
                    array[j+1]  = temp ;
                    swapping = true ;
                }
                if(swapping==false){
                    break ;
                }
               
            }
        }

        System.out.println("Sorted Array be: "+ Arrays.toString(array))  ;


    }
}
import java.util.Arrays ;
public class _3_Selection_Sort{
    public static void main(String[] args){
        System.out.println("3 Program Selection Sort.")  ;

        int[] array = new int[]  {7,4,10,8,3,1}  ;

        System.out.println("Original Array be: "+ Arrays.toString(array))  ;

        for(int i=0 ; i<array.length-1 ; i++){

            int index = i ;

            for(int j= i+1 ; j< array.length ; j++){

                if(array[index] > array[j]){
                    index = j ;
                }
                
            }

            if(index !=i){
                int temp = array[i]  ;
                array[i]  = array[index] ;
                array[index]  = temp ;
            }

        

           
        }

        System.out.println("Sorted Array be: " + Arrays.toString(array))  ;
    }

}
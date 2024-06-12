package codingninjas.arrays;

public class PartitionOfArrays {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,5,9,2,4};
        partition(arr);
        for(int element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    //OUTPUT:   1 3 4 2 4 <-greater lesser-> 9 6 5
    private static void partition(int[] arr){
        // 3 regions greater than i -> unknown, 0 - j-1 -> less than pivot, j - i-1 ->greater than pivot
        int pivot = arr[arr.length-1];
        int i = 0;
        int j = 0;
        while(i < arr.length){
            if(arr[i] <= pivot) {
               swap(arr,i,j);
               i++;
               j++;
            } else{
                i++;
            }
        }
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

package codingninjas.timeNspace;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,9,4,7,2};
        bubbleSort(arr);
        for(int element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    private static void bubbleSort(int[] arr) {
        for(int i=1; i<arr.length-1; i++){
            for(int j=1; j<=arr.length - i; j++){
                if(arr[j-1] > arr[j]) {
                    swap(arr,j-1,j);
                }
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

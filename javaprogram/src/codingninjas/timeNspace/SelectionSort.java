package codingninjas.timeNspace;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,7,3,12,8};
        SelectionSort(arr);
        for(int element:arr) {
            System.out.println(element);
        }
    }
    private static int[] SelectionSort(int[] arr) {
        // going till n-1 because if 4 are sorted the fifth will be obviously sorted.
        for(int i=0; i< arr.length-1; i++) {
            int min = i;
            for(int j=i+1; j<=arr.length-1; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr,i,min);
        }
        return arr;
    }
    private static int[] swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}

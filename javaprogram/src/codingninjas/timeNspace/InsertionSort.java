package codingninjas.timeNspace;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,7,3,12,8};
        insertionSort(arr);
        for(int element:arr) {
            System.out.println(element);
        }
    }

    private static void insertionSort(int[] arr) {
        for(int i=1; i<=arr.length-1; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                } else {
                    break;
                }
            }
        }
    }
    private static int[] swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}

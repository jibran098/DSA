package codingninjas.arrays;

public class Merge2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {4,6,7,12,22};
        int[] arr2 = {3,7,9,11,13,15,20,25};
        int[] newSorted = new int[arr1.length+arr2.length];
        merge(arr1,arr2, newSorted);
        for(int element:newSorted) {
            System.out.print(element + " ");
        }
    }
    private static int[] merge(int[] arr1, int[] arr2, int[] newSorted){
        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j<arr2.length) {
            if(arr1[i] < arr2[j]) {
                newSorted[k] = arr1[i];
                i++;
                k++;
            } else {
                newSorted[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            newSorted[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            newSorted[k] = arr2[j];
            j++;
            k++;
        }
        return newSorted;
    }
}

package codingninjas.arrays;

public class BarChartPattern {
    public static void main(String[] args) {
        pattern(new int[]{3,7,5,6,2});
    }
    private static void pattern(int[] arr) {
        int max = max(arr);
        for(int i=max; i>0; i--) {
            for(int j=0; j<arr.length; j++) {
                if(arr[j] < i) {
                    System.out.print("  ");
                }else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
    private static int max(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

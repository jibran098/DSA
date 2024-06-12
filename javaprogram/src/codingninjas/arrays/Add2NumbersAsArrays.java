package codingninjas.arrays;

public class Add2NumbersAsArrays {
    public static void main(String[] args) {
        int[] result = arraySum();
        for(int element: result) {
            System.out.print(element+" ");
        }

    }
    private static int[] arraySum() {
        int[] arr1 = {5,7,4,6};
        int[] arr2 = {9,8,7,2,8};
        //Store it in 3rd array of size greater among the 2 arrays.
        int[] sum = new int[arr2.length];
        // iterate for size of greater array and keep adding it to the 3rd array.
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;
        int carry = 0;
        for(; k>=0;k--){
            //carry could have been appended below in condition 1, but suppose if there is no digit1 it won't be called in case i<0.
            int digit1 = 0 + carry;
            int digit2 = 0;
            if(i>=0) {
                digit1 += arr1[i];
            }
            if(j>=0) {
                digit2 += arr2[j];
            }
            sum[k] = (digit1 + digit2) % 10;
            carry = (digit1 + digit2) / 10;
            i--;
            j--;
        }
        if(carry != 0) {
            sum[0] += carry*10;
        }
        return sum;
    }
}

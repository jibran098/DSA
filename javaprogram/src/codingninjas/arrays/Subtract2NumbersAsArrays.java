package codingninjas.arrays;

public class Subtract2NumbersAsArrays {
    public static void main(String[] args) {
        int[] result = arraySub();
        for(int element: result) {
            System.out.print(element+" ");
        }

    }
    private static int[] arraySub() {
        int[] arr1 = {1,0,0,0,0};
        int[] arr2 = {1};
        int[] sub = new int[arr1.length>arr2.length?arr1.length:arr2.length];
        int carry = 0;
        int i = arr1.length -1;
        int j = arr2.length -1;
        int k = sub.length -1;
        while(k>=0) {
            int digit1 = carry;
            int digit2 = 0;
            digit1 += arr1[i];
            if(j>=0) {
                digit2 += arr2[j];
            }
            if(digit1 < digit2) {
                digit1 += 10;
                carry = -1;

            }else {
                carry = 0;
            }
            sub[k] = digit1 - digit2;
            i--;
            j--;
            k--;
        }
        return sub;
    }
}


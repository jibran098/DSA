package codingninjas.recursion;

import java.util.Arrays;

public class AllIndices {
    public static void main(String[] args) {
        System.out.println("HELLLO WORLD");
        AllIndices main = new AllIndices();
        int[] arr = {2,6,10,8,6,5};
        int[] output = main.allOccurrences(arr,6,0,0);
        Arrays.stream(output)
                .forEach(System.out::println);
    }
    public int[] allOccurrences(int[] input, int element,int startIndex, int fsf) {
        //base case
        if(startIndex == input.length) {
            return new int[fsf];
        }
        if(input[startIndex] == element) {
            int[] allIndices = allOccurrences(input,element,startIndex+1, fsf+1);
            allIndices[fsf] = startIndex;
            return allIndices;
        }else {
            int[] allIndices = allOccurrences(input,element,startIndex+1, fsf);
            return allIndices;
        }
    }
}



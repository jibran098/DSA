package codingninjas.recursion;

public class sameCharacterAddStart {

    // Return the changed string   hel*lo
    public static String StartPair(String input){
        //base case
        if(input.length() <=1) {
            return input;
        }
        if(input.charAt(0) == input.charAt(1)) {
            return input.charAt(0) + "*" + StartPair(input.substring(1));
        }
        return input.charAt(0) + StartPair(input.substring(1));
    }
    public static void main(String[] args) {
        String output = StartPair("hhellooo");
        System.out.println(output);
    }
}

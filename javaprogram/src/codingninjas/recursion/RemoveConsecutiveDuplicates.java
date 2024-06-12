package codingninjas.recursion;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String output = Remove("aaaaaanbbbcccccca");
        System.out.println(output);
    }
    public static String Remove(String str) {
        //base case
        if(str.length() <= 1){
            return str;
        }
        if(str.charAt(0) == str.charAt(1)) {
            return "" + Remove(str.substring(1));

        }
        return str.charAt(0) + Remove(str.substring(1));
    }
}

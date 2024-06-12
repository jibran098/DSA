package codingninjas.recursion;

public class RemoveX {
    public static void main(String[] args) {
        String output = Remove("xabcxax");
        System.out.println(output);
    }
    public static String Remove(String str) {
        //base case
        if(str.length() <= 0){
            return str;
        }
        if(str.charAt(0) == 'x') {
            return "" + Remove(str.substring(1));

        }
        return str.charAt(0) + Remove(str.substring(1));
    }

}

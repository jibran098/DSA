package codingninjas.recursion;

public class ReplacePi {

    // Return the changed string   x p i x a s
    public static String replace(String input){
        if(input.length() <= 1) {
            return input;
        }
        if(input.charAt(0)== 'p' && input.charAt(1) =='i') {
            return "3.14" + replace(input.substring(2));

        } else {
            return input.charAt(0) + replace(input.substring(1));
        }



    }
    public static void main(String[] args) {
        String output = replace("pixapis");
        System.out.println(output);
    }
}

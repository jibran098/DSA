package codingninjas.basic;

public class BenjaminBulbs {
    private static void benjaminBulbs(int n) {
        for(int i=1; i*i <= n; i++) {
           System.out.print(i*i + " ");
        }
    }
    public static void main(String[] args) {
        benjaminBulbs(100);
    }
}

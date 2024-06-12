package codingninjas.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        TowerOfHanoi(3,'A','B','C');
    }
    private static void TowerOfHanoi(int n, Character Source, Character Dest, Character Helper) {
        if(n == 0){
            return;
        }
        TowerOfHanoi(n-1,Source,Helper,Dest);
        System.out.println("Move " + n + " from "+Source+" -> "+Dest);
        TowerOfHanoi(n-1,Helper,Dest,Source);
    }
}

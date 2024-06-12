package codingninjas.basic;

public class RotateNumber {
    public static int rotateNumber(int num, int rotateBy) {
        int digitCount = 0;
        //loop over until number becomes 0.
        int tempNum = num;
        while(tempNum > 0) {
            tempNum = tempNum / 10;
            digitCount++;
        }
        // if rotate by 7 that means rotate by 2 because when rotate by 5 it gives same number again.
        rotateBy = rotateBy % digitCount;
        // now you have digit count
        if(rotateBy < 0) {
            rotateBy = rotateBy + digitCount;
        }
        // to do 2 rotation for 36542  365 | 42
        int div = 1, mult = 1;
        // create divisor and multiplier from number.
        // divisor would be equal to rotateBy.
        // Multiplier would be of remaining number of digit (like: 5 - 2 = 3)
        for(int i=1 ; i<=digitCount; i++) {
            if(i <= rotateBy) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }
        return num / div + (num % div) * mult;
    }
    public static void main(String[] args) {
        System.out.println(rotateNumber(36542,-3));
    }
}
//edge cases:
//1. if rotated by negative number (means rotating in reverse) make it positive.
// because negative rotation = positive rotation - num. of digit

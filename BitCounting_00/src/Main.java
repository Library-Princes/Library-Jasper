import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        BitCounting bc = new BitCounting();
        System.out.println(bc.countBits(1));
    }
}

/**
 * Write a function that takes an integer as input, and returns the number of bits
 * that are equal to one in the binary representation of that number. (non negative)
 *
 * Do with the hard-coding need to refactor it.
 */

class BitCounting{
    public static int countBits(int n){
        int ans = 0;
        ArrayList<Integer> al = new ArrayList<>();
        // Step 1: declare the variable up/down
        int up;
        int down;

        if(n == 0){
            return ans;
        } else if (n == 1) {
            ans = 1;
            return ans;
        } else {
            // Step 2: use iterator and save in ArrayList
            do {
                up = n / 2;
                down = n % 2;
                al.add(down);
                n = up;
            } while (n > 1);
        }
        ans = Collections.frequency(al,1) + 1;
        return ans;
    }
}
//answer should be 5
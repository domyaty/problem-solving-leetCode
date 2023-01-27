import java.util.*;
class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10;
            num /= 10;
        }
        
        Arrays.sort(digits);
        int n1 = digits[0] * 10 + digits[2];
        int n2 = digits[1] * 10 + digits[3];
        return n1 + n2;
    }
}
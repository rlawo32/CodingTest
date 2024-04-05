import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger bi1 = new BigInteger(a);
        BigInteger bi2 = new BigInteger(b);
        BigInteger bi3 = bi1.add(bi2);
        return String.valueOf(bi3);
    }
}
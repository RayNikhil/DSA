import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
         BigInteger n = new BigInteger(s, 2);
        int c = 0;

        while (n.compareTo(BigInteger.ONE) > 0) {
            if (!n.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                n = n.add(BigInteger.ONE);
            } else {
                n = n.divide(BigInteger.valueOf(2));
            }
           c++; 
        }
        return c;
    }
}
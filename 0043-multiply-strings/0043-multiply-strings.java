import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger num11=new BigInteger(num1);
        BigInteger num22=new BigInteger(num2);
        BigInteger ans=num11.multiply(num22);
        return ans.toString();
    }
}
import java.math.BigInteger;

/**
 * Created by rishabh anand on 2/28/2016.
 */
public class FibDynamic {
    public static BigInteger[] fib = new BigInteger[100];

    public static BigInteger Fib(int n){
        if (n <= 2 && fib[n-1] == null){
            return BigInteger.ONE;
        }
        else if (fib[n-1] != null){
            return fib[n-1];
        }
        else {
            fib[n-1] = Fib(n-2).add(Fib(n-1));
            return fib[n-1];
        }
    }

    public static void main(String[] args){
        System.out.println(Fib(90));
    }
}

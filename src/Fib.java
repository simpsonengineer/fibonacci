import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fib {
    public static void main(String[] args) {
	int numFibs = (args.length > 0) ? Integer.parseInt(args[0]) : 10;
        System.out.println("10 Fibonacci numbers: " + fibs(numFibs));
    }

    private static List<BigInteger> fibs(int numFibs) {
        return Stream.iterate(
                new BigInteger[]{BigInteger.ONE, BigInteger.ONE}, t->new BigInteger[]{t[1], t[0].add(t[1])})
                .limit(numFibs)
                .map(t->t[0])
                .collect(Collectors.toList());
    }
}

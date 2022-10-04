import java.util.Scanner;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mySqrt(scanner.nextInt()));
    }
    public static int mySqrt(int x){
        for (int i = 1; i < x; i++) {
            if (x/i==i) {
                return i;
            }
        }
        return x;
    }

}
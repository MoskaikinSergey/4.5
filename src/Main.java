import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        int a = 10_000_000;
        int b = 1_000_000_000;
        long sum = getArithmeticProgressionSum(a, b);
        System.out.println("Сумма чисел от " + a + " до " + (b - 1) + " равна: " + sum);
    }

    public static long getArithmeticProgressionSum(int a, int b) {
        return LongStream.rangeClosed(a, b - 1).sum();
    }
}
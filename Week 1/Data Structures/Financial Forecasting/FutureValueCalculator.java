import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FutureValueCalculator {

    private static Map<Integer, Double> cache = new HashMap<>();

    public static double computeFutureValue(double initialAmount, double annualRate, int timePeriod) {
        if (cache.containsKey(timePeriod)) {
            return cache.get(timePeriod);
        }

        if (timePeriod == 0) {
            return initialAmount;
        }

        double futureValue = computeFutureValue(initialAmount * (1 + annualRate), annualRate, timePeriod - 1);
        cache.put(timePeriod, futureValue);
        return futureValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Initial Investment Amount: ");
        double principal = input.nextDouble();

        System.out.print("Annual Interest Rate (decimal form): ");
        double rate = input.nextDouble();

        System.out.print("Investment Duration (in years): ");
        int years = input.nextInt();

        double result = computeFutureValue(principal, rate, years);
        System.out.printf("Projected Future Value: %.2f%n", result);

        input.close();
    }
}

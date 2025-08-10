import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount (in Rupees): ");
        double amount = sc.nextDouble();

        System.out.print("Enter Annual Growth Rate (in Percent): ");
        double rate = sc.nextDouble() / 100.0;

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        double predictedValue = ForecastCalculatorTool.predictFutureValue(years, amount, rate);
        System.out.printf("Predicted Value after %d years is Rs.%.2f%n", years, predictedValue);
        sc.close();
    }
}
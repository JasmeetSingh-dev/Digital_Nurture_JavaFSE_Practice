public class ForecastCalculatorTool {
    public static double predictFutureValue(int years, double initialAmount, double growthRate) {
        if (years == 0) return initialAmount;
        double previousYear = predictFutureValue(years - 1, initialAmount, growthRate);
        return previousYear * (1 + growthRate);
    }
}
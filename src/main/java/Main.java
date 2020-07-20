import Calculators.AdvancedCalculator;
import Calculators.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new AdvancedCalculator();
        calculator.subtract(200.0, 150.0);
        System.out.println(calculator.divide(100.1, 0d));
        AdvancedCalculator.printGlobalOperations();
        AdvancedCalculator.clearGlobalHistory();
        AdvancedCalculator.printGlobalOperations();
        calculator.add(2.9, 3.9);
        AdvancedCalculator.printGlobalOperations();

    }
}

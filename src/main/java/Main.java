import Calculators.AdvancedCalculator;
import Calculators.Calculator;
import org.graalvm.compiler.asm.aarch64.AArch64MacroAssembler;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new AdvancedCalculator();
        calculator.subtract(200.0, 150.0);
        System.out.println(calculator.divide(100.1, 0d));
        calculator.printOperations();
        AdvancedCalculator.printGlobalOperations(1);

    }
}

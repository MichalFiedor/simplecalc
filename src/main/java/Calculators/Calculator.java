package Calculators;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Calculator {
    protected static String[] operationHistory = new String[0];
    protected static String[] allHistory = new String[0];

    public Calculator() {
    }

    protected static String[] addingOperation(String description) {
        operationHistory = Arrays.copyOf(operationHistory, operationHistory.length + 1);
        operationHistory[operationHistory.length - 1] = description;
        return operationHistory;
    }

    public Double add(Double num1, Double num2) {
        Double result = num1 + num2;
        addingOperation("added " + num1 + " to " + num2 + " got " + result);
        addToGlobalHistory("added " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    public Double multiply(Double num1, Double num2) {
        Double result = num1 * num2;
        addingOperation("multiplied " + num1 + " with " + num2 + " got " + result);
        addToGlobalHistory("multiplied " + num1 + " with " + num2 + " got " + result);
        return result;
    }

    public Double subtract(Double num1, Double num2) {
        Double result = num2 - num1;
        addingOperation("subtracted " + num1 + " from " + num2 + "got" + result);
        addToGlobalHistory("subtracted " + num1 + " from " + num2 + "got" + result);
        return result;
    }

    public double divide(int num1, int num2) {
        try {
            double result = num1 / num2;
            addingOperation("divided " + num1 + " by " + num2 + " got " + (double) num1 / (double) num2);
            addToGlobalHistory("divided " + num1 + " by " + num2 + " got " + (double) num1 / (double) num2);
            return (double) num1 / (double) num2;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0");
            return 0;
        }
    }

    public Double pow(Double num1, Double num2){
        return 0.0;
    }

    public void  printOperations() {
        System.out.println(StringUtils.join(operationHistory, ", "));
    }

    public void clearOperations() {
        operationHistory = new String[0];
    }

    public String[] addToGlobalHistory(String description) {
        return null;
    }
}

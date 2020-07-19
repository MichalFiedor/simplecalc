package Calculators;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class AdvancedCalculator extends Calculator {
    private static StringBuilder sb = new StringBuilder();

    public AdvancedCalculator() {
        super();
    }

    @Override
    public Double pow(Double num1, Double num2) {
        Double result = Math.pow(num1, num2);
        addingOperation(num1 + "^" + num2 + " equals: " + result);
        addToGlobalHistory(num1 + "^" + num2 + " equals: " + result);
        return result;
    }

    public Double root(Double num1, Double num2) {
        Double result = Math.pow(num1, 1 / num2);
        addingOperation(num1 + " root of " + num2 + " equals: " + result);
        addToGlobalHistory(num1 + " root of " + num2 + " equals: " + result);
        return result;
    }

    public static Double computeCircleArea(Double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static void printGlobalOperations() {
        System.out.println(StringUtils.join(allHistory, ", "));
    }

    public static void printGlobalOperations(int length) {
        try {
            for (int i = allHistory.length - 1; i >= allHistory.length - length; i--) {
                sb.append(allHistory[i] + ", ");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Given value is out of range");
            System.exit(0);
        }
        System.out.println(sb.toString());
    }

    public static void printGlobalOperations(String length) {
        try {
            for (int i = allHistory.length - 1; i >= allHistory.length - Integer.parseInt(length); i--) {
                sb.append(allHistory[i] + ", ");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Given value is out of range");
            System.exit(0);
        }
        System.out.println(sb.toString());
    }

    public String[] addToGlobalHistory(String description) {
        allHistory = Arrays.copyOf(allHistory, allHistory.length + 1);
        allHistory[allHistory.length - 1] = description;
        return allHistory;
    }
}

package calculator;

import java.util.Scanner;

public class Calculator {

    private static double value = 0.0;

    public Calculator() {
        System.out.println("You can add, subtract, multiply anf divide");

        String command;
        do {
            askUser();

            String plus = "+";
            String minus = "-";
            String multiply = "*";
            String divide = "/";

            Scanner in = new Scanner(System.in);
            command = in.next();
            double valueToBeExecuted;

            if (command.equalsIgnoreCase("q")) {
                System.out.println("Thank you, Hope you like our App");
                break;
            }

            try {
                valueToBeExecuted = Integer.parseInt(command.substring(1));
            } catch (NumberFormatException e) {
                boolean intyException = false;
                do {
                    intyException = false;
                    System.out.println("don't understand. Please try again");
                    askUser();
                    command = in.next();
                    try {
                        int inty = Integer.parseInt(command.substring(1));
                    } catch (Exception e1) {
                        intyException = true;
                    }
                } while (intyException == true);
            }

            if (command.startsWith(plus)) {
                add(valueToBeExecuted = Integer.parseInt(command.substring(1)));
            } else if (command.startsWith(minus)) {
                subtract(valueToBeExecuted = Integer.parseInt(command.substring(1)));
            } else if (command.startsWith(multiply)) {
                multiply(valueToBeExecuted = Integer.parseInt(command.substring(1)));
            } else if (command.startsWith(divide)) {
                divide(valueToBeExecuted = Integer.parseInt(command.substring(1)));
            }
        } while (!command.equalsIgnoreCase("q"));
    }

    public double add(double addedValue) {
        double currentValue = value + addedValue;
        System.out.println(value + " + " + addedValue + " = " + currentValue);
        value = currentValue;
        return value;
    }

    public double subtract(double subtractedValue) {
        double currentValue = value - subtractedValue;
        System.out.println(value + " - " + subtractedValue + " = " + currentValue);
        value = currentValue;
        return value;
    }

    public double multiply(double multiplyBy) {
        double currentValue = value * multiplyBy;
        System.out.println(value + " * " + multiplyBy + " = " + currentValue);
        value = currentValue;
        return value;
    }

    public double divide(double divideBy) {
        double currentValue = value / divideBy;
        System.out.println(value + " / " + divideBy + " = " + currentValue);
        value = currentValue;
        return value;
    }

    public void askUser() {
        System.out.println("______________________________________________");
        System.out.println("to ADD -> +'value'" +
                "\nto SUBTRACT -> -'value'" +
                "\nto MULTIPLY -> *'value'" +
                "\nto DIVIDE -> /'value'");
        System.out.println("to Quit -> 'Q'");
        System.out.println("current value= " + value);
        System.out.println("what do you want to do?");
        System.out.println("...?");
    }
}

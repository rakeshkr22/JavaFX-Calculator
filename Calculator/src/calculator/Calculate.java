package calculator;

/**
 *
 * @author rakesh
 * @since september 2k16
 */
public class Calculate {
    
    public static String calculate(String input) {
        String[] expr = input.split(" ");
        int i = 0;
        double operLeft = Double.valueOf(expr[i++]);
        while (i < expr.length) {
            String operator = expr[i++];
            double operRight = Double.valueOf(expr[i++]);
            switch (operator) {
                case "*":
                    operLeft = operLeft * operRight;
                    break;
                case "/":
                    operLeft = operLeft / operRight;
                    break;
                case "+":
                    while (i < expr.length) {
                        String operator2 = expr[i++];
                        if (operator2.equals("+") || operator2.equals("-")) {
                            i--;
                            break;
                        }
                        if (operator2.equals("*")) {
                            operRight = operRight * Double.valueOf(expr[i++]);
                        }
                        if (operator2.equals("/")) {
                            operRight = operRight / Double.valueOf(expr[i++]);
                        }
                    }
                    operLeft = operLeft + operRight;
                    break;
                case "-":
                    while (i < expr.length) {
                        String operator2 = expr[i++];
                        if (operator2.equals("+") || operator2.equals("-")) {
                            i--;
                            break;
                        }
                        if (operator2.equals("*")) {
                            operRight = operRight * Double.valueOf(expr[i++]);
                        }
                        if (operator2.equals("/")) {
                            operRight = operRight / Double.valueOf(expr[i++]);
                        }
                    }
                    operLeft = operLeft - operRight;
                    break;
            }
        }
        if((operLeft+"").split("\\.")[1].equals("0"))
            return (operLeft+"").split("\\.")[0];
        else
            return operLeft+"";
    }
    
}

/*
 * Creative Commons Attribution-NonCommercial
 * https://creativecommons.org/licenses/by-nc/4.0/
 */
package ExpressionSolve;

/**
 * @author Josh Baird
 */
public class ExpressionSolver {

    public static void solve(String s) {
        s = s.trim();
        String exp = s;
        int firstOperationIndex = 0;
        String firstOperation = "";

        while (s.contains("*") || s.contains("/")) {
            int multPos = s.indexOf("*");
            int divPos = s.indexOf("/");

            if (multPos == -1) {
                firstOperation = "/";
            } else if (divPos == -1) {
                firstOperation = "*";
            } else if (multPos < divPos) {
                firstOperation = "*";
            } else if (divPos < multPos) {
                firstOperation = "/";
            }
            firstOperationIndex = s.indexOf(firstOperation);
            Integer operand1 = 0;
            Integer operand2 = 0;

            int i = firstOperationIndex;
            while (i > 0) {
                try {
                    i--;
                    operand1 = Integer.parseInt(s.substring(i, firstOperationIndex));
                } catch (NumberFormatException e) {
                    break;
                }
            }

            i = firstOperationIndex + 1;
            while (i < s.length()) {
                try {
                    i++;
                    operand2 = Integer.parseInt(s.substring(firstOperationIndex + 1, i));
                } catch (NumberFormatException e) {
                    break;
                }
            }

            if (firstOperation.equals("*")) {
                Integer val = operand1 * operand2;
                String temp = operand1.toString() + firstOperation + operand2.toString();
                s = s.replace(temp, val.toString());
            } else if (firstOperation.equals("/")) {
                Integer val = operand1 / operand2;
                String temp = operand1.toString() + firstOperation + operand2.toString();
                s = s.replace(temp, val.toString());
            }
        }
        while (s.contains("+") || s.contains("-")) {
            int plusPos = s.indexOf("+");
            int minusPos = s.indexOf("-");

            if (minusPos == 0) {
                break;
            } else if (plusPos == -1) {
                firstOperation = "-";
            } else if (minusPos == -1) {
                firstOperation = "+";
            } else if (plusPos < minusPos) {
                firstOperation = "+";
            } else if (minusPos < plusPos) {
                firstOperation = "-";
            }
            firstOperationIndex = s.indexOf(firstOperation);
            Integer operand1 = 0;
            Integer operand2 = 0;

            int i = firstOperationIndex;
            while (i > 0) {
                try {
                    i--;
                    operand1 = Integer.parseInt(s.substring(i, firstOperationIndex));
                } catch (NumberFormatException e) {
                    break;
                }
            }

            i = firstOperationIndex + 1;
            while (i < s.length()) {
                try {
                    i++;
                    operand2 = Integer.parseInt(s.substring(firstOperationIndex + 1, i));
                } catch (NumberFormatException e) {
                    break;
                }
            }

            if (firstOperation.equals("+")) {
                Integer val = operand1 + operand2;
                String temp = operand1.toString() + firstOperation + operand2.toString();
                s = s.replace(temp, val.toString());
            } else if (firstOperation.equals("-")) {
                Integer val = operand1 - operand2;
                String temp = operand1.toString() + firstOperation + operand2.toString();
                s = s.replace(temp, val.toString());
            }

        }
        System.out.println(exp + " = " + s);
    }
}

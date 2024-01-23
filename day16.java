import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid expression: Not enough operands for operator " + token);
                }

                int v1 = stack.pop();
                int v2 = stack.pop();
                stack.push(performOperation(v2, v1, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid expression: Not enough operators");
        }

        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int performOperation(int v2, int v1, String operator) {
        switch (operator) {
            case "+":
                return v2 + v1;
            case "-":
                return v2 - v1;
            case "*":
                return v2 * v1;
            case "/":
                if (v1 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return v2 / v1;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}

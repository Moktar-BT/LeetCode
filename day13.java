import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                if (currentChar == '(') stack.push(')');
                else if (currentChar == '[') stack.push(']');
                else if (currentChar == '{') stack.push('}');
            } else {
                if (stack.isEmpty() || stack.pop() != currentChar) {
                    return false; 
                }
            }
        }
        return stack.isEmpty();
    }
}

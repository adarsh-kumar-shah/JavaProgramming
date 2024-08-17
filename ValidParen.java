import java.util.ArrayDeque;
import java.util.Deque;

class ValidParen {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParen solution = new ValidParen();

        String[] testCases = {
            "()",           
            "()[]{}",       
            "(]",           
            "([)]",         
            "{[]}",         
            "",             
            "((()))",       
            "([{}])",       
            "({[)]}"        
        };

        for (String testCase : testCases) {
            boolean result = solution.isValid(testCase);
            System.out.println("Input: " + testCase + " -> " + result);
        }
    }
}

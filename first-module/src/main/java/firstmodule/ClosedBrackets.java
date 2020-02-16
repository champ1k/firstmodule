package firstmodule;

import java.util.Stack;

public class ClosedBrackets {
    public boolean brackets(String text) {
        if (text == null)
            throw new IllegalArgumentException("Enter brackets line!");
        boolean isGood = false;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == '(' || symbol == '{' || symbol == '[')
                stack.push(symbol);
            else if (symbol == ']') {
                if (stack.empty() || stack.pop() != '[')
                    return isGood;
            } else if (symbol == '}') {
                if (stack.empty() || stack.pop() != '{')
                    return isGood;
            } else if (symbol == ')') {
                if (stack.empty() || stack.pop() != '(')
                    return isGood;
            }
        }
        if(stack.empty())
            isGood=true;
       return isGood;
    }
}

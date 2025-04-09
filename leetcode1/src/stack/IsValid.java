package stack;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // 如果是左括号，压入栈中
                stack.push(c);
            } else {
                // 如果是右括号，检查栈是否为空或栈顶元素是否匹配
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // 如果栈为空，说明所有括号都匹配
        return stack.isEmpty();
    }
}

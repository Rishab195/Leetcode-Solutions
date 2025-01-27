class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (char ch : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stk.add(ch);
            } 
            // Handle closing brackets
            else {
                // If stack is empty or the top element doesn't match, it's invalid
                if (stk.isEmpty() || 
                    (ch == ')' && stk.peek() != '(') ||
                    (ch == ']' && stk.peek() != '[') ||
                    (ch == '}' && stk.peek() != '{')) {
                    return false;
                }
                // Pop the matching opening bracket from the stack
                stk.pop();
            }
        }
        // If the stack is empty, all brackets were matched correctly
        return stk.isEmpty();
    }
}

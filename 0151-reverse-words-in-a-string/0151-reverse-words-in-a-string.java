
class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        for (String word : s.trim().split("\\s+")) {
            stack.push(word);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }
        return sb.toString().trim();
    }
}

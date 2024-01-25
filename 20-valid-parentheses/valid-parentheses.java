class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '{') {
                stack.push('}');
            } else if (chars[i] == '[') {
                stack.push(']');
            }  else if (chars[i] == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || stack.pop() != chars[i]) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
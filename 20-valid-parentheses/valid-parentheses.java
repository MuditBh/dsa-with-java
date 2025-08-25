class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // If opening bracket, push to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // If closing bracket
            else {
                if (stack.isEmpty()) return false; // no matching open

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; // mismatch
                }
            }
        }

        // stack must be empty if all matched
        return stack.isEmpty();
    }
}
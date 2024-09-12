class Solution {
    public boolean isValid(String s) {
        Stack<String> brackets = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            String next = s.substring(i, i + 1);
            if (next.equals("(") || next.equals("[") || next.equals("{")) {
                brackets.push(next);
            } else {
                if (brackets.isEmpty()) {
                    return false;
                }
                
                String top = brackets.peek();
                
                if ((next.equals(")") && top.equals("(")) ||
                    (next.equals("]") && top.equals("[")) ||
                    (next.equals("}") && top.equals("{"))) {
                    brackets.pop();
                } else {
                    return false;
                }
            }
        }
        
        return brackets.isEmpty();
    }
    
}
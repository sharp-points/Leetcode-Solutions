class Solution {
    public String interpret(String command) {

        StringBuilder parsed = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                parsed.append("G");
            } else if (command.charAt(i) == '(') {
                i++;
                if (command.charAt(i) == ')') {
                    parsed.append("o");
                } else {
                    i += 2;
                    parsed.append("al");
                }
            }
        }

        return parsed.toString();
        
    }
}

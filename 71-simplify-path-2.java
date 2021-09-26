class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack();
        String[] paths = path.split("/");
        for (String p : paths) {
            if (p.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            }
            else if (!p.equals(".") && !p.equals("")) stack.push("/" + p);
        }
        
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
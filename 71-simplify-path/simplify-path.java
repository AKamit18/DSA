class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> stack = new Stack<>();
        
        // Split the path by "/"
        String[] components = path.split("/");
        
        for (String component : components) {
            if (component.equals("") || component.equals(".")) {
                // Ignore empty strings or current directory symbol
                continue;
            } else if (component.equals("..")) {
                // Pop the stack if ".." and the stack is not empty
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Push the valid directory name onto the stack
                stack.push(component);
            }
        }
        
        // If the stack is empty, return the root directory "/"
        if (stack.isEmpty()) {
            return "/";
        }
        
        // Build the simplified path from the stack
        StringBuilder simplifiedPath = new StringBuilder();
        while (!stack.isEmpty()) {
            simplifiedPath.insert(0, "/" + stack.pop());
        }
        
        return simplifiedPath.toString();
    }
}
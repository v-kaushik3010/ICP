import java.util.Stack;

public class SimplifyPath_71 {
    public static void main(String[] args) {
        SimplifyPath_71 obj = new SimplifyPath_71();
        String path = "/a/./b/../../c/";
        System.out.println(obj.simplifyPath(path)); // Output: "/c"
    }

    public String simplifyPath(String path) {
        String[] components = path.split("/");
        Stack<String> st = new Stack<>();

        for (String comp : components) {
            if (comp.equals("") || comp.equals(".")) {
                continue;
            }

            if (comp.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(comp);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, "/" + st.pop());
        }

        return sb.length() == 0 ? "/" : sb.toString();        
    }
}


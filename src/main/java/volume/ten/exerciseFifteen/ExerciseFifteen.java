package volume.ten.exerciseFifteen;

//Exercise 15:Stacks are often used to evaluate expressions in programming languages.
// Using net.mindview.util.Stack, evaluate the following expression,
// where’+’ means "push the following letter onto the stack,
// " and’-’ means "pop the top of the stack and print it": "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"
public class ExerciseFifteen {
    public static void main(String[] args) {
        String s = ("+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—");
        char c[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '+') {
                stack.push(c[++i]);
            }
            if (c[i] == '-') {
                System.out.println("pop:" + stack.pop());
            }
        }
        System.out.println(stack);
    }
}

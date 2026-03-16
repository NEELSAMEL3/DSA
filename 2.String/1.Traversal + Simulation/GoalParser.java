public class GoalParser {

    public String interpret(String command) {

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < command.length()) {

            if (command.charAt(i) == 'G') {
                ans.append('G');
                i++;
            }
            else if (command.charAt(i + 1) == ')') {
                ans.append('o');
                i += 2;
            }
            else {
                ans.append("al");
                i += 4;
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        GoalParser obj = new GoalParser();

        String command = "G()(al)";

        String result = obj.interpret(command);

        System.out.println(result);
    }
}
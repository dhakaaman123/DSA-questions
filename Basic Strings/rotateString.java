public class rotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String temp = s + s;
        return temp.contains(goal);
    }

    public static void main(String[] args) {
        rotateString rs = new rotateString();
        String s = "abcde";
        String goal = "cdeab";
        boolean result = rs.rotateString(s, goal);
        if (result) {
            System.out.println("The string can be rotated to match the goal.");
        } else {
            System.out.println("The string cannot be rotated to match the goal.");
        }
    }
    
}

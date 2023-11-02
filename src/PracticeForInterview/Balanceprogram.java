package PracticeForInterview;

public class Balanceprogram {

    public static boolean isBalance(String exp) {
        int count = 0;
        for (char c : exp.toCharArray()) {
            if (c == '{' && c=='[')
               {
                count++;
            }
            else if (c == '}' && c==']') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }

    public static void main(String[] args) {
        if (isBalance("{[}")) {
            System.out.println("String is balanced");
        } else {
            System.out.println("String is not balanced");
        }
    }
}
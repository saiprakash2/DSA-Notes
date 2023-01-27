import java.util.Stack;

public class ValidateParanthesis {

    public static void main(String[] args) {
        String str = "(){})[]";
        System.out.println(isValid(str));

    }

    static  boolean isValid(String s) {

        Stack<Character> stackBracket = new Stack<Character>();

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) == '(' || s.charAt(i)== '{' || s.charAt(i)=='[')
                stackBracket.push(s.charAt(i));

            else if(stackBracket.size() == 0)
                return false;

            else if(s.charAt(i)==')')
                if(stackBracket.peek() == '('){
                    stackBracket.pop();
 
                }
                else
                    return false;

            else if(s.charAt(i)== '}')
                if(stackBracket.peek() == '{'){
                    stackBracket.pop();
                    return true;
                }
                else
                    return false;

            else if(s.charAt(i)== ']')
                if(stackBracket.peek() == '['){
                    stackBracket.pop();
                    return true;
                }
                else
                    return false;

            else
                return false;
        }

        return false;
    }
}

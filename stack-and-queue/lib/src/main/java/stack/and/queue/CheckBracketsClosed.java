package stack.and.queue;

import java.util.Stack;
import java.util.Arrays;
import java.util.List;

public class CheckBracketsClosed {
    private Character[] openBrackets = { '(', '{', '[' };
    private Character[] closeBrackets = { ')', '}', ']' };

    public boolean checkBracketsClosed(String input) {
        Stack<Character> stack = new Stack<>();
        List<Character> openBracketsList = Arrays.asList(openBrackets);
        List<Character> closeBracketsList = Arrays.asList(closeBrackets);

        for (char character : input.toCharArray()) {
            if (openBracketsList.contains(character)) {
                stack.push(character);
            } else if (closeBracketsList.contains(character)) {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), character)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isMatchingPair(char openBracket, char closeBracket) {
        return (openBracket == '(' && closeBracket == ')') ||
                (openBracket == '{' && closeBracket == '}') ||
                (openBracket == '[' && closeBracket == ']');
    }


}

class Solution {
    public boolean isValid(String s) {
                Stack<Character> parentheses = new Stack<Character>() ;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') parentheses.push(s.charAt(i));
            else {
                if (parentheses.empty()) return false;
                if (s.charAt(i) == ')' && parentheses.peek() != '(') return false;
                if (s.charAt(i) == ']' && parentheses.peek() != '[') return false;
                if (s.charAt(i) == '}' && parentheses.peek() != '{') return false;
                parentheses.pop();
            }
        }
        return parentheses.empty();
    }
        
    }

class Solution {
    public boolean isValid(String s) {
        int i;
        Stack<Character> str = new Stack<>();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                str.push(s.charAt(i));
            }
            else {
    if (str.isEmpty()) return false; // Stack empty → invalid
    char top = str.peek();
    // Mismatch check → return false
    if ((s.charAt(i) == ')' && top != '(') ||
        (s.charAt(i) == ']' && top != '[') ||
        (s.charAt(i) == '}' && top != '{')) {
        return false;
    }
    str.pop(); // Pop the matched opening bracket
}
        }
        return str.isEmpty();
    }
    
}


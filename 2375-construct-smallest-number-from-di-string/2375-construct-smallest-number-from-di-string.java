class Solution {

    public String smallestNumber(String pattern) {
        Stack<Character> st = new Stack<>();
        Stack<Character> temp = new Stack<>();
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= pattern.length() + 1; i++) str.append(i);

        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'I') st.push(str.charAt(i)); else {
                temp.push(str.charAt(i));
                while (i < pattern.length() && pattern.charAt(i) == 'D') {
                    i++;
                    temp.push(str.charAt(i));
                }
                while (!temp.isEmpty()) {
                    st.push(temp.pop());
                }
            }
        }
        if(pattern.charAt(pattern.length()-1)=='I')
            st.push(str.charAt(str.length()-1));
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) ans.append(st.pop());
        return ans.reverse().toString();
    }
}

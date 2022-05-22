class Solution {

    public int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= i; j--) {
                if (check(i, j, s)) ans += 1;
            }
        }
        return ans;
    }

    public boolean check(int i, int j, String str) {
        while (i <= j && i<str.length() && j>=0) {
            if ( str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

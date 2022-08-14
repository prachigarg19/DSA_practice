class Solution {

    public List<Integer> findSubstring(String s, String[] words) {
        int wordlen = words[0].length();
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i <=s.length()-wordlen*words.length) {
            HashMap<String, Integer> hm = new HashMap<>();
            for (String temp : words) hm.put(temp, hm.getOrDefault(temp, 0) + 1);
            int j = i, count = 0, max = j + wordlen * words.length;
            while (j < max && j + wordlen <= s.length() && hm.containsKey(s.substring(j, j + wordlen))) {
                hm.put(s.substring(j, j + wordlen), hm.get(s.substring(j, j + wordlen))- 1);
                if (hm.get(s.substring(j, j + wordlen)) < 0) {
                    break;
                }
                if (hm.get(s.substring(j, j + wordlen)) == 0) count++;
                j += wordlen;
            }
            if (count == hm.size()) {
                ans.add(i);
            }
            i++;
            // System.out.println(i);
        }
        return ans;
    }
}

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String, Integer> hm = new HashMap<>();
        for(String s: words){
            StringBuilder ans=new StringBuilder();
            for(int i=0;i<s.length();i++){
                ans.append(codes[s.charAt(i)-'a']);
            }
            hm.put(ans.toString(),hm.getOrDefault(ans.toString(),0)+1);
        }
        
        return hm.size();
    }
}
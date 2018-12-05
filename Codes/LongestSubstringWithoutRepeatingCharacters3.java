class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0,j = 0, as = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(;j < s.length(); j++) {
            if(map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            as = Math.max(as, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return as;
    }
}
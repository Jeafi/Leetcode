class Solution {
    public String countAndSay(int n) {
        // corner case check.
        if(n == 0) return "";
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        for(int i = 2; i <= n; i++){
            String cur = sb.toString();
            sb = new StringBuilder();
            // For each string, we try to count the character's showing time.
            for(int j = 0; j < cur.length(); j++){
                char ch = cur.charAt(j);
                int counter = 0;
                // we continue counting until another character.
                while(j < cur.length() && cur.charAt(j) == ch){
                    counter++;
                    j++;
                }
                // j-- here, because we will j++ in the for loop.
                j--;
                sb.append(counter).append(ch);
            }
        }
        return sb.toString();
    }
}
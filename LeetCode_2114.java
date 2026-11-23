package LeetCode_2;

class LeetCode_2114 {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String s : sentences) {
            int spaces = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    spaces++;
                }
            }
            maxWords = Math.max(maxWords, spaces + 1);
        }
        
        return maxWords;
    }
}

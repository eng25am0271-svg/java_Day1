package LeetCode;

class LeetCode_520 {
    public boolean detectCapitalUse(String word) {
        int uppercaseCount = 0;

        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
        }
        
        return uppercaseCount == 0 || 
               uppercaseCount == word.length() || 
               (uppercaseCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
}

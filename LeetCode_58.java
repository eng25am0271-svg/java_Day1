package LeetCode;

class LeetCode_58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        
        int lastSpaceIndex = s.lastIndexOf(' ');
    
        return s.length() - 1 - lastSpaceIndex;
    }
}

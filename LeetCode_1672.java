package LeetCode_2;

class LeetCode_1672 {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        for (int[] customer : accounts) {
            int currentWealth = 0;
            
            for (int bank : customer) {
                currentWealth += bank;
            }
            
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        
        return maxWealth;
    }
}

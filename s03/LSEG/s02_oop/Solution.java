package s02_oop;
class Solution {
    public int solution(String S, int[] C) {
        int totalCost = 0;
        int n = S.length();
        for (int i = 0; i < n - 1; i++) {
            char currentChar = S.charAt(i);
            char nextChar = S.charAt(i + 1);
            if (currentChar == nextChar) {
                int j = i + 1;
                int maxCost = C[i];
                while (j < n && S.charAt(j) == currentChar) {
                    maxCost = Math.max(maxCost, C[j]);
                    j++;
                }
                i = j - 1;
                totalCost += maxCost;
            }
        }
        return totalCost;
    }
}

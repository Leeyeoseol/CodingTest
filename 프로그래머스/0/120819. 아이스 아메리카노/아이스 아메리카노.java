class Solution {
    public int[] solution(int money) {
        int count = money/5500;
        int m = money%5500;
        return new int[]{count, m};
    }
}
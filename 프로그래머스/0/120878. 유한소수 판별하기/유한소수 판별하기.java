class Solution {
    public int solution(int a, int b) {
        int btemp = b;
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        int newB = btemp / a;
        while (newB % 2 == 0) newB /= 2;
        while (newB % 5 == 0) newB /= 5;
        if (newB == 1) return 1;
        else return 2;
    }
}
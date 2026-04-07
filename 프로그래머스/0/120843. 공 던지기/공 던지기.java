class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int a=(k-1)*2;//2칸씩 옮기기
        a=a%numbers.length;//나머지 구해서
        return numbers[a];
    }
}
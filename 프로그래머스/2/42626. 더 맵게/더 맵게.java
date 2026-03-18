import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> s= new PriorityQueue<>();//heap?
         for(int n:scoville){
            s.offer(n); // 여기서 offer 사용
        }
        
        int answer = 0;
        while (s.peek()<K) {//peek = 가장 작은 값
            if(s.size()<2){
                return -1;
            }
            int num1=s.poll();
            int num2=s.poll();
            s.offer(num1+(num2*2));
            answer++;
        }
        return answer;
    }
}
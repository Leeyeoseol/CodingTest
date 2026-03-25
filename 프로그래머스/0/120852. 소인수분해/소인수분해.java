class Solution {
    public int[] solution(int n) {
        int[] temp = new int[n + 1];
        int count = 0;
        for(int i=2;i<= n;i++){
            if (n%i==0){
                // i가 n의 약수라면 소인수 배열에 추가
                temp[count]=i;
                count++;
                
                // n에서 i를 더 이상 나눌 수 없을 때까지 반복해서 제거
                while(n% i==0){
                    n /=i;
                }
            }
        }
        int[]answer= new int[count];
        for (int j=0;j< count;j++){
            answer[j]=temp[j];
        }
        return answer;
    }
}
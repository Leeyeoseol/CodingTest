class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int num;
        for(int i=left;i<=right;i++){
            num=0;
            
            for (int j=1;j<=i;j++){
                if (i%j==0){//약수임
                    num++;//약수의 개수
                }
            }
            
            if(num%2==0){//짝수라면
                answer+=i;
            }else{
                answer-=i;
            }
        }
        return answer;
    }
}
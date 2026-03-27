class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int n=i;n<=j;n++){
            int a=n;
            while(a>0){
                int num = a%10;
                if(num==k){
                    answer++;
                }
                a/=10;
            }
        }
        return answer;
    }
}
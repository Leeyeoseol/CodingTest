class Solution {
    public int solution(int n) {    
        int m=0,result=0;
        for(int i=1; i<=n;i++){//1~n까지 돌리는 n이하의 수
            result = 0;
            for(int j=2;j<i;j++){
                if(i%j==0) {
                    m++;
                    break;
                }
            }
        }
        return m;
    }
}
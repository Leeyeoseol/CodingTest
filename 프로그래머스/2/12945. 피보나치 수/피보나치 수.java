class Solution {
    public int solution(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        
        int pre2=0;//F(n-2)
        int pre1=1;//F(n-1)
        int c=0;//F(n)
        
        for(int i=2;i<=n;i++){
            //F(n)=F(n-1)+F(n-2)
            c=(pre1+pre2)%1234567;
            
            pre2 =pre1;
            pre1 =c;
        }
        return c;
    }
}

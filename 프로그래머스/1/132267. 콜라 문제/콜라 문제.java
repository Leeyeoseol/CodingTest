class Solution {
    public int solution(int a, int b, int n) {
        //마트에 줘야하는 병 수,a개에 마트가 주는 병 수, 가진 병 수 
        int takebottle =0;
        int marketgive =0;
        int answer=0;
        if(a>n)return 0;
        while(n>=a){
            takebottle = (n/a)*a;//(6)*3 = 18
            marketgive = (takebottle/a)*b;//6
            answer+=marketgive;
            n=((n-takebottle)+marketgive);//(20 - 18)+6
        }
        return answer;
    }
}
//20중 18개 / 6병

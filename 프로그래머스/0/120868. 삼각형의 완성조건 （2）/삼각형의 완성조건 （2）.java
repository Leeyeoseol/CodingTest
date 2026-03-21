class Solution {
    public int solution(int[] sides) {
        int a = Math.abs(sides[0]-sides[1]);//sides[0]-side[1]
        int b=sides[0] + sides[1];//9
        int ab=0;
        
        for(int i=a+2;i<=b;i++){
            ab++;
        }
        
        return ab;
    }
}
//Math.abs는 Java에서 절댓값(absolute value) 을 구하는 함수예요. (GPT 왈)

//ex[3,6] 
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer ="";
        int left=10;
        int right=12;
                
        for(int i=0;i<numbers.length;i++){
            int n=numbers[i];
            if(n==0)n=11;
            if(n==1||n==4||n==7){
                answer+="L";
                left=n;
            }else if(n==3||n==6||n==9){
                answer+="R";
                right=n;
            }else{
                int leftlength =0;
                if(left==n){
                    leftlength=0;
                }else if(left==n-1||left==n-3||left==n+3){
                    leftlength=1;
                }else if(left==n-2||left==n-4||left==n+2||left==n+4||left==n-6||left==n+6){
                    leftlength=2;
                }else if(left==n-5||left==n-7||left==n+5||left==n+7||left==n-9||left==n+9){
                    leftlength=3;
                }else{
                    leftlength=4;
                }
                
                int rightlength=0;
                if(right==n){
                    rightlength=0;
                }else if(right==n+1||right==n-3||right==n+3){
                    rightlength=1;
                }else if(right==n+2||right==n+4||right==n-2|| right==n-4||right==n-6||right==n+6){
                    rightlength=2;
                }else if(right==n+5||right==n+7||right==n-5||right==n-7||right==n-9||right==n+9){
                    rightlength=3;
                }else{
                    rightlength=4;
                }
                
                if(leftlength<rightlength){
                    answer+="L";
                    left=n;
                }else if(rightlength<leftlength){
                    answer +="R";
                    right=n; 
                }else{
                    if(hand.equals("left")){
                        answer +="L";
                        left=n;
                    }else{
                        answer+="R";
                        right= n;
                    }
                }
            }
        }
        return answer;
    }
}
//1,4,7 = L
//3,6,8 = R
//2,5,8,0 = 가까운거 / 거리 같으면 hand보고 
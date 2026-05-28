class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        /*boolean answer = true;
        //저장용
        boolean fs=true;//얘는 하나의 경우빼고는 true
        boolean ls=true;

        if(x1==false&&x2==false)fs=false;
        
        if(x3==true&&x4==true){
            ls=true;
        }else if(x3==true&&x4==false){
            ls=false;
        }else if(x3==false&&x4==true){
            ls=false;
        }else{
            ls=false;
        }
        
        if(fs==true&&ls==true){
            answer=true;
        }else {
            answer=false;
        }*/
        
        return(x1||x2)&&(x3||x4);
    }
}
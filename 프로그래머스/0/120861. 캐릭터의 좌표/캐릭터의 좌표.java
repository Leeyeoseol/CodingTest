class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] result = new int [2];
        int x=0,y=0;
        
        int left=-(board[0]/2);
        int right=(board[0]/2);
        int up=(board[1]/2);
        int down=-(board[1]/2);
        
        for(int i=0;i<keyinput.length;i++){
            switch(keyinput[i]){
                case "left":
                     x--;
                    if(x<left) x=left;
                    break;
                case "right":
                    x++;
                    if(x>right) x=right;
                    break;
                case "up":
                    y++;
                    if(y>up) y=up;
                    break;
                case "down":
                     y--;
                    if(y<down) y=down;
                    break;
            }
        }
        
        result[0]=x;
        result[1]=y;
        return result;
    }
}
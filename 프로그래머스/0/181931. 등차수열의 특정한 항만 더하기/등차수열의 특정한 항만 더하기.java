class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int [] save = new int [included.length];
        
        for(int i=0;i<save.length;i++){
            save[i]=a;
            a+=d;
        }
        
        // System.out.println(save[0]+" "+save[1]+" "+save[2]+" "+save[3]+" "+save[4]);
        
        for(int i=0;i<save.length;i++){
                if(included[i]==true){
                    answer+=save[i];
                }
        }
        return answer;
    }
}
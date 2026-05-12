class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];//n×n 배열
        int num=1;
        int rowStart=0; //행 시작
        int rowEnd=n-1; //행 끝 
        int colStart=0; //열 시작 
        int colEnd=n-1; //열 끝
        
        while(num <= n * n){ 
            //오
            if(num > n*n) break;
            for(int i=colStart;i<=colEnd;i++){
                answer[rowStart][i]=num++; 
            }
            rowStart++;
            //아
            if(num > n*n) break;
            for(int i=rowStart;i<=rowEnd;i++){
                answer[i][colEnd] = num++;
            }
            colEnd--;
            //왼
            if(num > n*n) break;
            for(int i=colEnd;i>=colStart;i--){
                answer[rowEnd][i]=num++; 
            }
            rowEnd--;
            //위
            if(num > n*n) break;
            for(int i=rowEnd;i>=rowStart;i--){
                answer[i][colStart]=num++; 
            }
            colStart++;
        }
        return answer;
    }
}
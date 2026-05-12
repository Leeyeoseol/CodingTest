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
/*나선형이니 범위 밖이나 이미 숫자가 있는 칸을 만나기 전까지 오른쪽 - 아래 - 왼쪽 - 위의 순서를 반복해서 포인터가 이동 할 것입니다.
나머지 연산을 이용하면 4개의 순서를 반복하게 할 수 있어요.
언제 방향을 꺾어야 할 지 조건을 생각해 보면서 조건문을 작성하는 것부터 해보는 것이 어떨까요?*/
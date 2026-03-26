class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int [num_list.length/n][n];//2*4 배열
        int num=0;
        for(int i=0;i<num_list.length/n;i++){//0,1,2,3...
            for(int j=0;j<n;j++){//0,1... //순서를 바꿔야함
                System.out.print("["+i+", "+j+ "] "+num);

                answer[i][j]=num_list[num];
                num++;
            }
        }
        return answer;
    }
}
//num_list에서는 1,2 / 3,4 ... 이렇게 되어야함(0,1 / 2,3...)
//answer배열은 num_list에서 0번 빼고 0,0에 넣고 / 1번 빼고 0,1에 넣고 / 2번빼고 1, 0에 넣고 / 3번 빼고 1,1에 넣고
/*
1,2 (00, 01) 앞자리 0은 두번필요 / 뒷자리는 0-1반복
3,4 (10, 11)
5,6 (20, 21)
7,8 (30, 31)
*/
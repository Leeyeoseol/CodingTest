class Solution {
    public int solution(int n, int w, int num) {
        int answer = 1;
        int [][]arr=new int[(n+w-1)/w][w];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=0;
            }
        }
        
        int count=1;
        
        for(int a=0;a<arr.length;a++){
            if(a%2==0){//홀수냐 짝수냐에 따라서
                for(int j=0;j<arr[0].length;j++){
                    if(count<=n){
                        arr[a][j]=count;
                        count++;   
                    }
                }                  
            }else{   
                 for(int j=w-1;j>=0;j--){
                    if(count<=n){
                        arr[a][j]=count;
                        count++;   
                    }
                }      
            }
        }
        
        //배열 확인용 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");    
            }
        }
        //
        
        int r=0;
        int c=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==num){//가로새로 저장 dor문 거기서 시작
                    r=i;
                    c=j;
                }
            }
        }
        
        for(int i=r+1;i<arr.length;i++){
            if(arr[i][c]>0) answer++;
        }
        return answer;
    }
}
//배열 
//num 위치 찾기
//자기 자신 포함 → answer = 1
//row+1부터 마지막 행까지 내려가면서
//같은 col에 숫자가 있으면 answer++
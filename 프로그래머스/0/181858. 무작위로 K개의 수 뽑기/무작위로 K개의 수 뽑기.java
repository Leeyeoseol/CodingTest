class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int num=0;
        for(int i=0;i<arr.length;i++){
            if(num==k){
                break;
            }
            boolean check = false;
            for(int j=0;j<num;j++){
                if(arr[i]==answer[j]){
                    check=true;
                    break;
                }
            }
            if(!check){
                answer[num]=arr[i];
                num++;
            }
        }
        for(int i=num;i<k;i++){
            answer[i]=-1;
        }
        return answer;
    }
}
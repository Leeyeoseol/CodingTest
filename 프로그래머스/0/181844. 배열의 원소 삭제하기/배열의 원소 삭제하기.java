class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int a=0;
        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for(int j=0;j<delete_list.length;j++){
                if (arr[i]==delete_list[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                a++;
            }
        }
        int n=0;
        int[] answer = new int[a];
        
        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for(int j=0;j<delete_list.length;j++){
                if(arr[i]==delete_list[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                answer[n]=arr[i];
                n++;
            }
        }
        return answer;
    }
}
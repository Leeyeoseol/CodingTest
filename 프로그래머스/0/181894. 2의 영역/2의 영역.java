class Solution {
    public int[] solution(int[] arr) {
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                cnt++;
            }
        }
        if(cnt==0){
            return new int[]{-1};
        }
        int idx=0;
        int[] a=new int[cnt];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                a[idx++]=i;
            }
        }
        int num=0;
        int[] answer=new int[a[a.length-1]-a[0]+1];
        for(int i=a[0];i<=a[a.length-1];i++){
            answer[num++]=arr[i];
        }
        return answer;
    }
}

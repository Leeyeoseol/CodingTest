class Solution {
    public int solution(int[] arr) {
        int count=0;
        int []arrTemp=new int[arr.length];
        while(true){
            for(int i=0;i<arrTemp.length;i++){
                arrTemp[i]=arr[i];
            }
            
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i]=arr[i]/2;
                }else if(arr[i]<50 && arr[i]%2==1){
                    arr[i]=(arr[i]*2)+1;
                }
            }
            
            boolean check=true;
        
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=arrTemp[i]){
                    check=false;
                    break;
                }
            }
            if(check){
                break;
            }
            count++;
        }
        return count;
    }
}
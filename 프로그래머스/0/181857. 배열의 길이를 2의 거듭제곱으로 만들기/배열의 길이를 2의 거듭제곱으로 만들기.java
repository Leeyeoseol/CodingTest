class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int n=arr.length;
        int m=1;
        
        while(m<n){m*=2;}
        int []arr1=new int[m];
        
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];
        }
        return arr1;
    }
}
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j < n-1;j++){
                for(int k=j+1;k < n;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum>1){
                       boolean prime=true;
                        for(int x=2;x*x<=sum;x++)
                        {
                            if(sum%x==0){
                                prime=false;
                                break;
                            }
                        }             
                        if(prime) count++;
                    }
                }
            }
        }


        return count;
    }
}
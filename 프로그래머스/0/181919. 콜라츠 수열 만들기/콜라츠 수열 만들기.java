import java.util.*;
class Solution {
    public int[] solution(int n) {
    List<Integer> result = new ArrayList<>();
    result.add(n);//초기값도 수열에 포함

    while(n != 1){

        if(n % 2 == 0){
            n = n / 2;
        }else{
            n = 3 * n + 1;
        }

        result.add(n);
    }
    int[] arr = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
        arr[i] = result.get(i); // 자동 언박싱
    }
    return arr;
    }
}
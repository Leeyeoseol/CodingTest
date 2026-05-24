function solution(arr, queries) {
    for(let [s, e] of queries){//이런 형식도 됨
        for(let i=s; i<=e;i++){
            arr[i]+=1;
        }
    }
    return arr;
}
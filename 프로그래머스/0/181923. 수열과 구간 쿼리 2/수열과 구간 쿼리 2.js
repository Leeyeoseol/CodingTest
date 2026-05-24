function solution(arr, queries) {
    var answer = [];
    for(let [s, e, k] of queries){
        let min = Infinity;//무한
        for(let i=s; i<=e;i++){
             if(arr[i]> k) {
                min = Math.min(min, arr[i]);
            }
        }
          answer.push(min === Infinity ? -1 : min);
    }
    return answer;
}
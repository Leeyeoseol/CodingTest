function solution(arr) {
    var answer = [];
    let minNum=arr[0];
    
    if(arr.length<=1){
        answer.push(-1);
        return answer;
    }
    
    for(let i=0;i<arr.length;i++){
        if(minNum>arr[i]){
            minNum=arr[i];
        }
    }

    for(let i=0;i<arr.length;i++){
        if(arr[i] !==minNum) answer.push(arr[i]);
    }
    
    return answer;
}
function solution(number) {
    var answer = 0;
    for(let x of number){
        answer+= +x;
    }
    return answer%9;
}
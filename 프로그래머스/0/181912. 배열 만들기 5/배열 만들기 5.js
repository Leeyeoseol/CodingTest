function solution(intStrs, k, s, l) {
    var answer = [];
    for(let i of intStrs){
        let str=i.substr(s,l);
        if(str>k){
            answer.push(+str);
        }
    }
    return answer;
}
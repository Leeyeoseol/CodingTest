function solution(n, m) {
    var answer = [];
    let maxNum=1;
    for(let i=1;i<=Math.min(n,m);i++){
        if(n%i===0&&m%i===0){
            maxNum=i;
        }
    }
    let minNum=(n*m)/maxNum;
    return [maxNum,minNum];
}
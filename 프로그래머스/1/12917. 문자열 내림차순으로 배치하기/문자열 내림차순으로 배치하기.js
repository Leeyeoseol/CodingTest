function solution(s) {
    var answer = '';
    let arr=[];
    for(let i=0;i<s.length;i++){
        arr.push(s.charAt(i));
    }
    arr.sort().reverse();  
    answer=arr.join('');
    return answer;
}
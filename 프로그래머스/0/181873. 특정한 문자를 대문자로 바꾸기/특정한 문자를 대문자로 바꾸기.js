function solution(my_string, alp) {
    var answer = '';
    
    for(let x of my_string){
        if(x===alp){
            answer+=alp.toUpperCase();
        }else{
            answer+=x;
        }
    }
    return answer;
}
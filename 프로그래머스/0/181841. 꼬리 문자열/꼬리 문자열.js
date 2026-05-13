function solution(str_list, ex) {
    var answer = '';
    let count=0;
    for(let i of str_list){
        if(i.indexOf(ex)!=-1){
            count++;//전체에 ex가 들어가는지 확인용
        }else{
            answer+=i;
        }
    }
    // if(count===str_list.length){
    //     answer='';
    // }
    return answer;
}
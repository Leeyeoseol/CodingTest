function solution(myString) {
    var answer = [];
    let str="";
    //맨뒤가 x가 아닌 경우 x를 추가
    const lastChar = myString.slice(-1);
    if(lastChar!="x") myString+="x";
    //경우의 수
    //x가 여러개 겹친경우
    //맨 뒤가 x가 아닌경우
    //맨 앞이 x인 경우
        
    for(let x of myString){//하나씩
        if(x==="x"){
            answer.push(str);
            str="";
        }else if(x!=="x"){
         str+=x;   
        }
    }
    let result=answer.filter(Boolean);
    result.sort();
    return result;
}
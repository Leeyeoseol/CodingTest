function solution(myString) {
    var answer = [];
    let str="";
    myString+="x";

    for(let x of myString){//하나씩
        if(x==="x"){
            answer.push(str);
            str=0;
        }else if(x!=="x"){
         str++;   
        }
    }
    var result=[];
    for(let i=0;i<answer.length;i++){
        if(answer[i]===""){
            result.push(0);
        }else{
            result.push(answer[i]);
        }
    }
    return result;
}
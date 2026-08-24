function solution(answers) {
    var score = [0,0,0];
    
    let one =[1,2,3,4,5];
    let two =[2,1,2,3,2,4,2,5];
    let tre =[3,3,1,1,2,2,4,4,5,5];
    
    for(let i=0;i<answers.length;i++){
        if(answers[i]===one[i%one.length]){
            score[0]++;
        }
         if(answers[i]===two[i%two.length]){
            score[1]++;
        }
         if(answers[i]===tre[i%tre.length]){
            score[2]++;
        }
    }
    const maxScore = Math.max(...score);
    
    const result = [];
    for(let i=0; i<score.length; i++){
        if(score[i] ===maxScore){
            result.push(i+ 1);
        }
    }
    
    return result;
}
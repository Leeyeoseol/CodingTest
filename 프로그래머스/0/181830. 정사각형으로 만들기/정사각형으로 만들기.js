function solution(arr) {
    var answer = [[]];
    let rowlength = arr.length;
    let collength = arr[0].length;
    //11,11,11,11 1100,1100,1100,1100
    if(rowlength>collength){        
        for(let i=0;i<rowlength;i++){
            for(let j=0;j<rowlength-collength;j++){
                arr[i].push(0);
            }
        }
        return arr;
    }else if(rowlength<collength){
        for(let i=0;i<collength-rowlength;i++){
           let arrs =[];
             for(let j=0;j<collength;j++){
                 arrs.push(0);
             }
             arr.push(arrs);
        }
        return arr;
    }else{
        return arr;
    }
}
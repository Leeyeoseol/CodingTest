function solution(s) {
    var answer = true;
    if(s.length!=4&&s.length!=6) return false;
    for(let i=0;i<s.length;i++){
        let c=s.charAt(i);
        if(c<'0'||c>'9'){
            return false;
        }
    }
    return true;
}
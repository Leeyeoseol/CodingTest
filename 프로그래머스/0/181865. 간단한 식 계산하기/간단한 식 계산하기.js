function solution(binomial) {
    const result = binomial.split(" ");
    
    let a = Number(result[0]);
    let op = result[1];
    let b = Number(result[2]);
    
    if (op === "+") return a + b;
    if (op === "-") return a - b;
    if (op === "*") return a * b;
}
function solution(myStr) {
    const changed=myStr.split("a").join(" ")
                         .split("b").join(" ")
                         .split("c").join(" ");
    
    const result = changed.split(" ").filter(str=>str!=="");
    return result.length===0?["EMPTY"]:result;
}
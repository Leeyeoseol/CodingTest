function solution(num_str) {
    var answer = 0;
    for(let x of num_str) answer+=+x; //변수 앞에 +는 int형으로 형변환
    return answer;
}
function solution(lines) {
    const count = {};

    for (const [start, end] of lines) {
        for (let i = start; i < end; i++) {
            count[i] = (count[i] || 0) + 1;
        }
    }

    let answer = 0;
    for (const key in count) {
        if (count[key] >= 2) {
            answer++;
        }
    }

    return answer;
}
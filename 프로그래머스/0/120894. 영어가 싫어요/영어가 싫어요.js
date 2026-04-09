function solution(numbers) {
    const numStr = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    
    numStr.forEach((str, index) => {
        numbers = numbers.split(str).join(index);//쪼개고 숫자로 다시 합침
    });
    
    return Number(numbers);
}
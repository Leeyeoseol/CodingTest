const fs = require("fs");
const numbers = fs.readFileSync(0).toString().trim().split(/\s+/).map(Number);

const sum1 = numbers[1] + numbers[3] + numbers[5] + numbers[7] + numbers[9];

const sum2 = numbers[2] + numbers[5] + numbers[8];
const avg = (sum2 / 3).toFixed(1);
console.log(sum1+" "+avg);


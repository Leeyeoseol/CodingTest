const fs = require("fs");
let arr = fs.readFileSync(0).toString().trim().split(/\s+/).map(Number);


let n = arr.indexOf(0);
let sum = arr[n - 1] + arr[n - 2] + arr[n - 3];
console.log(sum);
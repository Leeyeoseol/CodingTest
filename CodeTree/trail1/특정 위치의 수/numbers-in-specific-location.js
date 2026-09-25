const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split(" ").map(Number);

const third = Number(input[2]);
const fifth = Number(input[4]);
const tenth = Number(input[9]);

console.log(third+fifth+tenth);
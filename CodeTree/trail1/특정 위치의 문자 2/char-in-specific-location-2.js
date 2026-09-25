const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split(" ");

const result = [input[1], input[4], input[7]];
console.log(result.join(" "));

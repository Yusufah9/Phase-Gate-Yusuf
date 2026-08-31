const prompt = require('prompt-sync')();

let firstNumber = Number(prompt("Enter first number: "));
let secondNumber = Number(prompt("Enter second number: "));

let maximum = firstNumber;
if (secondNumber > maximum) {
    maximum = secondNumber;
}

let lcm = maximum;
while (true) {
    if (lcm % firstNumber === 0 && lcm % secondNumber === 0) {
        break;
    }
    lcm++;
}
console.log("LCM: " + lcm);

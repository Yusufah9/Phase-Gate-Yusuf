const prompt = require('prompt-sync')();

let firstNumber = Number(prompt("Enter first number: "));
let secondNumber = Number(prompt("Enter second number: "));

let gcd = 1;
for (let count = 1; count <= firstNumber && count <= secondNumber; count++) {
    if (firstNumber % count === 0 && secondNumber % count === 0) {
        gcd = count;
    }
}
console.log("GCD: " + gcd);


//npm install prompt-sync









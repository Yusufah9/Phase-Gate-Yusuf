const prompt = require('prompt-sync')();

let number = Number(prompt("Enter a number: "));

let sum = 0;
for (let count = 1; count < number; count++) {
    if (number % count === 0) {
        sum = sum + count;
    }
}

if (sum === number) {
    console.log(number + " is a Perfect Number.");
} else {
    console.log(number + " is NOT a Perfect Number.");
}

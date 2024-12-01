/**
 * @param {number} num
 * @return {number}
 */
// var addDigits = function(num) {
//     while(num.toString().length != 1) {
//         let numTemp = num;
//         let total = 0;

//         while(numTemp != 0) {
//             total += numTemp % 10;
//             numTemp = Math.floor(numTemp / 10);
//         }

//         num = total;
//     }

//     return num;
// };

/**
 * Improve
 */
var addDigits = function(num) {
    while(num >= 10) {
        let a = Math.floor(num / 10);
        let b = num % 10;

        num = a + b;
    }

    return num;
};

console.log('Result one: ', addDigits(0)); // 0
console.log('Result two: ', addDigits(1)); // 1
console.log('Result three: ', addDigits(9)); // 9
console.log('Result four: ', addDigits(38)); // 2
console.log('Result five: ', addDigits(10)); // 1
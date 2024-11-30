/**
 * @param {number} n
 * @return {boolean}
 */
var isUgly = function(n) {
    if(n == 0) return false;

    if(n == 1) return true;

    const primeUgly = [2, 3, 5];

    for(let i = primeUgly.length - 1; i >= 0; i--) {
        if(n % primeUgly[i] == 0) {
            n = n / primeUgly[i];
            i = i + 1;

            if(n == 1) return true;
        } else {
            if(i == 0) return false;
        }
    }
};

// console.log('Result one: ', isUgly(6));
// console.log('Result two: ', isUgly(1));
console.log('Result three: ', isUgly(14));
// console.log('Result four: ', isUgly(0));
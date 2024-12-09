/**
 * @param {string} s
 * @param {number[]} indices
 * @return {string}
 */
// var restoreString = function (s, indices) {
//     let result = '';
//     for (let i = 0; i < indices.length; i++) {
//         let idx = indices.indexOf(i);
//         result += s[idx];
//     }
//     return result;
// };

/**
 * Improve
 */
var restoreString = function (s, indices) {
    let result = [];
    for (let i = 0; i < indices.length; i++) {
        result[indices[i]] = s[i];
    }
    return result.join('');
};

console.log('Result one: ', restoreString('codeleet', [4, 5, 6, 7, 0, 2, 1, 3]))
console.log('Result two: ', restoreString('abc', [0, 1, 2]))
console.log('Result two: ', restoreString('az', [1, 0]))
/**
 * @param {string} s
 * @return {number}
 */
// var lengthOfLastWord = function(s) {
//     s = s.trim();
//     let strAfterConvert = '';

//     for(let i = 0; i < s.length; i++) {
//         if(i > 0 && s[i] == ' ' && s[i - 1] == ' ') {
//             continue;
//         } else {
//             strAfterConvert = `${strAfterConvert}${s[i]}`;
//         }
//     }

//     const arrStr = strAfterConvert.split(' ');

//     return arrStr[arrStr.length - 1].length;
// };

/**
 * Improve
 */
var lengthOfLastWord = function(s) {
    s = s.trim();
    let result = '';

    for(let i = s.length - 1; i >= 0; i--) {
        if(s[i] != ' ') {
            result = `${result}${s[i]}`
        } else {
            break;
        }
    }

    return result.length;
};

console.log('Result one: ', lengthOfLastWord("   fly me   to   the moon  "));
console.log('Result two: ', lengthOfLastWord(" "));
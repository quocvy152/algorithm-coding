/**
 * @param {string} s
 * @param {string[]} wordDict
 * @return {boolean}
 */

// var wordBreak = function (s, wordDict) {
//     for (let i = 0; i < wordDict.length; i++) {
//         const idxStrFound = s.indexOf(wordDict[i]);
//         if (idxStrFound != 0) return false;
//         s = s.substring(idxStrFound + wordDict[i].length, s.length);
//     }
//     return true;
// };

/**
 * Improve
 */
var wordBreak = function (s, wordDict) {
    let word = '';
    let wordChecked = [];

    for (let i = 0; i < s.length; i++) {
        word = `${word}${s[i]}`;

        if (wordDict.includes(word)) {
            if (!wordChecked.includes(word)) {
                wordChecked.push(word);
                word = '';
            }

            if(wordChecked.length == wordDict.length) word = '';
        }
    }

    if (word.length && !wordChecked.includes(word)) return false;

    return true;
};

// console.log('Result 1: ', wordBreak("leetcode", ["leet", "code"])); // true
// console.log('Result 2: ', wordBreak("applepenapple", ["apple", "pen"])); // true
// console.log('Result 3: ', wordBreak("catsandog", ["cats", "dog", "sand", "and", "cat"])); // false
// console.log('Result 4: ', wordBreak("applepen", ["pen", "apple"])); // true
// console.log('Result 5: ', wordBreak("applepenss", ["apple", "pen"])); // false
// console.log('Result 6: ', wordBreak("bb", ["a", "b", "bbb", "bbbb"])); // true
// console.log('Result 7: ', wordBreak("aaaaaa", ["aa", "a"])); // true
// console.log('Result 8: ', wordBreak("aaaaaaa", ["aaaa", "aaa"])); // true
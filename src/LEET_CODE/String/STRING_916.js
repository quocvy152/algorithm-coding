/**
 * @param {string[]} words1
 * @param {string[]} words2
 * @return {string[]}
 */
// var wordSubsets = function(words1, words2) {
//     const result = [];
//     const WORDS2_LENGTH = words2.length;

//     for(let i = 0; i < words1.length; i++) {
//         let isWrapWord2 = words2.filter(word => words1[i].includes(word)).length == WORDS2_LENGTH;
//         isWrapWord2 && result.push(words1[i]);
//     }

//     return result;
// };

var wordSubsets = function(words1, words2) {
    const result = [];

    const WORDS2_LENGTH = words2.length;

    for (let i = 0; i < words1.length; i++) {
        let isWrapWord2 = words2.filter(word => {
            let wordTemp = words1[i];
            let arrWord = word.split('');

            let isSubset = arrWord.filter(item => {
                if (wordTemp.includes(item)) {
                    wordTemp = wordTemp.substring(0, wordTemp.indexOf(item)) + wordTemp.substring(wordTemp.indexOf(item) + 1, wordTemp.length);
                    return item;
                }
            }).length;

            if (arrWord.length == isSubset) {
                return word;
            }
        }).length == WORDS2_LENGTH;

        isWrapWord2 && result.push(words1[i]);
    }

    return result;
};

console.log('Result one', wordSubsets(["amazon","apple","facebook","google","leetcode"], ["e","o"]));
console.log('Result two', wordSubsets(["amazon","apple","facebook","google","leetcode"], ["l","e"]));
console.log('Result three', wordSubsets(["amazon","apple","facebook","google","leetcode"], ["lo","eo"]));
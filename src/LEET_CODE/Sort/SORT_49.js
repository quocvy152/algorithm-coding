/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function (strs) {
    let result = [];
    let strsSorted = strs.map(str => str.split('').sort().join(''));
    let groupKey = Array.from(new Set(strsSorted));
    
    for(let i = 0; i < groupKey.length; i++) {
        let resultTemp = [];
        for(let j = 0; j < strsSorted.length; j++) {
            if(strsSorted[j] == groupKey[i]) {
                resultTemp.push(strs[j]);
            }
        }
        result.push(resultTemp);
    }

    return result;
};

console.log('Result one: ', groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"])); // [["bat"],["nat","tan"],["ate","eat","tea"]]
console.log('Result two: ', groupAnagrams([""])) // [[""]]
console.log('Result three: ', groupAnagrams(["a"])) // [["a"]]
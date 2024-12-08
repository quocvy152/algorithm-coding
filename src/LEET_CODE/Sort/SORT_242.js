/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if(s.length != t.length) return false;

    let result = '';

    for(let i = 0; i < s.length; i++) {
        let idx = t.indexOf(s[i]);
        let c = t.substring(idx, idx + 1);
        t = t.substring(0, idx) + t.substring(idx + 1, t.length);
        result += c;
    }
    
    return result == s;
};

console.log('Result one: ', isAnagram('anagram', 'nagaram'));
console.log('Result two: ', isAnagram('rat', 'car'));
console.log('Result three: ', isAnagram('rat', 'carzxcv'));
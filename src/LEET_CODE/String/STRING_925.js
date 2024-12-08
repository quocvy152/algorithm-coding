/**
 * @param {string} name
 * @param {string} typed
 * @return {boolean}
 */
var isLongPressedName = function (name, typed) {
    let i = 0; 
    let k = name.length; 
    let l = typed.length;

    for (let j = 0; j < l; j++) {
        if (i < k && name[i] == typed[j]) {
            i++;
        } else if (j == 0 || typed[j] != typed[j - 1]) {
            return false;
        }
    }

    return i == k;
};

console.log('Result 1: ', isLongPressedName("alex", "aaleex")); // true
console.log('Result 1: ', isLongPressedName("alex", "aaleex")); // true
console.log('Result 2: ', isLongPressedName("saeed", "ssaaedd")); // false
console.log('Result 3: ', isLongPressedName("leelee", "lleeelee")); // true
console.log('Result 4: ', isLongPressedName("a", "b")); // false
console.log('Result 5: ', isLongPressedName("alex", "aaleexa")); // false
console.log('Result 5: ', isLongPressedName("alex", "aaleexxx")); // true
console.log('Result 6: ', isLongPressedName("alex", "aaleexa")); // false
console.log('Result 7: ', isLongPressedName("ppyplrza", "pyypllrza")); // false
var longestPalindrome = function(s) {
    let isHaveOddItem = false;
    let lengthLongestPalindrome = 0;
    let frequencyMap = {}; 

    for(let c of s) {
        frequencyMap[c] = frequencyMap[c] ? (frequencyMap[c] + 1) : 1;
    }
    
    for(let key of Object.keys(frequencyMap)) {
        let currFreq = frequencyMap[key];

        if(currFreq % 2 === 0) {
            lengthLongestPalindrome += currFreq;
        } else {
            isHaveOddItem = true;
            lengthLongestPalindrome += (currFreq - 1);
        }
    }

    if(isHaveOddItem) lengthLongestPalindrome += 1;

    return lengthLongestPalindrome;
};

console.log('Result one: ', longestPalindrome('abccccdd'));
console.log('Result two: ', longestPalindrome('Aa'));
console.log('Result three: ', longestPalindrome('a'));
console.log('Result four: ', longestPalindrome('abccccczzzdd'));
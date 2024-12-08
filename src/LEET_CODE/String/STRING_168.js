/**
 * @param {number} columnNumber
 * @return {string}
 */
var convertToTitle = function(columnNumber) {
    let result = '';
    const alphabet = Array.from({ length: 26 }, (_, i) => String.fromCharCode(65 + i));

    const TOTAL_ALPHABET_CHARACTER = 26;

    if(columnNumber <= TOTAL_ALPHABET_CHARACTER) return alphabet[columnNumber - 1];

    while(columnNumber > 0) {
        let code = (columnNumber / TOTAL_ALPHABET_CHARACTER) > TOTAL_ALPHABET_CHARACTER ? TOTAL_ALPHABET_CHARACTER : Math.floor(columnNumber / TOTAL_ALPHABET_CHARACTER);
        result += alphabet[code > 0 ? code - 1 : code];
        
        columnNumber = columnNumber - code * TOTAL_ALPHABET_CHARACTER;

        if(columnNumber <= TOTAL_ALPHABET_CHARACTER) return result + alphabet[columnNumber - 1];
    }

    return result;
};

// console.log('Result 1: ', convertToTitle(26));
// console.log('Result 2: ', convertToTitle(701));
// console.log('Result 3: ', convertToTitle(703));
// console.log('Result 4: ', convertToTitle(29));
console.log('Result 5: ', convertToTitle(999));
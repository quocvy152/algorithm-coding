/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    var isPalindrome = (i, j) => {
        let left = i;
        let right = j - 1;
    
        while(left < right) {
            if(s.charAt(left) !== s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    for(let length = s.length; length >= 1; length--) {
        for(let start = 0; start <= s.length - length; start++) {
            let end = start + length;

            if(isPalindrome(start, end)) {
                let str = s.substring(start, end);
                return str;
            }
        }
    }

    return '';
};

console.log('Result one: ', longestPalindrome('babad'));
console.log('Result two: ', longestPalindrome('cbbd'));
console.log('Result three: ', longestPalindrome('bb'));
console.log('Result four: ', longestPalindrome('zb'));
console.log('Result five: ', longestPalindrome('a'));
console.log('Result six: ', longestPalindrome('aaaaa'));
console.log('Result seven: ', longestPalindrome('zaaaabbbz'));
console.log('Result eight: ', longestPalindrome('ac'));
console.log('Result nine: ', longestPalindrome('abcda'));
console.log('Result ten: ', longestPalindrome('"zudfweormatjycujjirzjpyrmaxurectxrtqedmmgergwdvjmjtstdhcihacqnothgttgqfywcpgnuvwglvfiuxteopoyizgehkwuvvkqxbnufkcbodlhdmbqyghkojrgokpwdhtdrwmvdegwycecrgjvuexlguayzcammupgeskrvpthrmwqaqsdcgycdupykppiyhwzwcplivjnnvwhqkkxildtyjltklcokcrgqnnwzzeuqioyahqpuskkpbxhvzvqyhlegmoviogzwuiqahiouhnecjwysmtarjjdjqdrkljawzasriouuiqkcwwqsxifbndjmyprdozhwaoibpqrthpcjphgsfbeqrqqoqiqqdicvybzxhklehzzapbvcyleljawowluqgxxwlrymzojshlwkmzwpixgfjljkmwdtjeabgyrpbqyyykmoaqdambpkyyvukalbrzoyoufjqeftniddsfqnilxlplselqatdgjziphvrbokofvuerpsvqmzakbyzxtxvyanvjpfyvyiivqusfrsufjanmfibgrkwtiuoykiavpbqeyfsuteuxxjiyxvlvgmehycdvxdorpepmsinvmyzeqeiikajopqedyopirmhymozernxzaueljjrhcsofwyddkpnvcvzixdjknikyhzmstvbducjcoyoeoaqruuewclzqqqxzpgykrkygxnmlsrjudoaejxkipkgmcoqtxhelvsizgdwdyjwuumazxfstoaxeqqxoqezakdqjwpkrbldpcbbxexquqrznavcrprnydufsidakvrpuzgfisdxreldbqfizngtrilnbqboxwmwienlkmmiuifrvytukcqcpeqdwwucymgvyrektsnfijdcdoawbcwkkjkqwzffnuqituihjaklvthulmcjrhqcyzvekzqlxgddjoir"'));
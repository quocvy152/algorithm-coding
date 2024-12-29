/**
 * @param {number[]} nums
 * @return {number[]}
 */
// var findDisappearedNumbers = function (nums) {
//     let result = [];

//     for(let i = 0; i < nums.length; i++) {
//         if(!nums.includes(i + 1)) {
//             result.push(i + 1);
//         }
//     }

//     return result;
// };

var findDisappearedNumbers = function (nums) {
    let result = [];
    let check = [];

    for(let num of nums) {
        check[num] = num;
    }

    for(let i = 1; i <= nums.length; i++) {
        if(!check[i]) {
            result.push(i);
        }
    }

    return result;
};

console.log('Result one: ', findDisappearedNumbers([4, 3, 2, 7, 8, 2, 3, 1]))
console.log('Result two: ', findDisappearedNumbers([1, 1]))
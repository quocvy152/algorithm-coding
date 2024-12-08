/**
 * @param {number[]} nums
 * @return {number}
 */
// var missingNumber = function (nums) {
//     const newNums = Array(nums.length + 1).fill(0);
    
//     for(let i = 0; i < newNums.length; i++) {
//         if(!nums.includes(i)) return i;
//     }
// };

var missingNumber = function (nums) {
    nums = nums.sort((a, b) => a - b);

    for(let i = 0; i < nums.length + 1; i++) {
        if(nums[i] != i) return i;
    }
};

console.log('Result one: ', missingNumber([3, 0, 1]))
console.log('Result two: ', missingNumber([0, 1]))
console.log('Result three: ', missingNumber([9, 6, 4, 2, 3, 5, 7, 0, 1]))
console.log('Result four: ', missingNumber([1, 2]))
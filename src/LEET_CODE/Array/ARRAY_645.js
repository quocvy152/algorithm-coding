/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findErrorNums = function (nums) {
    nums = nums.sort((a, b) => a - b);

    let itemDup = null, itemMiss = null;

    for(let i = 0; i < nums.length - 1; i++) {
        if(!itemDup && nums[i] == nums[i + 1]) itemDup = nums[i];

        if(!itemMiss && !nums.includes(i + 1)) itemMiss = i + 1;

        if(itemDup && itemMiss) return [itemDup, itemMiss];
    }

    if(!itemMiss) {
        return [itemDup, nums.length]
    }
};

// var findErrorNums = function (nums) {
//     let result = [];
//     let uniqueNums = [];

//     for(let i = 0; i < nums.length; i++) {
//         if(uniqueNums.includes(nums[i])) {
//             result[0] = nums[i];
//         }

//         uniqueNums.push(nums[i]);
//     }

//     for(let i = 1; i <= nums.length; i++) {
//         if(!uniqueNums.includes(i)) {
//             result[1] = i;
//         }
//     }

//     return result;
// };

console.log('Result one: ', findErrorNums([1, 2, 2, 4]))
console.log('Result two: ', findErrorNums([1, 1]))
console.log('Result three: ', findErrorNums([1, 2, 2, 3, 4]))
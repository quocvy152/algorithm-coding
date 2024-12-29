/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function(nums) {
    let checked = [];
    let result = [];

    for(let i = 0; i < nums.length; i++) {
        if(!checked[nums[i]]) {
            checked[nums[i]] = nums[i];
        } else {
            result.push(nums[i]);
        }
    }

    return result;
};
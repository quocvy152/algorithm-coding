/**
 * @param {number[]} nums
 * @return {string[]}
 */
var summaryRanges = function (nums) {
    if (nums.length == 0) return [];

    if (nums.length == 1) return [`${nums[nums.length - 1]}`];

    const result = [];
    let start = nums[0];
    let end = null;

    for (let i = 0; i < nums.length - 1; i++) {
        if (nums[i] + 1 != nums[i + 1]) {
            end = nums[i] == start ? start : nums[i];

            result.push(start == end ? `${start}` : `${start}->${end}`);

            start = nums[i + 1];
            end = null;
        }

        if (i == nums.length - 2) {
            end = nums[nums.length - 1];
            result.push(start == end ? `${start}` : `${start}->${end}`);
        }
    }

    return result;
};

console.log('Testcase one: ', summaryRanges([0, 1, 2, 4, 5, 7]))
console.log('Testcase two: ', summaryRanges([0, 2, 3, 4, 6, 8, 9]))
console.log('Testcase three: ', summaryRanges([1, 3, 5, 7, 9, 11, 13]))
console.log('Testcase four: ', summaryRanges([1, 2, 5, 7, 9, 12, 13]))
console.log('Testcase five: ', summaryRanges([-1]))
console.log('Testcase six: ', summaryRanges([-2, -1, 0, 1, 3, 4, 5, 8, 10, 11]))
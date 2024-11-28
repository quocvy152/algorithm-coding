/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
// var combinationSum = function (candidates, target) {
//     let result = [];

//     for (let i = 0; i < candidates.length; i++) {
//         if (target % candidates[i] == 0) {
//             result.push(Array(target / candidates[i]).fill(candidates[i]));
//         } else if (target % candidates[i] != 0 && i > 0) {
//             let targetReduce = target;
//             let loop = i;
//             let itemRes = [];

//             while (targetReduce != 0 && loop >= 0) {
//                 if (targetReduce < candidates[loop]) {
//                     loop--;
//                 } else {
//                     let raw = Math.floor(targetReduce / candidates[loop]);
//                     targetReduce = targetReduce % candidates[loop];

//                     let itemResTemp = Array(raw).fill(candidates[loop]);
//                     itemRes = [
//                         ...itemResTemp,
//                         ...itemRes
//                     ];

//                     loop--;
//                 }
//             }

//             itemRes.length > 0 && targetReduce == 0 && result.push(itemRes);
//         }
//     }

//     return result;
// };

var combinationSum = function (candidates, target) {
    candidates.sort((a, b) => a - b)
    let ans = [];
    let tempList = [];

    const findCombinations = (startIndex, remainingTarget) => {

        // BASE CONDITION
        if (remainingTarget === 0) {
            ans.push(tempList.slice());
            return;
        }

        // BASE CONDITION
        if (startIndex >= candidates.length || candidates[startIndex] > remainingTarget) {
            return;
        }

        findCombinations(startIndex + 1, remainingTarget);

        tempList.push(candidates[startIndex]);
        findCombinations(startIndex, remainingTarget - candidates[startIndex]);
        tempList.pop()
    }

    findCombinations(0, target);
    return ans
};

// console.log('Result one: ', combinationSum([2, 3, 5], 8));
console.log('Result two: ', combinationSum([2, 3, 6, 7], 7));
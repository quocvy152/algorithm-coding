/**
 * @param {string[]} operations
 * @return {number}
 */
var calPoints = function (operations) {
    let historyPoint = [];

    for(let index in operations) {
        const historyPointLength = historyPoint.length;
        const lastItem = historyPoint[historyPointLength - 1];
        const itemBeforeLastItem = historyPoint[historyPointLength - 2];

        switch (operations[index]) {
            case "C": {
                historyPoint.pop();
                break;
            }

            case "D": {
                const newScore = lastItem * 2;
                historyPoint.push(newScore);
                break;
            }                
        
            case "+": {
                const newScore = itemBeforeLastItem + lastItem;
                historyPoint.push(newScore);
                break;
            }

            default: {
                historyPoint.push(Number(operations[index]));
                break;
            }
        }
    }
    
    return historyPoint.reduce((prevVal, currVal) => prevVal + currVal, 0);
};

// console.log('Result one: ', calPoints(["5", "2", "C", "D", "+"]));
// console.log('Result two: ', calPoints(["5", "-2", "4", "C", "D", "9", "+", "+"]));
// console.log('Result three: ', calPoints(["1", "C"]));
console.log('Result four: ', calPoints(["1", "+"]));
// console.log('Result five: ', calPoints(["+"]));
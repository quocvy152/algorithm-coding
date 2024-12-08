/**
 * @param {character[][]} board
 * @param {string} word
 * @return {boolean}
 */
var exist = function (board, word) {
    /**
     * Step 1: Tìm được các vị trí root trong ma trận
     */
    const firstItem = 0;
    const listPointRoot = []; // {row: number, col: number}

    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board[firstItem].length; j++) {
            if (board[i][j] == word[firstItem]) {
                listPointRoot.push({ row: i, col: j });
            }
        }
    }

    if (listPointRoot.length == 0) return false;
};

console.log('Result one: ', exist([["A", "B", "C", "E"], ["S", "F", "C", "S"], ["A", "D", "E", "E"]], 'A'))
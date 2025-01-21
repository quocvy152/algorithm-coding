var MyQueue = function() {
    this.queue = [];
};

/** 
 * @param {number} x
 * @return {void}
 */
MyQueue.prototype.push = function(x) {
    this.queue.push(x);
};

/**
 * @return {number}
 */
MyQueue.prototype.pop = function() {
    if(this.queue === 0) 
        return;

    const arrSplice = this.queue.splice(0, 1);

    return arrSplice[0];
};

/**
 * @return {number}
 */
MyQueue.prototype.peek = function() {
    if(this.queue === 0) 
        return;

    const firstItem = this.queue[0];

    return firstItem;
};

/**
 * @return {boolean}
 */
MyQueue.prototype.empty = function() {
    return this.queue.length === 0 ? true : false;
};

/** 
 * Your MyQueue object will be instantiated and called as such:
 * var obj = new MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */

var obj = new MyQueue()

// obj.push(9)
// obj.push(91)
// obj.push(1)
// obj.push(112)

// var param_2 = obj.pop()
// var param_3 = obj.peek()
var param_4 = obj.empty()
console.log("🚀 ~ param_4:", param_4)

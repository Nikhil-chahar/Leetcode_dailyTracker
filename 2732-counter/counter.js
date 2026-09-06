/**
 * @param {number} n
 * @return {Function} counter
 */
//  let cn = 0;
var createCounter = function(n) {
    let ct = n-1;
    return function() {
        ct++;
        return ct;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */
/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let an = [];
    for(let i=0;i<arr.length;i++){
        if(fn(arr[i],i)){
            an.push(arr[i]);
        }
    }

    return an;

};